/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weatherexample;
import mypackage.TemperatureAnalyzer;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class WeatherDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature (°C): ");
        int temperature = scanner.nextInt();

        TemperatureAnalyzer.analyzeTemperature(temperature);

        scanner.close();
    }
    
}
