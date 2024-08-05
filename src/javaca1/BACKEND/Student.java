/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Gabriel Kuek, DITFT2A01, p2323220 & Wong Hong Chee, DIT/FT/2A/01, p2323543 */
public class Student { 
    private String name;
    private String adminNo;
    private String studentClass;
    private Module[] modules_taken;
    private String username;
    private String password;

    // student class constructors
    public Student(String name, String adminNo, String studentClass, Module[] modules) {
        this.name = name;
        this.adminNo = adminNo;
        this.studentClass = studentClass;
        this.modules_taken = modules;
    }
    
    public Student(String name, String adminNo, String studentClass) {
        this(name, adminNo, studentClass, new Module[0]);
    }
    
    public Student(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public Student() {
        this.name = "";
        this.adminNo = "";
        this.studentClass = "";
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
        return studentClass;
    }
    
    public Module[] getModules_Taken() {
        return modules_taken;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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
            new Module("ST0420", "RafaelHonestStudys", 4, 0.0),
            new Module("ST0509", "JPRG", 4, 0.0),
            new Module("ST0503", "FOP", 5, 0.0)
        }; // sample dataset. later change
    }
    
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
    
//        @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Student{name='").append(name).append('\'')
//          .append(", adminNo='").append(adminNo).append('\'')
//          .append(", studentClass='").append(studentClass).append('\'')
//          .append(", modules_taken=[");
//        for (Module module : modules_taken) {
//            sb.append(module).append(", ");
//        }
//        sb.append("]}");
//        return sb.toString();
//    }
}
