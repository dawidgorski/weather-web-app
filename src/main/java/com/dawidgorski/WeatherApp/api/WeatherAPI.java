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

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Weather {

    String city;

    public Weather(@Value("Warsaw") String city) throws IOException, InterruptedException {
        this.city = city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //  @Scheduled(fixedRateString = "60000")
    // @Scheduled(cron = "1 * * * * *")
    public String showWeather() throws IOException, InterruptedException, JSONException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest requestCurrent = HttpRequest.newBuilder()
                .uri(URI.create("http://api.weatherbit.io/v2.0/current?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&language=en&city=" + city))
                .build();
        HttpResponse<String> responseCurrent = httpClient.send(requestCurrent, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObjectCurrent = new JSONObject(responseCurrent.body());
        JSONArray jsonArrayCurrent = jsonObjectCurrent.getJSONArray("data");
        JSONObject jsonObjectCurrent2 = (JSONObject) jsonArrayCurrent.get(0);

        HttpRequest requestForecast = HttpRequest.newBuilder()
                .uri(URI.create("https://api.weatherbit.io/v2.0/forecast/daily?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&days=13&city=" + city))
                .build();
        HttpResponse<String> responseForecast = httpClient.send(requestForecast, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObjectForecast = new JSONObject(responseCurrent.body());
        JSONArray jsonArrayForecast = jsonObjectForecast.getJSONArray("data");
        int arrayForecastLength = jsonArrayForecast.length();
        for(int i=0; i<arrayForecastLength;i++){
            JSONObject jsonObjectForecast2 = (JSONObject) jsonArrayForecast.get(i);
        }





        int temp = jsonObjectCurrent2.getInt("app_temp");
        double windSpeed = jsonObjectCurrent2.getDouble("wind_spd");
        String windDirection = jsonObjectCurrent2.getString("wind_cdir_full");
        String cityName = jsonObjectCurrent2.getString("city_name");
        String description = jsonObjectCurrent2.getJSONObject("weather").getString("description");
        String result = cityName + ": " + temp + "\u00B0C " + description + ", " + "wind: " + String.format("%.1f", windSpeed*3.6) + " km/h " + windDirection;
        System.out.println(result);
        return result;
    }
}
