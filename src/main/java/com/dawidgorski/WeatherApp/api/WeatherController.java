package com.dawidgorski.WeatherApp.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String getWeather(Model model) {
        model.addAttribute("weatherAtr", weatherService);
        return "currentWeather";
    }

    @PostMapping("/change_city")
    public String changeCity(@ModelAttribute WeatherService weatherService) {
        this.weatherService.setCity(weatherService.getCity());
        return "redirect:/weather";
    }
}
