/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Darren
 */
public enum MarksGrade {
    A(4),
    B(3),
    C(2),
    D(1);
    
    final int gradePoint;
    
    MarksGrade(int gradePoint){
        this.gradePoint = gradePoint;
    }
    
    public static MarksGrade getGrade(int gradePoint) {
        if (gradePoint >= 80) {
            return MarksGrade.A;
        } else if (gradePoint >= 70) {
            return MarksGrade.B;
        } else if (gradePoint >= 60) {
            return MarksGrade.C;
        } else {
            return MarksGrade.D;
        }
    }
    
}
