/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import mypackage.HeterogeneousArray;
import java.util.Scanner;
/**
 *
 * @author Afnan's Laptop
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array with size 5
        HeterogeneousArray array = new HeterogeneousArray(5);

        // Adding different types of elements
        array.addElement(0, 42); // Integer
        array.addElement(1, 3.14); // Double
        array.addElement(2, "Hello World"); // String
        array.addElement(3, true); // Boolean
        array.addElement(4, 'A'); // Character

        // Displaying the array contents
        array.displayArray();

        scanner.close();
    }
    
}
