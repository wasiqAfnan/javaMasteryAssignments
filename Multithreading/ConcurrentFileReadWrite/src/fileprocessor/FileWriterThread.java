/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileprocessor;

public class FileWriterThread implements Runnable {
    private FileProcessor processor;
    private String destPath;

    public FileWriterThread(FileProcessor processor, String destPath) {
        this.processor = processor;
        this.destPath = destPath;
    }

    @Override
    public void run() {
        System.out.println("Writer thread started...");
        processor.writeFile(destPath);
        System.out.println("Writer thread completed.");
    }
}
