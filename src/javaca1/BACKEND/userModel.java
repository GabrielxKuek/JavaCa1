/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek
 */
public class userModel {
    // methods for userModel to work
    
    // adds new user into sample data
    public static void insertUser(User user) {
        sampleUserData.users = arrayUtils.appendUserElement(sampleUserData.users, user);
    }
    
    // returns true if user exists in dataset
    public static boolean checkUserRecords(User user) {
        for (User currentUser : sampleUserData.users) {
            if (currentUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        
        return false;
    }
    
    // checks password match
    public static boolean checkUserLogin(User user) {
        for (User currentUser : sampleUserData.users) {
            if (
                currentUser.getPassword().equals(user.getPassword()) 
                && 
                currentUser.getUsername().equals(user.getUsername())
            ) {
                return true;
            }
        }
        
        return false;
        
    }
    
    // checks if user is admin
    public static boolean checkUserType(User user) {
        for (User currentUser : sampleUserData.users) {
            if (currentUser.getUsername().equals(user.getUsername())) {
                return currentUser.getIsAdmin();
            }
        }
        
        return false;
    }
}
