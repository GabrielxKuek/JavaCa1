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
                        4. Logout
                        5. Quit
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
                    utils.loginRedirectMessage();
                    repeatMenu = false;
                    return;
                    
                case "5":
                    repeatMenu = false;
                    userView.isMenuRepeat = false;
                    
                    utils.terminateProgramMessage();
                    
                    break;

                default:
                    utils.errorMessage(programName);
                    
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
            boolean validName = false;
            while(!validName ){
            name = JOptionPane.showInputDialog(null,
                    "Enter name:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();
            
                if(name.length() >= 2 && name.matches("^[a-zA-Z ]+$")){
                    validName = true;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Your name cannot be less than 2 characters or contain any special characters!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            
        boolean validAdmin = false;
        while (!validAdmin) {
            adminNumber = JOptionPane.showInputDialog(null,
                    "Enter Admin Number:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
            ).trim();

            // Check if adminNumber starts with 'p' and followed by integers
            if (adminNumber.matches("^p\\d+$")) {
                validAdmin = true;
            } else if (adminNumber.matches("^\\d+$")) {
                // If user forgot 'p', prepend 'p' automatically
                adminNumber = "p" + adminNumber;
                validAdmin = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Admin Number must start with 'p' and followed by integers, or just integers.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        boolean validClass = false;
        while(!validClass){
            classes = JOptionPane.showInputDialog(null,
                    "Enter Class:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();
            
            if(classes.matches("^[a-zA-Z]+/[a-zA-Z]+/\\d+[A-Za-z]/\\d+$")){
                validClass = true;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Input must be capitalized and must follow the exact format!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
            noOfModulesTaken = 0; // Initialize outside the try-catch block

        boolean validNoOfModules = false;
        while (!validNoOfModules) {
            try {
                String input = JOptionPane.showInputDialog(null,
                    "Enter number of Modules Taken:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                ).trim();

            // Attempt to parse input to integer
            noOfModulesTaken = Integer.parseInt(input);

        // Check if input is a positive integer
        if (noOfModulesTaken > 0) {
            validNoOfModules = true; // Exit loop if input is valid
        } else {
            JOptionPane.showMessageDialog(null,
                    "Number of Modules Taken must be a positive integer.",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Catch exception if input cannot be parsed to integer
        JOptionPane.showMessageDialog(null,
                "Invalid input. Please enter a valid integer.",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE);
    }
}

            for (int i = 1; i <= noOfModulesTaken; i++) {
                // in each "add module to student" iteration
                String moduleCode = "";
                String moduleName = "";
                int creditUnit = 0;
                double moduleMarks = 0.0;

                boolean validModuleCode = false;
                while(!validModuleCode){
                    moduleCode = JOptionPane.showInputDialog(null,
                        "Enter Module Code for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim();
                    
                    if(moduleCode.matches("^[A-Z0-9]+$")){
                        validModuleCode = true;
                    }else{
                        JOptionPane.showMessageDialog(null,
                        "Module Code is invalid. Please try again!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }

                boolean validModuleName = false;
                while(!validModuleName){
                    moduleName = JOptionPane.showInputDialog(null,
                        "Enter Module Name for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    ).trim();
                    
                    if(moduleName.matches("^[a-zA-Z ]+$")){
                        validModuleName = true;
                    }else{
                        JOptionPane.showMessageDialog(null,
                        "Module Name is invalid. Please try again!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }

//                creditUnit = Integer.parseInt(
//                    JOptionPane.showInputDialog(null,
//                        "Enter Credit Unit for module" + i + ":",
//                        programName,
//                        JOptionPane.QUESTION_MESSAGE
//                    ).trim()
//                );

                creditUnit = 0;
                boolean validCreditUnit = false;
                while(!validCreditUnit){
                    try{
                        String input  = JOptionPane.showInputDialog(null,
                        "Enter Credit Unit for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE).trim();
                        
                        creditUnit = Integer.parseInt(input);
                        
                        if(creditUnit > 0 ){
                            validCreditUnit = true;
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Credit Unit is invalid. Please try again!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a valid integer.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }

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

            utils.successMessage(programName);
            
            repeatOption = false;
            
        }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,
                "Invalid number format. Please enter a valid number.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
        }catch (Exception e) {
            utils.errorMessage(programName);
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
            utils.errorMessage(programName);
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
            utils.errorMessage(programName);
            
            repeatOption = true;
        } 
    }

//    // temporary - just for debugging and testing
//    public static void main(String[] args) {
//        showMenu();
//        
//        for (Student student : StudentManagement.students) {
//            System.out.println(student.getName());
//            System.out.println(student.getAdminNo());
//            System.out.println(student.getClasses());
//            System.out.println("----modules taken----");
//            for (Module module : student.getModules_Taken()) {
//                System.out.println(module.getModule_cd());
//                System.out.println(module.getModule_name());
//                System.out.println(module.getCredit_units());
//                System.out.println(module.getStudent_marks());
//            }
//            System.out.println("---------------------\n");
//        }
//    }
}
