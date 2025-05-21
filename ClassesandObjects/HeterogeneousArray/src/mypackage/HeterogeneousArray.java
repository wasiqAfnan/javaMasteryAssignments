/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class HeterogeneousArray {
    private Object[] dataArray;

    // Constructor to initialize the array
    public HeterogeneousArray(int size) {
        dataArray = new Object[size];
    }

    // Method to add an element at a given index
    public void addElement(int index, Object element) {
        if (index >= 0 && index < dataArray.length) {
            dataArray[index] = element;
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // Method to display all elements in the array
    public void displayArray() {
        System.out.println("Heterogeneous Array Elements:");
        for (Object obj : dataArray) {
            System.out.println(" - " + obj + " (" + obj.getClass().getSimpleName() + ")");
        }
    }
}
