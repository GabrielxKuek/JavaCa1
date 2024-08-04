/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek
 */

// imports
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriter {
    // clear file
    public static void clearFile() {
        try {
            // Open the file in write mode, this will clear the file
            FileWriter fw = new FileWriter("./src/javaca1/student.txt");
            fw.close();
            System.out.println("File cleared successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // rewrite student.txt based on Student[] StudentManagement.students based on StudentManagement.java
    public static void writeStudents() {
        try {
            String tempLine = "";
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/javaca1/student.txt"));
            
            writer.write(String.valueOf(StudentManagement.students.length));
            writer.newLine();
            
            for (Student student : StudentManagement.students) {
                tempLine = "";
                tempLine += student.getClasses();
                tempLine += ";";
                tempLine += student.getAdminNo();
                tempLine += ";";
                tempLine += student.getName();
                tempLine += ";";
                tempLine += String.valueOf(student.getModules_Taken().length);
                tempLine += ";";

                for (Module module : student.getModules_Taken()) {
                    tempLine += module.getModule_cd();
                    tempLine += ";";
                    tempLine += module.getModule_name();
                    tempLine += ";";
                    tempLine += String.valueOf(module.getCredit_units());
                    tempLine += ";";
                    tempLine += String.valueOf(module.getStudent_marks());
                    tempLine += ";";
                }
                
                writer.write(tempLine.toString());
                writer.newLine();
            }
            
            writer.close();
            
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
