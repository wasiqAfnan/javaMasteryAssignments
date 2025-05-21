/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileprocessor;
import java.io.*;

public class FileProcessor {
    private boolean isReadComplete = false;
    private String data;

    public synchronized void readFile(String sourcePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            data = content.toString();
            isReadComplete = true;
            notify(); // Notify writer that reading is complete
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void writeFile(String destPath) {
        while (!isReadComplete) {
            try {
                wait(); // Wait until reading is complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))) {
            writer.write(data);
            System.out.println("Data successfully written to destination file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}