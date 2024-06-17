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
    
    /*
    
    o((>ω< ))o
    hey bro, i think we should ditch this file. i was thinking about a use case
    of this program and it doesn't make sense for students to be able to access
    the information of other students in the student enquiry system.
    
    i think it makes more sense that lecturers can access the student information
    so the student enquiry system is made for the lecturers and the student admin
    system is made for the school administrative department.
    
    to be fair some of the changes im making is subjective, sorry for changing 
    a lot of your code. i think this other way would be better but let me know
    what you think. i dont wanna be too hard headed
    
    hope the changes im making isnt unfair for you. i just want our project to 
    turn out well hahaha. let me know if you wanna discuss anything about the code
    or if my logic doesn't make sense. ill be able to make time for that. plus, 
    we have until 27th so we can also discuss after school. ( •̀ ̫ •́ )✧
    
    for now, im gonna have a similar file and call it userMenu.java instead for 
    the menu.
    */
    
    public static void main(String[] args) {
//        //Student Enquiry System for Student users
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
//            
//            // JOptionPane Menu
//            String userInputString = view.showMenu("""
//                                                   Enter your option: 
//
//                                                   1. Display All Students: 
//                                                   2.Search student by class
//                                                   3. Search student by name
//                                                   4. Quit""");
//
//
//            int userInput;
//
//            try {
//                userInput = Integer.parseInt(userInputString.trim());
//            } catch (NumberFormatException e) {
//                // Handle non-integer input
//                JOptionPane.showMessageDialog(null,
//                    "Please enter a valid integer option",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE);
//                continue; // Restart the loop to prompt for input again
//            }
//
//            // call student management
//            StudentManagement studentManagement = new StudentManagement();
//
//            switch(userInput){
//                case 1:
//                    studentManagement.display_student();
//                    break;
//                case 2:
//                    //Prompt user for classInput
//                    String classInput = JOptionPane.showInputDialog(null,
//                    "Enter the class name to search",
//                    "Search",
//                    JOptionPane.QUESTION_MESSAGE
//                    );                
//                    studentManagement.search_studentClass(classInput);
//                    break;
//                case 3:
//                    studentManagement.search_studentName();
//                    break;
//                case 4:
//                    JOptionPane.showMessageDialog(null,
//                            "Program Terminated.\nThank you!",
//                            "Message",
//                            JOptionPane.INFORMATION_MESSAGE
//                    );
//                    return;
//                default:
//                    JOptionPane.showMessageDialog(null,
//                    "Please provide a valid input",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE
//                    );
//            }
//        }      
    }
}
