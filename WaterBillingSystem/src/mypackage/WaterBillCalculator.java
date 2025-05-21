/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class WaterBillCalculator {
    public static int calculateBill(int consumption) {
        int bill = 0;

        if (consumption <= 30) {
            bill = consumption * 2;
        } else if (consumption <= 100) {
            bill = (30 * 2) + ((consumption - 30) * 3);
        } else {
            bill = (30 * 2) + (70 * 3) + ((consumption - 100) * 5);
        }

        return bill;
    }
}
