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
                    utils.terminateProgram();
                    
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
        String studentClass = "";
        Module[] modules_taken = new Module[0];
        int noOfModulesTaken = 0;
        
        try {
            boolean validName = false;
            while (!validName) {
                name = JOptionPane.showInputDialog(null,
                        "Enter name:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    );
                
                if (name == null) {
                    return;
                } else {
                    name = name.trim();
                }
            
                if (name.length() >= 2 && name.matches("^[a-zA-Z ]+$")) {
                    validName = true;
                    
                } else{
                    JOptionPane.showMessageDialog(null,
                            "Your name cannot be less than 2 characters or contain any special characters",
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
                );
                
                if (adminNumber == null) {
                    return;
                } else {
                    adminNumber = adminNumber.trim();
                }

                // check if adminNumber starts with 'p' and followed by integers
                if (adminNumber.matches("^p\\d+$")) {
                    validAdmin = true;
                    
                } else if (adminNumber.matches("^\\d+$")) {
                    // if user forgot 'p', prepend 'p' automatically
                    adminNumber = "p" + adminNumber;
                    validAdmin = true;
                    
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Admin Number must start with 'p' and followed by integers, or just integers",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            boolean validClass = false;
            
            while (!validClass) {
                studentClass = JOptionPane.showInputDialog(null,
                        "Enter Class:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    );
                
                if (studentClass == null) {
                    return;
                    
                } else {
                    studentClass = studentClass.trim();
                }
                
                if (studentClass == null) {
                    utils.terminateProgram();
                    
                } else if (studentClass.matches("^[a-zA-Z]+/[a-zA-Z]+/\\d+[A-Za-z]/\\d+$")){
                    String[] classParts = studentClass.split("/");

                    for (int i = 0; i < classParts.length; i++) {
                        classParts[i] = classParts[i].toUpperCase();
                    }

                    studentClass = String.join("/", classParts);
                    
                    validClass = true;
                    
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Input must be capitalized and must follow the exact format\neg DIT/FT/2A/01",
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
                    );

                    if (input == null) {
                        return;
                    } else {
                        input = input.trim();
                    }
                    
                    // Attempt to parse input to integer
                    noOfModulesTaken = Integer.parseInt(input);

                    // Check if input is a positive integer
                    if (noOfModulesTaken > 0) {
                        validNoOfModules = true; // Exit loop if input is valid
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "Number of Modules Taken must be a positive integer",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                    }

                }catch (NumberFormatException e) {
                    // Catch exception if input cannot be parsed to integer
                    JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a valid integer",
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
                        );
                    
                    if (moduleCode == null) {
                        return;
                    } else {
                        moduleCode = moduleCode.trim();
                    }
                        
                    if (moduleCode.matches("^[A-Z0-9]+$")) {
                        validModuleCode = true;
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "Module Code is invalid. Please try again\neg ST123",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }

                boolean validModuleName = false;
                while (!validModuleName) {
                    moduleName = JOptionPane.showInputDialog(null,
                        "Enter Module Name for module" + i + ":",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                        );
                    
                    if (moduleName == null) {
                        return;
                    } else {
                        moduleName = moduleName.trim();
                    }
                        
                    if (moduleName.matches("^[a-zA-Z ]+$")) {
                        validModuleName = true;
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "Module Name is invalid. Please try again",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                            );
                    }
                }

                creditUnit = 0;
                boolean validCreditUnit = false;
                
                while(!validCreditUnit){
                    try{
                        String input  = JOptionPane.showInputDialog(null,
                            "Enter Credit Unit for module" + i + ":",
                            programName,
                            JOptionPane.QUESTION_MESSAGE
                            );
                        
                        if (input == null) {
                            return;
                        } else {
                            input = input.trim();
                        }
                        
                        creditUnit = Integer.parseInt(input);
                        
                        if (creditUnit > 0 ){
                            validCreditUnit = true;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                "Credit Unit is invalid. Please try again",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,
                            "Invalid input. Please enter a valid integer",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }

                moduleMarks = 0;
                boolean validModuleMarks = false;
                
                while (!validModuleMarks) {
                    try{
                        String input = JOptionPane.showInputDialog(null,
                            "Enter Module Marks for module" + i + ":",
                            programName,
                            JOptionPane.QUESTION_MESSAGE
                            );
                        
                        if (input == null) {
                            return;
                        } else {
                            input = input.trim();
                        }
                        
                        moduleMarks = Float.parseFloat(input);
                        
                        if(moduleMarks > 0 ){
                            validModuleMarks = true;
                        }else{
                            JOptionPane.showMessageDialog(null,
                            "Module Marks is invalid. Please try again!",
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

                // create module with given information
                Module tempModule = new Module(moduleCode, moduleName, creditUnit, moduleMarks);

                // add into array of taken modules
                Module[] newModules_taken = new Module[modules_taken.length + 1];

                for (int j = 0; j < modules_taken.length; j++) {
                    newModules_taken[j] = modules_taken[j];
                }

                newModules_taken[modules_taken.length] = tempModule;
            }
            
            StudentManagement.create_student(name, adminNumber, studentClass, modules_taken);

            utils.successMessage(programName);
            
            repeatOption = false;
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid number format. Please enter a valid number.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
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
            );
            
            if (adminNo == null) {
                return;
            } else {
                adminNo = adminNo.trim();
            }

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
                    // indicates end of loop and automatically breaks

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
            boolean isValidAdmin = false;
            while (!isValidAdmin) {
                adminNo = JOptionPane.showInputDialog(null,
                    "Enter admin number of student:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                    );

                if (adminNo == null) {
                    return;
                } else {
                    adminNo = adminNo.trim();
                }
                
                // Check if adminNumber starts with 'p' and followed by integers
                if (adminNo.matches("^p\\d+$")) {
                    isValidAdmin = true;
                } else if (adminNo.matches("^\\d+$")) {
                    // if user forgot 'p', prepend 'p' automatically
                    adminNo = "p" + adminNo;
                    isValidAdmin = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                        "Admin Number must start with 'p' and followed by integers, or just integers.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
                }
            }

            // find student's array index
            for (Student student : StudentManagement.students) {
                if (student.getAdminNo().equals(adminNo)) {
                    break;
                }

                iterations++;
            }
            
            if (iterations == StudentManagement.students.length) {
                JOptionPane.showMessageDialog(null, 
                        "No student with admin number of " + adminNo + " exists. Please try again.",
                        programName,
                        JOptionPane.ERROR_MESSAGE);
                
                return;
            }

            // code for adding module
            do {
                boolean isValidModuleCode = false;
                while(!isValidModuleCode){
                    moduleCode = JOptionPane.showInputDialog(null,
                        "Enter Module Code for module:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                        );
                    
                    if (moduleCode == null) {
                        return;
                    } else {
                        moduleCode = moduleCode.trim();
                    }
                    
                    if (moduleCode.matches("^[A-Z0-9]+$")) {
                        isValidModuleCode = true;
                        
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "Module Code is invalid. Please try again and ensure your alphabets are capitalised\neg ST123",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }

                boolean isValidModuleName = false;
                
                while (!isValidModuleName) {
                    moduleName = JOptionPane.showInputDialog(null,
                        "Enter Module Name for module:",
                        programName,
                        JOptionPane.QUESTION_MESSAGE
                    );
                    
                    if (moduleName == null) {
                        return;
                    } else {
                        moduleName = moduleName.trim();
                    }
                        
                    if (moduleName.matches("^[a-zA-Z ]+$")) {
                        isValidModuleName = true;
                        
                    } else {
                        JOptionPane.showMessageDialog(null,
                        "Module Name is invalid. Please try again!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }

                creditUnit = 0;
                boolean isValidCreditUnit = false;
                
                while (!isValidCreditUnit) {
                    try{
                        String input  = JOptionPane.showInputDialog(null,
                            "Enter Credit Unit for module:",
                            programName,
                            JOptionPane.QUESTION_MESSAGE);
                        
                        if (input == null) {
                            return;
                        } else {
                            input = input.trim();
                        }
                        
                        creditUnit = Integer.parseInt(input);
                        
                        if (creditUnit > 0) {
                            isValidCreditUnit = true;
                            
                        } else {
                            JOptionPane.showMessageDialog(null,
                                "Credit Unit is invalid. Please try again!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                            "Invalid input. Please enter a valid integer.",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }

                moduleMarks = 0;
                boolean isValidModuleMarks = false;
                
                while (!isValidModuleMarks) {
                    try{
                        String input = JOptionPane.showInputDialog(null,
                            "Enter Module Marks for module:",
                            programName,
                            JOptionPane.QUESTION_MESSAGE
                            );
                        
                        if (input == null) {
                            return;
                        } else {
                            input = input.trim();
                        }
                        
                        moduleMarks = Float.parseFloat(input);
                        
                        if(moduleMarks > 0 ){
                            isValidModuleMarks = true;
                            
                        } else {
                            JOptionPane.showMessageDialog(null,
                            "Module Marks is invalid. Please try again!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        
                    } catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a valid integer.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }

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
