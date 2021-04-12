package com.dawidgorski.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
//@ComponentScan(basePackages = "com.dawidgorski.WeatherApp.api")
public class WeatherAppApplication {

	public WeatherAppApplication() {
	}

	public static void main(String[] args) {

		SpringApplication.run(WeatherAppApplication.class, args);
	}

}
