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
        new Student("John Tan", "p2312333", "DIT/FT/2A/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 85),
            new Module("ST0503", "FOP", 5, 75)
        }),
        new Student("Samsudin", "p2312555", "DIT/FT/2A/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 75),
            new Module("ST0503", "FOP", 5, 85)
        }),
        new Student("Kevin Kuek", "p996942", "DIT03", new Module[] {
            new Module("ST0690", "KevinGayStudys", 3, 60)
        }),
        new Student("Darren Lin", "p253647", "DAAA99", new Module[] {
            new Module("ST0420", "RafaelHonestStudys", 4, 79.4),
            new Module("ST0690", "KevinGayStudys", 3, 60)
        })
    };
    

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
                
                if (i % 2 != 0) {                    
                    int response = JOptionPane.showOptionDialog(
                            null,
                            message,
                            "All Student Report",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[] {"Back", "Previous", "Next"},
                            "Next"
                    );

                    // Handling user response
                    switch (response) {
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
                    JOptionPane.INFORMATION_MESSAGE);
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
