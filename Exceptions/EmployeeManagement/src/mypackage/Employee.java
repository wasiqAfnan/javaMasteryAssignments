/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

public class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empName, int empAge, double empSalary)throws InvalidAgeException {
        this.empName = empName;
        setAge(empAge);
        this.empSalary = empSalary;
    }
    
    void setAge(int age)throws InvalidAgeException {
        if(empAge < 18 || empAge > 60){
            throw new InvalidAgeException("Invalid Age");
        }
    }

    
    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + '}';
    }    
}

