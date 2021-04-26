package com.dawidgorski.WeatherApp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherClient {
    String city;

    public WeatherClient(@Value("Warsaw") String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @EventListener(ApplicationReadyEvent.class)
    public WeatherForecast getWeatherForecast() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherForecast> exchange = restTemplate.exchange("https://api.weatherbit.io/v2.0/forecast/daily?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&days=13&city="+city,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                WeatherForecast.class);
        System.out.println(exchange.getBody());
        return exchange.getBody();

    }
}
