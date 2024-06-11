/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Darren
 */
public class Student {
    private String name;
    private String adminNo;
    private String classes;

    public Student(String name, String adminNo, String classes) {
        this.name = name;
        this.adminNo = adminNo;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public String getClasses() {
        return classes;
    }
    
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + adminNo);
        System.out.println("Grade: " + classes);
    }
    
    
}
