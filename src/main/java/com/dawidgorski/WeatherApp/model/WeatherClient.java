package com.dawidgorski.WeatherApp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherClient {
    String city;
    List<String> forecastList;

    public WeatherClient(@Value("Warsaw") String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getForecastStringList() {
        List<Datum> listDatum = getForecastDatum();
        forecastList = new ArrayList<>();
        for (Datum datum : listDatum) {
            String dailyForecast = datum.getDatetime() + " " + datum.getTemp() + "\u00B0C " + datum.getWeather().getDescription() + ", " + datum.getWeather().getIcon() + ", " + "wind: " + String.format("%.1f", datum.getWindSpd() * 3.6) + " km/h " + datum.getWindCdir() + ", mintemp = " + datum.getMinTemp() + ", maxtemp = " + datum.getMaxTemp();
            forecastList.add(dailyForecast);
        }
        return forecastList;
    }

    public List<Datum> getForecastDatum() {
        return getWeatherForecast().getData();
    }

    public WeatherForecast getWeatherForecast() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherForecast> exchange = restTemplate.exchange("https://api.weatherbit.io/v2.0/forecast/daily?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&days=14&lang=en&city=" + city,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                WeatherForecast.class);

        System.out.println(exchange.getBody());
        return exchange.getBody();

    }
}
