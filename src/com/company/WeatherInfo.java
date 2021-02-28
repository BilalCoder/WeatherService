package com.company;

public class WeatherInfo implements TodaysWeather, Temperature{

    @Override
    public String getWeather(String location) {
        //String loc = location;
        for (int i = 0; i < 4; i++) {
            if (location.equals(TodaysWeather.location[i])) {
                return "The weather in " + location + " is " + weather[i] + " and the temperature is " + temp[i] + " Degrees";
            }
        }
        return "Location " + location + " invalid";
    }
}
