package com.company;

public interface TodaysWeather {

    String[] location={"Delhi","Mumbai","Chennai","Kolkata"};
    String[] weather={"SUNNY","RAINING","WINDY","SUNNY"};

    public String getWeather(String location);
}
