/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Afnan's Laptop
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String employeeID, String name, double basicSalary, double bonus) {
        super(employeeID, name, basicSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Total Salary: " + calculateSalary();
    }
}
