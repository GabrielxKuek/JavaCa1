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
        }),
        new Student("Alice Lim", "p7890123", "DIT/FT/2B/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 88),
            new Module("ST0503", "FOP", 5, 72)
        }),
        new Student("Bob Tan", "p4567890", "DIT/FT/2B/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 79),
            new Module("ST0503", "FOP", 5, 81)
        }),
        new Student("Catherine Lee", "p2345678", "DIT/FT/2C/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 85),
            new Module("ST0503", "FOP", 5, 90)
        }),
        new Student("David Wong", "p3456789", "DIT/FT/2C/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 77),
            new Module("ST0503", "FOP", 5, 83)
        }),
        new Student("Emily Lim", "p5678901", "DIT/FT/2D/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 92),
            new Module("ST0503", "FOP", 5, 79)
        }),
        new Student("Frankie Tan", "p7890123", "DIT/FT/2D/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 81),
            new Module("ST0503", "FOP", 5, 88)
        }),
        new Student("Grace Lim", "p9012345", "DIT/FT/2E/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 86),
            new Module("ST0503", "FOP", 5, 85)
        }),
        new Student("Henry Ng", "p1234567", "DIT/FT/2E/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 78),
            new Module("ST0503", "FOP", 5, 91)
        }),
        new Student("Ivy Tan", "p2345678", "DIT/FT/2F/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 90),
            new Module("ST0503", "FOP", 5, 82)
        }),
        new Student("Jack Lim", "p3456789", "DIT/FT/2F/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 84),
            new Module("ST0503", "FOP", 5, 87)
        }),
        new Student("Karen Wong", "p4567890", "DIT/FT/2G/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 76),
            new Module("ST0503", "FOP", 5, 93)
        }),
        new Student("Leonard Lim", "p5678901", "DIT/FT/2G/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 82),
            new Module("ST0503", "FOP", 5, 89)
        }),
        new Student("Mary Tan", "p6789012", "DIT/FT/2H/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 91),
            new Module("ST0503", "FOP", 5, 80)
        }),
        new Student("Nathan Ng", "p7890123", "DIT/FT/2H/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 79),
            new Module("ST0503", "FOP", 5, 84)
        }),
        new Student("Olivia Lim", "p8901234", "DIT/FT/2I/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 87),
            new Module("ST0503", "FOP", 5, 86)
        }),
        new Student("Peter Tan", "p9012345", "DIT/FT/2I/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 80),
            new Module("ST0503", "FOP", 5, 92)
        }),
        new Student("Queenie Lim", "p0123456", "DIT/FT/2J/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 83),
            new Module("ST0503", "FOP", 5, 88)
        }),
        new Student("Richard Tan", "p1234567", "DIT/FT/2J/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 85),
            new Module("ST0503", "FOP", 5, 81)
        }),
        new Student("Samantha Lim", "p2345678", "DIT/FT/2K/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 88),
            new Module("ST0503", "FOP", 5, 77)
        }),
        new Student("Thomas Ng", "p3456789", "DIT/FT/2K/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 79),
            new Module("ST0503", "FOP", 5, 89)
        }),
        new Student("Ursula Tan", "p4567890", "DIT/FT/2L/01", new Module[] {
            new Module("ST0509", "JPRG", 4, 90),
            new Module("ST0503", "FOP", 5, 83)
        }),
        new Student("Victor Lim", "p5678901", "DIT/FT/2L/02", new Module[] {
            new Module("ST0509", "JPRG", 4, 82),
            new Module("ST0503", "FOP", 5, 91)
        }),
        
//If there's only 1 student on a page, that page won't be displayed and will be
//redirected to the menu after student 26: Victor Lim
        
//        new Student("Sam Oh", "p123456", "DIT/FT/2N/05", new Module[] {
//            new Module("ST0509", "JPRG", 4, 60),
//            new Module("ST0503", "FOP", 5, 60)
//        })
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
                            JOptionPane.INFORMATION_MESSAGE,
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
