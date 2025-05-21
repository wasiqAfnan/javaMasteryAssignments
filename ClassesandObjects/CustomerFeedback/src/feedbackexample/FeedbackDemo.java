/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feedbackexample;
import mypackage.SentimentAnalyzer;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class FeedbackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter customer rating (1-5): ");
        int rating = scanner.nextInt();

        SentimentAnalyzer.analyzeFeedback(rating);

        scanner.close();
    }
    
}
