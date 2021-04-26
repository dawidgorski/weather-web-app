package com.dawidgorski.WeatherApp.api;

import org.json.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class WeatherAPI {

    String city;

    public WeatherAPI(@Value("Warsaw") String city) {
        this.city = city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    private HttpResponse<String> configureHTTP(Boolean current) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        String uri = current ? "http://api.weatherbit.io/v2.0/current?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&language=en" : "https://api.weatherbit.io/v2.0/forecast/daily?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&days=13";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri + "&city=" + city))
                .build();
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    private JSONObject getJsonObject(HttpResponse<String> response) throws JSONException {
        HttpResponse<String> responseCurrent = response;
        JSONObject jsonObject = new JSONObject(responseCurrent.body());
        return jsonObject;
    }

    //  @Scheduled(fixedRateString = "60000")
    // @Scheduled(cron = "1 * * * * *")
    public List<String> showWeather() throws IOException, InterruptedException, JSONException {

        HttpResponse<String> responseForecast = configureHTTP(false);
        JSONObject jsonObjectForecast = getJsonObject(responseForecast);
        JSONArray jsonArrayForecast = jsonObjectForecast.getJSONArray("data");
        int arrayForecastLength = jsonArrayForecast.length();
        List<String> twoWeeksForecast = new ArrayList<>();

        String city_name = jsonObjectForecast.getString("city_name");
        String country_code = jsonObjectForecast.getString("country_code");
        Double lon = jsonObjectForecast.getDouble("lon");
        Double lat = jsonObjectForecast.getDouble("lat");
        StringBuilder header =new StringBuilder();
        header.append(city_name);
        header.append(" ");
        header.append(country_code);
        header.append(" ");
        header.append(lon);
        header.append(" ");
        header.append(lat);
        twoWeeksForecast.add(header.toString());
        for (int i = 0; i < arrayForecastLength; i++) {

            JSONObject jsonObjectForecast2 = (JSONObject) jsonArrayForecast.get(i);

            int temp = jsonObjectForecast2.getInt("temp");
            String date = jsonObjectForecast2.getString("datetime");
            double windSpeed = jsonObjectForecast2.getDouble("wind_spd");
            String windDirection = jsonObjectForecast2.getString("wind_cdir_full");
            double max_temp = jsonObjectForecast2.getDouble("max_temp");
            double min_temp = jsonObjectForecast2.getDouble("min_temp");

            String description = jsonObjectForecast2.getJSONObject("weather").getString("description");
            String icon = jsonObjectForecast2.getJSONObject("weather").getString("icon");

            String dailyForecast = date + " " + temp + "\u00B0C " + description + ", " + icon + ", " + "wind: " + String.format("%.1f", windSpeed * 3.6) + " km/h " + windDirection + ", mintemp = " + min_temp + ", maxtemp = " + max_temp;
            twoWeeksForecast.add(dailyForecast);
            System.out.println(dailyForecast);
        }

        return twoWeeksForecast;
    }
}
