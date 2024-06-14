/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Gabriel Kuek
 * 
 * to-do: 
 * - pressing "Cancel" on the prompts leads to errors
 * 
 */

// import 
import javax.swing.JOptionPane;

public class StudentAdminView {
    // config
    private static String userSelection = "";
    private static String programName = "Student Admin System";
    
    private static boolean repeatMenu = true;
    private static boolean repeatOption = false;
    
    // display menu
    public static void showMenu() {
        do {
            userSelection = JOptionPane.showInputDialog(null,
                    """
                        Enter your option:

                        1. Add new student
                        2. Delete student
                        3. Add new module for student
                        4. Quit
                    """,
                    programName,
                    JOptionPane.QUESTION_MESSAGE
            ).trim();

            switch (userSelection) {
                case "1":
                    do {
                        addNewStudent();
                    } while (repeatOption);
                    
                    break;

                case "2":
                    do {
                        deleteStudent();
                    } while (repeatOption);
                    
                    break;

                case "3":
                    do {
                        addNewModule();
                    } while (repeatOption);
                    
                    break;
                    
                case "4":
                    repeatMenu = false;
                    
                    break;

                default:
                    errorMessage();
                    
            }
        } while (repeatMenu);
    }
    
    // add new student
    public static void addNewStudent() { // todo: add error hadnling
        // config
        String name = "";
        String adminNumber = "";
        String classes = "";
        Module[] modules_taken = new Module[0];
        int noOfModulesTaken = 0;
        
        try {
            name = JOptionPane.showInputDialog(null,
                    "Enter name:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

            adminNumber = JOptionPane.showInputDialog(null,
                    "Enter Admin:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

            classes = JOptionPane.showInputDialog(null,
                    "Enter Class:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

            noOfModulesTaken = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                        "Enter number of Modules Taken:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim()
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
                ).trim();

                moduleName = JOptionPane.showInputDialog(null,
                    "Enter Module Name for module" + i + ":",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

                creditUnit = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                        "Enter Credit Unit for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim()
                );

                moduleMarks = Float.parseFloat(
                    JOptionPane.showInputDialog(null,
                        "Enter Module Marks for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim()
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
            
            repeatOption = false;
            
        } catch (Exception e) {
            errorMessage();
            repeatOption = true;
            
        }
    }
    
    // delete student
    public static void deleteStudent() {
        // config
        String adminNo = "";
        int iterations = 0;
        
        try {
            adminNo = JOptionPane.showInputDialog(null,
                "Enter admin number of student:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            ).trim();

            for (Student student : StudentManagement.students) {
                if (student.getAdminNo().equals(adminNo)) {
                    StudentManagement.students = arrayUtils.removeStudentElementByIndex(StudentManagement.students, iterations);

                    JOptionPane.showMessageDialog(null,
                            "Student deleted!",
                            programName,
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    
                    repeatOption = false;

                    break;

                } else if (iterations == StudentManagement.students.length - 1) {
                    JOptionPane.showMessageDialog(null,
                            "Student not found!",
                            programName,
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    
                    repeatOption = true;
                    // means end of loop and will automatically break

                }

                iterations++;
            }
            
        } catch (Exception e) {
            errorMessage();
            repeatOption = true;
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
        
        try {
            adminNo = JOptionPane.showInputDialog(null,
                "Enter admin number of student:",
                programName,
                JOptionPane.QUESTION_MESSAGE
            ).trim();

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
                ).trim();

                moduleName = JOptionPane.showInputDialog(null,
                    "Enter Module Name for module:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

                creditUnit = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                        "Enter Credit Unit for module:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim()
                );

                moduleMarks = Float.parseFloat(
                    JOptionPane.showInputDialog(null,
                        "Enter Module Marks for module:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim()
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
            
            repeatOption = false;
            
        } catch (Exception e) {
            errorMessage();
            
            repeatOption = true;
        }
    }
    
    public static void errorMessage() {
        JOptionPane.showMessageDialog(null,
                "Invalid input! Please try again.",
                programName,
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    // temporary - just for debugging and testing
    public static void main(String[] args) {
        showMenu();
        
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
