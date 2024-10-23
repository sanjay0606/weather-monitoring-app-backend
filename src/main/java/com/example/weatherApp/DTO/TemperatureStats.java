package com.example.weatherApp.DTO;

import java.time.LocalDateTime;

public class TemperatureStats {

    private Double minTemp;
    private Double maxTemp;
    private Double avgTemp;
    private LocalDateTime timestamp;

    public TemperatureStats(Double minTemp, Double maxTemp, Double avgTemp, LocalDateTime timestamp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.avgTemp = avgTemp;
        this.timestamp = timestamp;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
