package com.example.weatherApp.controllers;


import com.example.weatherApp.DTO.TemperatureStats;
import com.example.weatherApp.Services.TemperatureService;
import com.example.weatherApp.entity.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@ComponentScan
@RestController
@RequestMapping("/api/temperature")
public class TemperatureController {


    @Autowired
    TemperatureService temperatureService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/store")
    public ResponseEntity<Temperature> storeTemperature(@RequestBody Temperature temperatureRequest) {

        Temperature temperature = temperatureService.saveTemperature(temperatureRequest.getMinTemp(), temperatureRequest.getMaxTemp());
        return ResponseEntity.ok(temperature);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/stats")
    public ResponseEntity<TemperatureStats> getTemperatureStats() {
        Optional<TemperatureStats> temperatureStats = temperatureService.getTemperatureStats();

        return temperatureStats.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}
