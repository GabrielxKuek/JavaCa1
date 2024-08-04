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
    public static Student[] students = StudentManagement.students;
    
    // receives input from form
    
    
    // updates student array
    
    // rewrite student.txt based on Student[] students based on StudentManagement.java
    public static void writeStudents() {
        try {
            String tempLine = "";
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/javaca1/student.txt"));
            
            writer.write(students.length);
            writer.newLine();
            
            for (Student student : students) {
                tempLine += student.getClasses();
                tempLine += ";";
                tempLine += student.getAdminNo();
                tempLine += ";";
                tempLine += student.getName();
                tempLine += ";";
                tempLine += student.getModules_Taken().length;
                tempLine += ";";

                for (Module module : student.getModules_Taken()) {
                    tempLine += module.getModule_cd();
                    tempLine += ";";
                    tempLine += module.getModule_name();
                    tempLine += ";";
                    tempLine += module.getCredit_units();
                    tempLine += ";";
                    tempLine += module.getStudent_marks();
                    tempLine += ";";
                }
            }
            
            writer.write(tempLine);
            writer.close();
            
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
