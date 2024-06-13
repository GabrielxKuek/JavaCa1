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
        new Student("Rafael Thet Khine", "p6969420", "DIT03", new Module[0]),
        new Student("Gabriel Macam", "p6942069", "DIT09", new Module[0]),
        new Student("Kevin Kuek", "p996942", "DISM72", new Module[0]),
        new Student("Darren Lin", "p253647", "DAAA99", new Module[0])
    };
    
    // another poop
    public static Student[] removeElementByIndex(Student[] array, int indexToRemove) {
        if (array == null || indexToRemove < 0 || indexToRemove >= array.length) {
            return array;
        }
        
        Student[] newArray = new Student[array.length - 1];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }
    
    // poop use case method poop
    
    public void create_student(String name, String adminNo, String classes, Module[] modules) {
        Student newStudent = new Student(name, adminNo, classes, modules);
        Student[] updatedStudents = new Student[students.length+1];
        
        // copy original array into temporary array
        for(int i = 0; i < students.length; i++){
            updatedStudents[i] = students[i];
        }        
        
        updatedStudents[students.length] = newStudent;
        
        students = updatedStudents;
    }
    
    public void delete_student(String adminNumber) {
        int iterations = 0;
        
        for (Student student : students) {
            if (student.getAdminNo().equals(adminNumber)) {
                break;
            }
            
            iterations++;
        }
        
        students = removeElementByIndex(students, iterations);
    }
    
    public void display_student() {
        int iterations = 0;
        String message = "";
        
        for(Student student : students){
            iterations++;
            message += String.format("Student %s:\n\n", iterations);
            message += "Name: " + student.getName() + "\n";
            message += "Admin No.: " + student.getAdminNo()+ "\n";
            message += "Class: " + student.getClasses() + "\n";
            message += "Modules Taken:\n";
            
            for (Module module : student.getModules_Taken()) {
                iterations++;
                message += String.format("%s. %s/%s/%s: %s\n", 
                        iterations, 
                        module.getModule_cd(), 
                        module.getModule_name(), 
                        module.getCredit_units(), 
                        module.getStudent_marks()
                );
                
            }
        }
        
        JOptionPane.showMessageDialog(null,
                message,
                "All Student Report",
                JOptionPane.INFORMATION_MESSAGE
            );
    }
    
    public void search_studentName() {
        // config
        String userInputForName = JOptionPane.showInputDialog(null,
                "Enter the student name to search", "Search",
                JOptionPane.QUESTION_MESSAGE);
        
        String message = "";
        int iterations = 0;
        
        // business logic
        for(Student student : students){
            message += "Name: " + student.getName() + "\n";
            message += "Admin No.: " + student.getAdminNo()+ "\n";
            message += "Class: " + student.getClasses() + "\n";
            
            message += "Modules Taken:\n";
            
            for (Module module : student.getModules_Taken()) {
                iterations++;
                message += String.format("%s. %s/%s/%s: %s\n", 
                        iterations, 
                        module.getModule_cd(), 
                        module.getModule_name(), 
                        module.getCredit_units(), 
                        MarksGrade.getGrade(module.getStudent_marks())
                );
                
            }
            
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
