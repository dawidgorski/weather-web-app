package com.dawidgorski.WeatherApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class WeatherController {
    @Autowired
    WeatherClient weatherClient;

    @GetMapping("/weather")
    public String getWeather(Model model) {
        model.addAttribute("weatherAtr", weatherClient);
        return "currentWeather";
    }

    @PostMapping("/change_city")
    public String changeCity(@ModelAttribute WeatherClient weatherClient) {
        this.weatherClient.setCity(weatherClient.getCity());
        return "redirect:/weather";
    }
}
