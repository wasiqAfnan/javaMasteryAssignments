/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurrentfilereadwrite;

import fileprocessor.FileProcessor;
import fileprocessor.FileReaderThread;
import fileprocessor.FileWriterThread;

/**
 *
 * @author Afnan's Laptop
 */
public class ConcurrentFileReadWrite {
    public static void main(String[] args) {
       // File paths - change these as needed
        String sourceFile = "src/Files/input.txt";
        String destFile = "src/Files/output.txt";
        
        FileProcessor processor = new FileProcessor();
        
        // Create threads
        Thread readerThread = new Thread(new FileReaderThread(processor, sourceFile));
        Thread writerThread = new Thread(new FileWriterThread(processor, destFile));
        
        // Start threads
        writerThread.start(); // Writer starts first but will wait
        readerThread.start();
        
        try {
            // Wait for threads to complete
            readerThread.join();
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("File processing completed.");
    }
    
}
