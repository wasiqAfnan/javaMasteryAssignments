/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class TemperatureAnalyzer {
     public static void analyzeTemperature(int temperature) {
        if (temperature < 10) {
            System.out.println("Temperature: " + temperature + "°C - Cold");
        } else if (temperature <= 30) {
            System.out.println("Temperature: " + temperature + "°C - Moderate");
        } else {
            System.out.println("Temperature: " + temperature + "°C - Hot");
        }
    }
}
