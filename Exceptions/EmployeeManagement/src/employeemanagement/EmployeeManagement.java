/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagement;
import mypackage.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee("Subhranil", 100, 10000);
            System.out.println(e1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

