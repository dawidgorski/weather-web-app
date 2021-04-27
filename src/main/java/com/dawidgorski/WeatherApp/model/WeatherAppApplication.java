package com.dawidgorski.WeatherApp.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
//@EnableScheduling
//@ComponentScan(basePackages = "com.dawidgorski.WeatherApp.api")
public class WeatherAppApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(WeatherAppApplication.class, args);
        //  Weather weather =new Weather("Kozienice");
    }

}
