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
    
    public Module[] modules_taken = {
        new Module("ST0405", "GabrielStudys", 4, 0.0),
        new Module("ST0504", "DarrenStudys", 3, 0.0),
        new Module("ST0690", "KevinGayStudys", 3, 0.0),
        new Module("ST0420", "RafaelHonestStudys", 4, 0.0)
    };
    
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + adminNo);
        System.out.println("Class: " + classes);
        System.out.println("Module taken: " + modules_taken);
    }  
    
    public double calculateGPA() {
        return 3.33;
    }
    
}
