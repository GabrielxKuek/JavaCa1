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
    public static Student[] students = StudentManagement.students;
    
    public static String loadStudentData() {
        StringBuilder message = new StringBuilder();
        int moduleCount = 0;
        int studentCount = 1;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/javaca1/student.txt"))) {
            String headerLine = reader.readLine();
            
            if(headerLine != null){
                System.out.println(headerLine);
            }
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                
                if(parts.length < 4){
                    System.err.println("Invalid data format: "+ line);
                    continue;
                }
                
                String classes = parts[0];
                String admNo = parts[1];
                String studName = parts[2];
                int modNo = Integer.parseInt(parts[3]);
                
                Module[] mod = new Module[modNo];
                int index = 4;
                
                for(int i = 0; i < modNo; i++){
                    if(index+3 > parts.length){
                        System.err.print("Invalid data format: "+ line);
                        break;
                    }
                    String modCode = parts[index++];
                    String modName = parts[index++];
                    int creditUnit = Integer.parseInt(parts[index++]);
                    double modMarks = Double.parseDouble(parts[index++]);
                
                    mod[i] = new Module(modCode, modName, creditUnit, modMarks);
                }
                Student student = new Student(studName, admNo, classes, mod);
                
                arrayUtils.pushStudent(student);
                
                message.append(String.format("Student %s:\n", studentCount++));
                message.append("Name: ").append(student.getName()).append("\n");
                message.append("Admin Number: ").append(student.getAdminNo()).append("\n");
                message.append("Class: ").append(student.getClasses()).append("\n");
                message.append("Modules Taken: \n");
                
                for(Module module : student.getModules_Taken()){
                    moduleCount++;
                    
                    double marks = module.getStudent_marks();
                    
                    MarksGrade grade = MarksGrade.getGrade(marks);
                    
                    message.append(String.format("%s: %s/%s/%s: %s\n",
                            moduleCount,
                            module.getModule_cd(),
                            module.getModule_name(),
                            module.getCredit_units(),
                            grade));
                }
                message.append("---------------\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
}
