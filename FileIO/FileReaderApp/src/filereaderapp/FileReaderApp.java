/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereaderapp;

import mypackage.FileProcessor;
import java.util.Scanner;

public class FileReaderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = scanner.nextLine();

        FileProcessor processor = new FileProcessor(fileName);
        processor.readFile();
    }
}

