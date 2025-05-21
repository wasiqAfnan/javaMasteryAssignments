/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */

public class SpeedAnalyzer {
    public static void analyzeSpeed(int speed) {
        if (speed < 40) {
            System.out.println("Speed: " + speed + " km/h - Slow");
        } else if (speed >= 40 && speed <= 80) {
            System.out.println("Speed: " + speed + " km/h - Normal");
        } else {
            System.out.println("Speed: " + speed + " km/h - Over Speeding");
        }
    }
}

