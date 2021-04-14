package com.dawidgorski.WeatherApp.api;

import org.json.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class Weather {
    public Weather() {
    }

    String city;
    public Weather(@Value("Warsaw") String city) throws IOException, InterruptedException {
        this.city =city;
        showWeather();
    }

    //  @Scheduled(fixedRateString = "60000")
   // @Scheduled(cron = "1 * * * * *")
    public String showWeather() throws IOException, InterruptedException, JSONException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.weatherbit.io/v2.0/current?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&city="+city))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObject =new JSONObject(response.body());

        JSONArray jsonArray =  jsonObject.getJSONArray("data");
        JSONObject jsonObject2 = (JSONObject) jsonArray.get(0);

         int temp = jsonObject2.getInt("app_temp");
         double windSpeed = jsonObject2.getDouble("wind_spd");
         String windDirection = jsonObject2.getString("wind_cdir_full");
         String description = jsonObject2.getJSONObject("weather").getString("description");
        // String temp =jsonArray.get("app_temp");
        String result="temp: " + temp + " wind speed: " + windSpeed+" direction:" + windDirection + " description: " + description;
        System.out.println(result);
        return result;
    }
}
