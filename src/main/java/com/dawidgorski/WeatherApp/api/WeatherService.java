package com.dawidgorski.WeatherApp.api;

import com.dawidgorski.WeatherApp.model.Datum;
import com.dawidgorski.WeatherApp.model.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class WeatherService {
    String city;
    List<String> forecastList;

    public WeatherService(@Value("Warsaw") String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String formatLocalDate(Datum datum) {
        String[] localDateArray = datum.getDatetime().split("-");
        LocalDate ld = LocalDate.of(Integer.parseInt(localDateArray[0]), Integer.parseInt(localDateArray[1]), Integer.parseInt(localDateArray[2]));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E dd.MM", new Locale("en"));
        return ld.format(dateTimeFormatter);
    }

    private Double formatWindSpd(Datum datum) {
        double scale = Math.pow(10, 1);
        return Math.round(datum.getWindSpd() * 3.6 * scale) / scale;
    }

    public WeatherForecast setDatumInWeatherForecast(WeatherForecast weatherForecast) {
        List<Datum> datumList = weatherForecast.getData();
        for (Datum datum : datumList) {
            datum.setDatetime(formatLocalDate(datum));
            datum.setWindSpd(formatWindSpd(datum));
        }
        return weatherForecast;
    }

    public List<Datum> getForecastDatum() {
        return getWeatherForecast().getData();
    }

    public WeatherForecast getWeatherForecast() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherForecast> exchange = restTemplate.exchange("https://api.weatherbit.io/v2.0/forecast/daily?key=f5847edaf6ff4abfa8c66bfd33c3cf2e&days=13&lang=en&city=" + city,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                WeatherForecast.class);
        return setDatumInWeatherForecast(exchange.getBody());
    }
}
