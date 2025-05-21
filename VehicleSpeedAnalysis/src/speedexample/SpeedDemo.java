/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speedexample;
import mypackage.SpeedAnalyzer;
import java.util.Scanner;


/**
 *
 * @author Afnan's Laptop
 */
public class SpeedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = scanner.nextInt();

        SpeedAnalyzer.analyzeSpeed(speed);

        scanner.close();
    }
    
}
