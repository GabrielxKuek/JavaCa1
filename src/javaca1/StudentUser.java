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
public class StudentUser {
    public static void main(String[] args) {
        while(true){
        // JOptionPane Menu
        StudentEnquiryView view = new StudentEnquiryView();
        String userInputString = view.showMenu("""
                                               Enter your option: 
                                               
                                               1. Display All Students: 
                                               2.Search student by class
                                               3. Search student by name
                                               4. Quit""");
        
        
        int userInput;
        
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
         
        // call student management
        StudentManagement options = new StudentManagement();
        
        switch(userInput){
            case 1:
                options.display_student();
                break;
            case 2:
                //Prompt user for classInput
                String classInput = JOptionPane.showInputDialog(null,
                "Enter the class name to search",
                "Search",
                JOptionPane.QUESTION_MESSAGE
                );                
                options.search_studentClass(classInput);
                break;
            case 3:
                options.search_studentName();
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "Program Terminated.\nThank you!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
                return;
            default:
                JOptionPane.showMessageDialog(null,
                "Please provide a valid input",
                "Error",
                JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
