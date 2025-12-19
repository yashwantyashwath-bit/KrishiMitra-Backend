package com.krishimitra.dto;

public class WeatherSummaryDto {
    private double avgTemp;
    private double rainfall;
    private double humidity;

    public double getAvgTemp() { return avgTemp; }
    public void setAvgTemp(double avgTemp) { this.avgTemp = avgTemp; }

    public double getRainfall() { return rainfall; }
    public void setRainfall(double rainfall) { this.rainfall = rainfall; }

    public double getHumidity() { return humidity; }
    public void setHumidity(double humidity) { this.humidity = humidity; }
}
