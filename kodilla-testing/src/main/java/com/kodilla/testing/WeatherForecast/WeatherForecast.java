package com.kodilla.testing.WeatherForecast;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemp() {
        int sum = 0;
        for (Map.Entry <String, Double> averageTemp : temperatures.getTemperatures().entrySet()) {
            sum += averageTemp.getValue();
        }
        double average = sum / temperatures.getTemperatures().entrySet().size();
        return average;

    }
    public double calculateMedianOfTemperature(Map<String, Double> temperatureMap) {

        List<Double> listTemp = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatureMap.entrySet()) {
            listTemp.add(temperature.getValue());
        }

        Collections.sort(listTemp);
        double median;

        if (listTemp.size() % 2 == 0) {
            median = (listTemp.get(listTemp.size() / 2) + listTemp.get(listTemp.size() / 2));
        } else {
            median = listTemp.get(listTemp.size() / 2);
        }
        return median;
    }
}