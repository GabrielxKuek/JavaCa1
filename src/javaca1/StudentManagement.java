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
    public static Student[] students = {
        new Student("Rafael Thet Khine", "p6969420", "DIT03", new Module[] {new Module("ST0405", "GabrielStudys", 4, 79)}),
        new Student("Gabriel Macam", "p6942069", "DIT09", new Module[] {new Module("ST0504", "DarrenStudys", 3, 80.5)}),
        new Student("Kevin Kuek", "p996942", "DIT03", new Module[] {new Module("ST0690", "KevinGayStudys", 3, 60)}),
        new Student("Darren Lin", "p253647", "DAAA99", new Module[] {
            new Module("ST0420", "RafaelHonestStudys", 4, 79.4),
            new Module("ST0690", "KevinGayStudys", 3, 60)
        })
    };
    
    // poop use case method poop
    
    public static void create_student(String name, String adminNo, String classes, Module[] modules) {
        Student newStudent = new Student(name, adminNo, classes, modules);
        Student[] updatedStudents = new Student[students.length+1];
        
        // copy original array into temporary array
        for(int i = 0; i < students.length; i++){
            updatedStudents[i] = students[i];
        }        
        
        updatedStudents[students.length] = newStudent;
        
        students = updatedStudents;
    }
    
    public static void delete_student(String adminNumber) {
        int iterations = 0;
        
        for (Student student : students) {
            if (student.getAdminNo().equals(adminNumber)) {
                break;
            }
            
            iterations++;
        }
        
        students = arrayUtils.removeStudentElementByIndex(students, iterations);
    }
    
    public static void display_student() {
        int studentCount = 0;
        String message = "";
        
        for(Student student : students){
            studentCount++;
            int moduleCount = 0;
            
            message += String.format("Student %s:\n\n", studentCount);
            message += "Name: " + student.getName() + "\n";
            message += "Admin No.: " + student.getAdminNo()+ "\n";
            message += "Class: " + student.getClasses() + "\n";
            message += "Modules Taken:\n";
            
            for (Module module : student.getModules_Taken()) {
                moduleCount++;
                message += String.format("%s. %s/%s/%s: %s\n", 
                        moduleCount, 
                        module.getModule_cd(), 
                        module.getModule_name(), 
                        module.getCredit_units(), 
                        module.getStudent_marks()
                );
            }
            message += "-----------------\n";
        }
        
        JOptionPane.showMessageDialog(null,
                message,
                "All Student Report",
                JOptionPane.INFORMATION_MESSAGE
            );
    }
    
    public static void search_studentName() {
        // config
        String userInputForName = JOptionPane.showInputDialog(null,
                "Enter the student name to search", "Search",
                JOptionPane.QUESTION_MESSAGE);
        
        String message = "";
        int iterations = 0;
        boolean studentFound = false;
        
        // business logic
        for(Student student : students){
            if(student.getName().equalsIgnoreCase(userInputForName.trim())){
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
            studentFound = true;
            break;
            
          }   
            
        }
        
        if(!studentFound){
            JOptionPane.showMessageDialog(null,
                    "Cannot find the student \"" + userInputForName + "\"!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
            JOptionPane.showMessageDialog(null,
            message,
            "Search Results",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public static void search_studentClass(String classInput) {
        // create temporary arrays to store values
        int qty = 0;
        double totalGPA = 0.0;
        boolean classFound = false;
        
        // updates temporary arrays
        for (Student student : students) {
            if (student.getClasses().equalsIgnoreCase(classInput.trim())) {
                qty += 1;
                totalGPA += student.calculateGPA();
                classFound = true;
            }
        }      
        
        if(!classFound){
            JOptionPane.showMessageDialog(null,
                    "No students found in class " + classInput + "!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Dialog Box Config
        double averageGPA = qty > 0 ? totalGPA / qty : 0;
        
        String message = String.format(
                "Number of student(s) in %s: %d\nAverage GPA: %.2f",
                classInput, qty, averageGPA
            );
        
        JOptionPane.showMessageDialog(null,
                message,
                "Class Summary",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
