package com.dawidgorski.WeatherApp;

import com.dawidgorski.WeatherApp.api.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.IOException;

@Controller
public class WeatherController {
    Weather weather =new Weather();
    @GetMapping("/weather")
    public String getWeather(Model model) throws IOException, InterruptedException {
        model.addAttribute("weatherAtr",weather);
       // return weather.showWeather();
        return "currentWeather";
    }
}
