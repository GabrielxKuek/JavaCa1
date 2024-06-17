/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Kuek
 */
public class StudentEnquiryView {
    static String programName = "Student Enquiry System";

    public static void showMenu() {
        String userInputString = "";
        boolean checkUserInput = true;
        int userInput = 0;
        
        do {
            // display selection menu
            userInputString = JOptionPane.showInputDialog(null,
                """
                    Enter your option: 

                    1. Display All Students: 
                    2.Search student by class
                    3. Search student by name
                    4. Logout    
                    5. Quit            
                """,
                programName,
                JOptionPane.QUESTION_MESSAGE
            );
            
            // prompt for user input
            try {
                userInput = Integer.parseInt(userInputString.trim());
            } catch (NumberFormatException e) {
                // Handle non-integer input
                JOptionPane.showMessageDialog(null,
                    "Please enter a valid integer option",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                continue; // Restart the loop to prompt for input again
            }
            
            StudentManagement studentManagement = new StudentManagement();

            switch(userInput){
                case 1:
                    studentManagement.display_student();
                    break;
                case 2:
                    //Prompt user for classInput
                    String classInput = JOptionPane.showInputDialog(null,
                    "Enter the class name to search",
                    "Search",
                    JOptionPane.QUESTION_MESSAGE
                    );                
                    studentManagement.search_studentClass(classInput);
                    break;
                case 3:
                    studentManagement.search_studentName();
                    break;
                    
                case 4:
                    utils.loginRedirectMessage();
                    return;
                case 5:
                    utils.terminateProgramMessage();
                    userView.isMenuRepeat = false;
                    return;
                default:
                    JOptionPane.showMessageDialog(null,
                    "Please provide a valid input",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
            }
        } while (true);
    }
    
//    public String username(){
//        return JOptionPane.showInputDialog(null,
//                "Enter Your Username",
//                "Student Login",
//                JOptionPane.QUESTION_MESSAGE);
//    }
//    
//    public String password(){
//        return JOptionPane.showInputDialog(null,
//                "Enter Your Password",
//                "Student Login",
//                JOptionPane.QUESTION_MESSAGE);
//    }
}
