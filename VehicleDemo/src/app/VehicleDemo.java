/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import mypackage.Car;
import mypackage.Truck;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // User input for Car
        System.out.print("Enter Car Speed (km/h): ");
        int carSpeed = scanner.nextInt();

        System.out.print("Enter Car Number of Wheels: ");
        int carWheels = scanner.nextInt();

        System.out.print("Enter Car Number of Passengers: ");
        int carPassengers = scanner.nextInt();

        // User input for Truck
        System.out.print("Enter Truck Speed (km/h): ");
        int truckSpeed = scanner.nextInt();

        System.out.print("Enter Truck Number of Wheels: ");
        int truckWheels = scanner.nextInt();

        System.out.print("Enter Truck Load Limit (kg): ");
        int truckLoadLimit = scanner.nextInt();

        // Creating objects
        Car car = new Car(carSpeed, carWheels, carPassengers);
        Truck truck = new Truck(truckSpeed, truckWheels, truckLoadLimit);

        // Displaying details
        System.out.println("\nVehicle Details:");
        System.out.println(car);
        System.out.println(truck);

        // Comparing speed (without getters)
        if (car.hasSameSpeed(truck)) {
            System.out.println("\nBoth vehicles have the same speed.");
        } else if (car.isFasterThan(truck)) {
            System.out.println("\nThe car is faster than the truck.");
        } else {
            System.out.println("\nThe truck is faster than the car.");
        }

        scanner.close();
    }
    
}
