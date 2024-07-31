/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Darren
 */
public class Module {
    private String moduleCode;
    private String moduleName;
    private int creditUnits;
    private double studentMarks;
    
    public Module(String moduleCode, String moduleName, int creditUnits, double studentMarks) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.creditUnits = creditUnits;
        this.studentMarks = studentMarks;
    }
    
    public String getModule_cd() {
        return moduleCode;
    }

    public String getModule_name() {
        return moduleName;
    }

    public int getCredit_units() {
        return creditUnits;
    }

    public double getStudent_marks() {
        return studentMarks;
    }
    
    
}
