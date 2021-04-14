package com.dawidgorski.WeatherApp;

import com.dawidgorski.WeatherApp.api.Weather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
//@EnableScheduling
//@ComponentScan(basePackages = "com.dawidgorski.WeatherApp.api")
public class WeatherAppApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(WeatherAppApplication.class, args);
           Weather weather =new Weather("Kozienice");
	}

}
