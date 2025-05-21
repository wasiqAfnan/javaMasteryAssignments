/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileprocessor;

public class FileReaderThread implements Runnable {
    private FileProcessor processor;
    private String sourcePath;

    public FileReaderThread(FileProcessor processor, String sourcePath) {
        this.processor = processor;
        this.sourcePath = sourcePath;
    }

    @Override
    public void run() {
        System.out.println("Reader thread started...");
        processor.readFile(sourcePath);
        System.out.println("Reader thread completed.");
    }
}
