/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.io.*;
import java.util.Scanner;

public class FileProcessor {
    private String fileName;

    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    public void readFile() {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            if (file.length() == 0) {
                throw new EmptyFileException("The file is empty.");
            }

            Scanner scanner = new Scanner(file);
            System.out.println("File Contents:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (EmptyFileException e) {
            System.out.println(e.toString());
        }
    }
}

