/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;
import javax.swing.JOptionPane;

/**
 *
 * @author Darren
 */
public class StudentManagement {
    public Student[] students = {
        new Student("Rafael Thet Khine", "p6969420", "DIT03"),
        new Student("Gabriel Macam", "p6942069", "DIT09"),
        new Student("Kevin Kuek", "p996942", "DISM72"),
        new Student("Darren Lin", "p253647", "DAAA99")
    };
    
    public void create_student() {
        
    }
    
    public void display_student() {
        String message = "Student details:\n\n";
        
        for(Student student : students){
            message += "Name: " + student.getName() + "\n";
            message += "Admin No.: " + student.getAdminNo()+ "\n";
            message += "Class: " + student.getClasses() + "\n";
        }
        
        JOptionPane.showMessageDialog(null,
                message,
                "All Student Report",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void search_studentName() {
        String userInputForName = JOptionPane.showInputDialog(null,
                "Enter the student name to search", "Search",
                JOptionPane.QUESTION_MESSAGE);
        
        String message = "";
        
        for(Student student : students){
            message += "Name: " + student.getName() + "\n";
            message += "Admin No.: " + student.getAdminNo()+ "\n";
            message += "Class: " + student.getClasses() + "\n";
        }
    }
    
    public void search_studentClass(String classInput) {
        // create temporary arrays to store values
        int qty = 0;
        double totalGPA = 0.0;
        
        // updates temporary arrays
        for (Student student : students) {
            if (student.getClasses() == classInput) {
                qty += 1;
                totalGPA += student.calculateGPA();
            }
        }      
        
        // Dialog Box Config
        double averageGPA = qty > 0 ? totalGPA / qty : 0;
        
        String message = String.format(
                "Number of student(s) in %s: %d\nAverage GPA: %.2f",
                classInput, qty, averageGPA
            );
        
        JOptionPane.showMessageDialog(null,
                message,
                "All Student Report",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    // do last, with error handling
    public void search_module() {
        
    }
    
    public void print_statistics() {
        
    }
}
