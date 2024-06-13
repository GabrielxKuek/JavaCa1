/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Gabriel Kuek
 */

// import 
import javax.swing.JOptionPane;

public class StudentAdminView {
    private static String userSelection = "";
    private static String programName = "Student Admin System";
    
    // display menu
    public static void showMenu() {
        JOptionPane.showInputDialog(null,
                """
                    Enter your option:

                    1. Add new student
                    2. Delete student
                    3. Add new module for student
                    4. Quit
                """,
                programName,
                JOptionPane.QUESTION_MESSAGE
        );
        
        switch (userSelection) {
            case "1":
                
                
        }
    }
    
    // add new student
    public static void addNewStudent() { // todo: add error hadnling
        String name = "";
        String adminNumber = "";
        String classes = "";
        Module[] modules_taken = new Module[0];
        int noOfModulesTaken = 0;

        name = JOptionPane.showInputDialog(null,
                "Enter name:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
        
        adminNumber = JOptionPane.showInputDialog(null,
                "Enter Admin:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
        
        classes = JOptionPane.showInputDialog(null,
                "Enter Class:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
        
        noOfModulesTaken = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                    "Enter number of Modules Taken:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
            );
        
        for (int i = 1; i <= noOfModulesTaken; i++) {
            // in each "add module to student" iteration
            String moduleCode = "";
            String moduleName = "";
            int creditUnit = 0;
            double moduleMarks = 0.0;
            
            moduleCode = JOptionPane.showInputDialog(null,
                "Enter Module Code for module" + i + ":",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
            
            moduleName = JOptionPane.showInputDialog(null,
                "Enter Module Name for module" + i + ":",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
            
            creditUnit = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                    "Enter Credit Unit for module" + i + ":",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
            );
            
            moduleMarks = Float.parseFloat(
                JOptionPane.showInputDialog(null,
                    "Enter Module Marks for module" + i + ":",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
            );
            
            // create module with given information
            Module tempModule = new Module(moduleCode, moduleName, creditUnit, moduleMarks);
            
            // add into array of taken modules
            Module[] newModules_taken = new Module[modules_taken.length + 1];
            
            for (int j = 0; j < modules_taken.length; j++) {
                newModules_taken[j] = modules_taken[j];
            }
            
            newModules_taken[modules_taken.length] = tempModule;
            
        }
        
        StudentManagement.create_student(name, adminNumber, classes, modules_taken);

        JOptionPane.showMessageDialog(null, "Success!", programName, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // delete student
    public static void deleteStudent() {
        // config
        String adminNo = "";
        int iterations = 0;
        
        adminNo = JOptionPane.showInputDialog(null,
            "Enter admin number of student:",
            programName,
            JOptionPane.QUESTION_MESSAGE
        );
        
        for (Student student : StudentManagement.students) {
            if (student.getAdminNo().equals(adminNo)) {
                StudentManagement.students = arrayUtils.removeStudentElementByIndex(StudentManagement.students, iterations);
                
                JOptionPane.showMessageDialog(null,
                        "Student deleted!",
                        programName,
                        JOptionPane.INFORMATION_MESSAGE
                );
                
                break;
                
            } else if (iterations == StudentManagement.students.length - 1) {
                JOptionPane.showMessageDialog(null,
                        "Student not found!",
                        programName,
                        JOptionPane.INFORMATION_MESSAGE
                );
                // means end of loop and will automatically break
                
            }
            
            iterations++;
            
        }
        
        
    }
    
    // add new module for student
    public static void addNewModule() {
        // config
        boolean selection;
        String adminNo = "";
        int iterations = 0;
        
        String moduleCode = "";
        String moduleName = "";
        int creditUnit = 0;
        double moduleMarks = 0.0;
        
        adminNo = JOptionPane.showInputDialog(null,
            "Enter admin number of student:",
            programName,
            JOptionPane.QUESTION_MESSAGE
        );
        
        // find student's array index
        for (Student student : StudentManagement.students) {
            if (student.getAdminNo().equals(adminNo)) {
                break;
            }
            
            iterations++;
        }
        
        // code for adding module
        do {
            moduleCode = JOptionPane.showInputDialog(null,
                "Enter Module Code for module:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );

            moduleName = JOptionPane.showInputDialog(null,
                "Enter Module Name for module:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            );

            creditUnit = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                    "Enter Credit Unit for module:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
            );

            moduleMarks = Float.parseFloat(
                JOptionPane.showInputDialog(null,
                    "Enter Module Marks for module:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
            );

            // create module with given information
            Module tempModule = new Module(moduleCode, moduleName, creditUnit, moduleMarks);


            StudentManagement.students[iterations].setModules_taken(
                    arrayUtils.appendModuleElement(
                            StudentManagement.students[iterations].getModules_Taken(), 
                            tempModule
                    )
            );
            
            // checker for loop repetition
            selection = 
                JOptionPane.YES_OPTION ==
                JOptionPane.showConfirmDialog(null, 
                    "Are there any more modules to add?",
                    programName,
                    JOptionPane.YES_NO_OPTION
                );
        } while (selection);
    }
    
    public static void main(String[] args) {
        addNewModule();
        
        for (Student student : StudentManagement.students) {
            System.out.println(student.getName());
            System.out.println(student.getAdminNo());
            System.out.println(student.getClasses());
            System.out.println("----modules taken----");
            for (Module module : student.getModules_Taken()) {
                System.out.println(module.getModule_cd());
                System.out.println(module.getModule_name());
                System.out.println(module.getCredit_units());
                System.out.println(module.getStudent_marks());
            }
            System.out.println("---------------------\n");
        }
    }
}
