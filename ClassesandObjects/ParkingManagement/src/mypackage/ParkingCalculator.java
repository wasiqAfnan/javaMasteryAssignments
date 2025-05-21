/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class ParkingCalculator {
    public static int calculateCharge(String vehicleType, int hours) {
        int charge = 0;

        if (hours <= 0) {
            System.out.println("Invalid hours! Please enter a value greater than zero.");
            return 0;
        }

        switch (vehicleType.toLowerCase()) {
            case "bike":
                charge = hours * 10;
                break;
            case "car":
                charge = hours * 20;
                break;
            case "bus":
                charge = hours * 30;
                break;
            default:
                System.out.println("Invalid vehicle type! Choose from Bike, Car, or Bus.");
                return 0;
        }

        return charge;
    }
}
