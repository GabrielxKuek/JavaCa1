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
        String userInputString = view.showMenu("Enter your option: \n\n"
                + "1. Display All Students: \n"
                + "2.Search student by class\n"
                + "3. Search student by name\n"
                + "4. Quit");
        
        int userInput = Integer.parseInt(userInputString.trim());
                
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
