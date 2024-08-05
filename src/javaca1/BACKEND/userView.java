/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Kuek, DITFT2A01, p2323220 & Wong Hong Chee, DIT/FT/2A/01, p2323543
 */
public class userView {
    private static String programName = "Login Page";
    private static String userInputUsername = "";
    private static String userInputPassword = "";
    private static User tempUser = new User();
    public static boolean isMenuRepeat = true;
    
    
    // called when displaying login system
    public static void displayMenu() {
        while (isMenuRepeat) {
            userInputUsername = JOptionPane.showInputDialog(null,
                    "Enter your username",
                    programName,
                    JOptionPane.QUESTION_MESSAGE);

            // error handling
            if (userInputUsername == null) {
                utils.terminateProgram();
            }
            
            userInputPassword = JOptionPane.showInputDialog(null,
                    "Enter your password",
                    programName,
                    JOptionPane.QUESTION_MESSAGE);
            
            // error handling
            if (userInputPassword == null) {
                utils.terminateProgram();
            }
            
            // creates temporary instance of user to be used as arguments
            tempUser.setUsername(userInputUsername);
            tempUser.setPassword(userInputPassword);

            // checks users' data. if false, program loops
            if (userController.checkUserLogin(tempUser)) {
                // if user records exist
                JOptionPane.showMessageDialog(null,
                    "Login Successful!",
                    "Success!",
                    JOptionPane.INFORMATION_MESSAGE);

            } else {
                // if user is illegal
                JOptionPane.showMessageDialog(null,
                    "Incorrect credentials. Please try again!",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
                        
                continue;
            }
        
            // displays the appropriate menu based on user account information
            if (!userController.checkUserType(tempUser)) {
                // if user is not admin
                StudentEnquiryView.showMenu();

            } else if (userController.checkUserType(tempUser)) {
                // if user is admin
                StudentAdminView.showMenu();

            }
        }
    }
}
