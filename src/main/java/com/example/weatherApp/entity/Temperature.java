package com.example.weatherApp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection="temperatures")
public class Temperature {

    @Id
    private String id;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "#.##")
    private double minTemp;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "#.##")
    private double maxTemp;
    private LocalDateTime timestamp;


    public Temperature() {
        this.timestamp = LocalDateTime.now();
    }
    public Temperature(double minTemp, double maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;

    }

    public Temperature(double minTemp, double maxTemp, LocalDateTime timestamp) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
