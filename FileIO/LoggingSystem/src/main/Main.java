/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import logger.ErrorLogger;
import logger.LogReader;

public class Main {
    public static void main(String[] args) {
        String logFile = "src/Files/error.log";
        ErrorLogger logger = new ErrorLogger();
        LogReader reader = new LogReader();

        try {
            // Simulate exception
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            logger.logError(e.toString(), logFile);
        }

        try {
            String text = null;
            text.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            logger.logError(e.toString(), logFile);
        }

        // Display the log file content
        reader.displayLogFile(logFile);
    }
}
