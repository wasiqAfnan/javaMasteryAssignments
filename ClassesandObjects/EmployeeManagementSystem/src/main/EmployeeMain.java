/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import employee.Employee;
import employee.Manager;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Employee
        System.out.print("Enter Employee ID: ");
        String empID = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Basic Salary: ");
        double empSalary = scanner.nextDouble();

        Employee emp = new Employee(empID, empName, empSalary);
        System.out.println("\nEmployee Details: " + emp);
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        // Taking input for Manager
        scanner.nextLine(); // Clear input buffer
        System.out.print("\nEnter Manager ID: ");
        String mgrID = scanner.nextLine();
        System.out.print("Enter Manager Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Enter Manager Basic Salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.print("Enter Manager Bonus: ");
        double mgrBonus = scanner.nextDouble();

        Manager mgr = new Manager(mgrID, mgrName, mgrSalary, mgrBonus);
        System.out.println("\nManager Details: " + mgr);
        System.out.println("Calculated Salary: " + mgr.calculateSalary());

        scanner.close();
    }
    
}
