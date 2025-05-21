/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Afnan's Laptop
 */
public class Bike extends Vehicle{
    private double mileage;

    public Bike(String brand, double speed, double mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike - Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h, Mileage: " + mileage + " km/l");
    }
}
