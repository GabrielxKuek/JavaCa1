/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Darren
 */
public class Module {
    private String module_cd;
    private String module_name;
    private int credit_units;
    private double student_marks;
    
    public Module(String module_cd, String module_name, int credit_units, double student_marks) {
        this.module_cd = module_cd;
        this.module_name = module_name;
        this.credit_units = credit_units;
        this.student_marks = student_marks;
    }

    public String getModule_cd() {
        return module_cd;
    }

    public String getModule_name() {
        return module_name;
    }

    public int getCredit_units() {
        return credit_units;
    }

    public double getStudent_marks() {
        return student_marks;
    }
    
    
}
