package com.example.weatherApp.repositry;

import com.example.weatherApp.entity.Temperature;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemperatureRepositry extends MongoRepository<Temperature, String> {
}
