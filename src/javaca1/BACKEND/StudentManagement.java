/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;
import javax.swing.JOptionPane;

/**
 *
 * @author Darren
 */
public class StudentManagement {
    
    //Student objects
    public static Student[] students = {
    };
    
    //Add new Students
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
    
    //Delete student
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
    
    //Display All Students
    public static void display_student() {
        String message = "";
        
        for(int i = 0; i < students.length; i++){
            int moduleCount = 0;
            
            {
                message += String.format("Student %s:\n", i + 1);
                message += "Name: " + students[i].getName() + "\n";
                message += "Admin No.: " + students[i].getAdminNo()+ "\n";
                message += "Class: " + students[i].getClasses() + "\n";
                message += "Modules Taken:\n";

                for (Module module : students[i].getModules_Taken()) {
                    moduleCount++;

                    double marks = module.getStudent_marks();

                    MarksGrade grade = MarksGrade.getGrade(marks);

                    message += String.format("%s. %s/%s/%s: %s\n", 
                            moduleCount, 
                            module.getModule_cd(), 
                            module.getModule_name(), 
                            module.getCredit_units(), 
                            grade
                    );
                }
                message += "-----------------\n";
                
                if (i % 2 != 0 || i == students.length - 1) {                    
                    int response = JOptionPane.showOptionDialog(
                            null,
                            message,
                            "All Student Report",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            new Object[] {"Back", "Previous", "Next"},
                            "Next"
                    );
                    
                    // Handling user response
                    switch (response) {
                        case JOptionPane.CLOSED_OPTION:
                            utils.terminateProgram();
                            
                        case 0:
                            // select back
                            return;
                            
                        case 1:
                            // select previous
                            if (i != 1) {
                                i -= 4;
                            } else {
                                i -= 2;
                            }
                            message = "";
                            continue;
                            
                        case 2:
                            // select next
                            message = "";
                            break;
                            
                        default:
                            utils.unexpectedErrorMessage("Error");
                            return;
                    }
                    
                }
            }
        }
    }
    
    //Search student by name
    public static void search_studentName() {
        // config
        String userInputForName = "";
        
        while (true) {
            userInputForName = JOptionPane.showInputDialog(null,
                    "Enter the student name to search", "Search",
                    JOptionPane.QUESTION_MESSAGE);

            // error handling
            if (userInputForName == null) {
                StudentEnquiryView.showMenu();
            } else if (userInputForName.equals("")) {
                utils.errorMessage("Error");
                
            } else {
                break;
            }
        }
        
        // business logic
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
            double gpa = student.calculateGPA();    
            message += String.format("\nGPA: %.2f\n", gpa);
            message += "-----------------\n";
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
            "Student Info",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    //Search student by class
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
                    "No students found from class!",
                    "Class Summary",
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
