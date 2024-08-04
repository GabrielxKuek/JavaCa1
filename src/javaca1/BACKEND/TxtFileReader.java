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
        private final String studentsFile = "student.txt";
    
    public void loadStudentData(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            System.out.println(reader.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
