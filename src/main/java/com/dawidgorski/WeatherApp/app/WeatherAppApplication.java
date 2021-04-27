package com.dawidgorski.WeatherApp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
//@EnableScheduling
@ComponentScan(basePackages = "com.dawidgorski.WeatherApp")
public class WeatherAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(WeatherAppApplication.class, args);
    }

}
