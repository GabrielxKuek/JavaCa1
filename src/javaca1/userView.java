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
public class userView {
    private static String programName = "Login Page";
    private static String userInputUsername = "";
    private static String userInputPassword = "";
    private static User tempUser = new User();
    public static boolean isMenuRepeat = true;
    
    // main program
    public static void main(String[] args) {
        displayMenu();
    }
    
    // called when displaying login system
    public static void displayMenu() {
        while (isMenuRepeat) {
            userInputUsername = JOptionPane.showInputDialog(null,
                    "Enter your username:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE);

            userInputPassword = JOptionPane.showInputDialog(null,
                    "Enter your password:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE);

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
                    "Success!",
                    JOptionPane.INFORMATION_MESSAGE);
                        
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
//        switch (userController.checkUserType(tempUser)) {
//            case true:
//                StudentEnquiryView.showMenu();
//        }
//        StudentEnquirySystem enquirySystem = new StudentEnquirySystem();
//        StudentEnquiryView view = new StudentEnquiryView();
//        boolean loggedIn = false;
//        
//        while(true){
//            //prompt for username and password
//            if(!loggedIn){
//            String username = view.username();
//            String password = view.password();
//        
//            // Authenticate User
//                if(enquirySystem.authenticate(username, password)){
//                    JOptionPane.showMessageDialog(null,
//                            "Login Successful!",
//                            "Success!",
//                            JOptionPane.INFORMATION_MESSAGE);
//                    loggedIn = true;
//                }else{
//                    JOptionPane.showMessageDialog(null,
//                            "Incorrect Credentials",
//                            "Error",
//                            JOptionPane.ERROR_MESSAGE);
//                    continue;
//                }
//            }
    }
}
