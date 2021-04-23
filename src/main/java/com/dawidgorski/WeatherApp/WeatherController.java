package com.dawidgorski.WeatherApp;

import com.dawidgorski.WeatherApp.api.WeatherAPI;
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
    WeatherAPI weatherAPI;

    @GetMapping("/weather")
    public String getWeather(Model model) throws IOException, InterruptedException {
        model.addAttribute("weatherAtr", weatherAPI);
        return "currentWeather";
    }

    @GetMapping("/form")
    public void showForm() {

    }

    @PostMapping("/change_city")
    public String changeCity(@ModelAttribute WeatherAPI weatherAPI) throws IOException, InterruptedException {
        this.weatherAPI.setCity(weatherAPI.getCity());
        return "redirect:/weather";
    }
}
