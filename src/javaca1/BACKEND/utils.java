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
public class utils {
    
    public static void errorMessage(String programName) {
        JOptionPane.showMessageDialog(null,
                "Invalid input! Please try again.",
                programName,
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    
    public static void unexpectedErrorMessage(String programName) {
        JOptionPane.showMessageDialog(null,
                "An Unexpected Error has Occurred!",
                programName,
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    public static void successMessage(String programName) {
        JOptionPane.showMessageDialog(null,
                "Success!",
                programName,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public static void terminateProgram() {
        JOptionPane.showMessageDialog(null,
                "Program Terminated.\nThank you!",
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }
    
    public static void loginRedirectMessage() {
        JOptionPane.showMessageDialog(null,
                "Directing to Login Screen..",
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
}
