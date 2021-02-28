package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her
        WeatherInfo wi = new WeatherInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city to get the weather and temperature - Delhi, Mumbai, Chennai, Kolkata");
        String loc = sc.next();
        System.out.println(wi.getWeather(loc));

        System.out.println("Enter city to get the weather and temperature - Delhi, Mumbai, Chennai, Kolkata");
        loc = sc.next();
        System.out.println(wi.getWeather(loc));
    }
}
