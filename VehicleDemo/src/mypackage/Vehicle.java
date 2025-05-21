/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Vehicle {
    private int speed;
    private int noOfWheels;

    // Constructor
    public Vehicle(int speed, int noOfWheels) {
        this.speed = speed;
        this.noOfWheels = noOfWheels;
    }

    // toString method for display
    @Override
    public String toString() {
        return "Speed: " + speed + " km/h, Wheels: " + noOfWheels;
    }

    // Speed comparison method (avoiding getters in main)
    public boolean isFasterThan(Vehicle other) {
        return this.speed > other.speed;
    }

    public boolean hasSameSpeed(Vehicle other) {
        return this.speed == other.speed;
    }
}
