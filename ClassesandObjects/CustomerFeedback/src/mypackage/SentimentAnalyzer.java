/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class SentimentAnalyzer {
    public static void analyzeFeedback(int rating) {
        if (rating == 4 || rating == 5) {
            System.out.println("Rating: " + rating + " - Positive Feedback");
        } else if (rating == 3) {
            System.out.println("Rating: " + rating + " - Neutral Feedback");
        } else if (rating == 1 || rating == 2) {
            System.out.println("Rating: " + rating + " - Negative Feedback");
        } else {
            System.out.println("Invalid Rating! Please enter a value between 1 and 5.");
        }
    }
    
}
