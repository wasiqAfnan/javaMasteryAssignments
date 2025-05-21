/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Car extends Vehicle {
    private int noOfPassengers;

    // Constructor
    public Car(int speed, int noOfWheels, int noOfPassengers) {
        super(speed, noOfWheels);
        this.noOfPassengers = noOfPassengers;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Car: " + super.toString() + ", Passengers: " + noOfPassengers;
    }
}