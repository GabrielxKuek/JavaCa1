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
    public void addNewStudent() { // todo: add error hadnling
        String name = "";
        String adminNumber = "";
        String classes = "";
        int modulesTaken = 0;

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
        
        modulesTaken = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                    "Enter number of Modules Taken:",
                    programName,
                    JOptionPane.QUESTION_MESSAGE
                )
        );
        
        for (int i = 0; i < modulesTaken; i++) {
            
        }
    }
    
    // delete student
    public void deleteStudent() {
    
    }
    
    // add new module for student
    public void addNewModule() {
        
    }
    
    public static void main(String[] args) {
        showMenu();
    }
}
