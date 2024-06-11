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
    private Module[] modules_taken;
    
//    public Module[] modules_taken = {
//        new Module("ST0405", "GabrielStudys", 4, 0.0),
//        new Module("ST0504", "DarrenStudys", 3, 0.0),
//        new Module("ST0690", "KevinGayStudys", 3, 0.0),
//        new Module("ST0420", "RafaelHonestStudys", 4, 0.0)
//    };

    // student class constructors
    public Student(String name, String adminNo, String classes) {
        this.name = name;
        this.adminNo = adminNo;
        this.classes = classes;
//        this.modules_taken = modules_taken; real data
        this.modules_taken = new Module[] {
            new Module("ST0405", "GabrielStudys", 4, 0.0), // mod_code, mod_name, cred_unit, marks
            new Module("ST0504", "DarrenStudys", 3, 0.0),
            new Module("ST0690", "KevinGayStudys", 3, 0.0),
            new Module("ST0420", "RafaelHonestStudys", 4, 0.0)
        }; // sample dataset. later change
    }
    
    public Student() {
        this.name = "";
        this.adminNo = "";
        this.classes = "";
    }
    
    // getter
    public String getName() {
        return name;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public String getClasses() {
        return classes;
    }
    
    public String getModules_Taken() {
        return modules_taken;
    }
    
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + adminNo);
        System.out.println("Class: " + classes);
        System.out.println("Module taken: " + modules_taken);
    }  
    
    public double calculateGPA() {
//        // config
//        
//        
//        for (Module module : this.modules_taken) {
//            
//        }
//        
        return 3.33;
    }
    
}
