/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingexample;
import mypackage.ParkingCalculator;
import java.util.Scanner;
/**
 *
 * @author Afnan's Laptop
 */
public class ParkingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (Bike/Car/Bus): ");
        String vehicleType = scanner.next();

        System.out.print("Enter number of hours parked: ");
        int hours = scanner.nextInt();

        int totalCharge = ParkingCalculator.calculateCharge(vehicleType, hours);

        if (totalCharge > 0) {
            System.out.println("Total Parking Charge: ₹" + totalCharge);
        }

        scanner.close();
    }
    
}
