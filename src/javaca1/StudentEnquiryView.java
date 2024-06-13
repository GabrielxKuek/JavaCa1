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
    
    public String showMenu(String message) {
        return JOptionPane.showInputDialog(null,
                message,
                "Student Enquiry System",
                JOptionPane.QUESTION_MESSAGE
        );
    }
}
