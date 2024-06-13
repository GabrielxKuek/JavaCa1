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
    public Student(String name, String adminNo, String classes, Module[] modules) {
        this.name = name;
        this.adminNo = adminNo;
        this.classes = classes;
        this.modules_taken = modules;
    }
    
    public Student() {
        this.name = "";
        this.adminNo = "";
        this.classes = "";
        this.modules_taken = new Module[0];
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
    
    public Module[] getModules_Taken() {
        return modules_taken;
    }
    
    //setter for modules taken
    public void setModules_taken(Module[] modules_taken) {
        this.modules_taken = modules_taken;
    }
    
    public void addModule(Module newModule) {
        Module[] tempArr = new Module[modules_taken.length+1];
        for(int i = 0; i < modules_taken.length; i++){
            tempArr[i] = modules_taken[i];
        }
        
        tempArr[modules_taken.length] = newModule;
        
        this.modules_taken = tempArr;
    }
    
    public void create_modules() {
            this.modules_taken = new Module[] {
            new Module("ST0405", "GabrielStudys", 4, 0.0), // mod_code, mod_name, cred_unit, marks
            new Module("ST0504", "DarrenStudys", 3, 0.0),
            new Module("ST0690", "KevinGayStudys", 3, 0.0),
            new Module("ST0420", "RafaelHonestStudys", 4, 0.0)
        }; // sample dataset. later change
    }
    
//    public void printDetails() {
//        System.out.println("Student Details:");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + adminNo);
//        System.out.println("Class: " + classes);
//        System.out.println("Module taken: " + modules_taken);
//    }  
    
    public double calculateGPA() {
        // config
        double totalGradePoints = 0.0;
        double totalCreditUnits = 0;
        
        for (Module module : this.modules_taken) {
            double gradePoint = MarksGrade.getGradePoint(module.getStudent_marks());
            int creditUnits = module.getCredit_units();
            
            totalGradePoints += creditUnits*gradePoint;
            totalCreditUnits += creditUnits;
        }
        
        if(totalCreditUnits > 0){
            return totalGradePoints / totalCreditUnits;
        }else{
            return 0.0;
        }
    }
    
}
