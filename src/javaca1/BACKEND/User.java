/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek
 */
public class User {
    // create user (lecturer / admin)
    
    // config
    private boolean isAdmin;
    private String username;
    private String password;
    
    // intitialiser
    public User(boolean isAdmin, String username, String password) {
        this.isAdmin = isAdmin;
        this.username = username;
        this.password = password;
    }
    public User() {
        this.isAdmin = isAdmin;
        this.username = username;
        this.password = password;
    }
    
    // methods - get
    public boolean getIsAdmin() {
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    // methods - set
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
