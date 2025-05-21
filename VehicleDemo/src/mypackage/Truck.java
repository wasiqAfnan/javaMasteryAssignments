/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Truck extends Vehicle {
    private int loadLimit;

    // Constructor
    public Truck(int speed, int noOfWheels, int loadLimit) {
        super(speed, noOfWheels);
        this.loadLimit = loadLimit;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Truck: " + super.toString() + ", Load Limit: " + loadLimit + " kg";
    }
}
