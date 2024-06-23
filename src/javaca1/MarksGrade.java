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
    A(4.0, 80),
    B(3.0, 70),
    C(2.0, 60),
    D(1.0, 50),
    F(0.0, 0);

    final double gradePoint;
    final int minMarks;

    MarksGrade(double gradePoint, int minMarks) { // constructor
        this.gradePoint = gradePoint;
        this.minMarks = minMarks;
    }

    public double getGradePoint() {
        return gradePoint;
    }
    
    public static double getGradePoint(double marks) {
        for (MarksGrade grade : MarksGrade.values()) {
            if (marks >= grade.minMarks) {
                return grade.getGradePoint();
            }
        }
        return MarksGrade.F.getGradePoint();
    }

    public static MarksGrade getGrade(double marks) {
        for (MarksGrade grade : MarksGrade.values()) {
            if (marks >= grade.minMarks) {
                return grade;
            }
        }
        return MarksGrade.F; 
    }
    
    // testing
//    public static void main(String[] args) {
//        int marks = 85;
//        MarksGrade grade = MarksGrade.getGrade(marks);
//        System.out.println("Marks: " + marks + ", Grade: " + grade + ", Grade Point: " + grade.getGradePoint());
//    }
}

/*
Usage Guide:

eg studentMarks = 77;
// output grade (A, B, C, D)
System.out.println(Marksgrade.getGrade(studentMarks)) // outputs B

// output grade point (4.0, 3.0, 2.0, 1.0, 0.0)
System.out.println(Marksgrade.getGradePoint(studentMarks)) // outputs 3.0

*/