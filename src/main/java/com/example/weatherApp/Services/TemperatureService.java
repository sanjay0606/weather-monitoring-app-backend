package com.example.weatherApp.Services;


import com.example.weatherApp.DTO.TemperatureStats;
import com.example.weatherApp.entity.Temperature;
import com.example.weatherApp.repositry.TemperatureRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TemperatureService {


    @Autowired
    TemperatureRepositry temperatureRepositry;


    public Temperature saveTemperature(double minTemp,double maxTemp){
        Temperature temperature=new Temperature(minTemp,maxTemp,java.time.LocalDateTime.now());
        temperatureRepositry.save(temperature);
        return temperature;
    }

    public List<Temperature> getAllTemperatures() {
        return temperatureRepositry.findAll();
    }

    public Optional<TemperatureStats> getTemperatureStats() {
        List<Temperature> temps = temperatureRepositry.findAll();

        if (temps.isEmpty()) return Optional.empty();


        double minTemp = temps.stream().mapToDouble(Temperature::getMinTemp).min().orElseThrow();
        double maxTemp = temps.stream().mapToDouble(Temperature::getMaxTemp).max().orElseThrow();
        double avgTemp = (minTemp + maxTemp) / 2;


        TemperatureStats stats = new TemperatureStats( Double.parseDouble(String.format("%.2f", minTemp)),
                Double.parseDouble(String.format("%.2f", maxTemp)),
                Double.parseDouble(String.format("%.2f", avgTemp)),
                LocalDateTime.now());

        return Optional.of(stats);
    }
}
