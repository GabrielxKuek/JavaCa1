/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Darren
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class TxtFileReader {
    private final String filePath = "C:\\Users\\Darren\\OneDrive\\Desktop\\JPRG\\Coding\\JavaCA1\\src\\javaca1\\student.txt"; // Update with your actual file name

    public void loadStudentData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        TxtFileReader reader = new TxtFileReader();
        reader.loadStudentData(); // Call the method to test
    }
}
