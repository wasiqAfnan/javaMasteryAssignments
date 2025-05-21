/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import vehicle.Vehicle;
import vehicle.Car;
import vehicle.Bike;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class VehicleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Car
        System.out.print("Enter Car Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Enter Car Speed (km/h): ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Enter Number of Doors: ");
        int carDoors = scanner.nextInt();

        Car car = new Car(carBrand, carSpeed, carDoors);
        
        scanner.nextLine(); // Clear input buffer

        // Taking input for Bike
        System.out.print("\nEnter Bike Brand: ");
        String bikeBrand = scanner.nextLine();
        System.out.print("Enter Bike Speed (km/h): ");
        double bikeSpeed = scanner.nextDouble();
        System.out.print("Enter Bike Mileage (km/l): ");
        double bikeMileage = scanner.nextDouble();

        Bike bike = new Bike(bikeBrand, bikeSpeed, bikeMileage);

        // Display details using overridden method
        System.out.println("\nVehicle Details:");
        car.displayDetails();
        bike.displayDetails();

        scanner.close();
    }
    
}
