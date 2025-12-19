package com.krishimitra.service;

import com.krishimitra.dto.WeatherSummaryDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public WeatherSummaryDto getWeather(double lat, double lon) {
        WeatherSummaryDto dto = new WeatherSummaryDto();
        dto.setAvgTemp(28);
        dto.setRainfall(750);
        dto.setHumidity(65);
        return dto;
    }
}
