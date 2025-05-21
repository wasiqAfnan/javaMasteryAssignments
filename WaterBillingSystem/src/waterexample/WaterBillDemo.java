/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waterexample;
import mypackage.WaterBillCalculator;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class WaterBillDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water consumption (liters): ");
        int consumption = scanner.nextInt();

        int billAmount = WaterBillCalculator.calculateBill(consumption);
        System.out.println("Total Water Bill: ₹" + billAmount);

        scanner.close();
    }
    
}
