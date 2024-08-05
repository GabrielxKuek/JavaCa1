/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek, DITFT2A01, p2323220 & Wong Hong Chee, DIT/FT/2A/01, p2323543
 */
// import
import javax.swing.JOptionPane;

public class userController {
    // loops if login credentials are invalid
    public static boolean checkUserLogin(User user) {
        if (userModel.checkUserLogin(user)) {
            return true;
        } else {
            return false;
        }
    }
    
    // checks user type and return appropriate boolean
    public static boolean checkUserType(User user) {
        return userModel.checkUserType(user);
    }
}
