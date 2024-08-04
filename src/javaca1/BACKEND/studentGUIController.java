/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1.BACKEND;

/**
 *
 * @author Darren
 */

public class studentGUIController {

    public String searchStudentName(String name){
        int moduleCount = 0;
        boolean found = false;
        StringBuilder nameResults = new StringBuilder();
        
        for(Student student : TxtFileReader.students){
            if(student.getName().equalsIgnoreCase(name)){
                nameResults.append("Name: ").append(student.getName()).append("\n");
                nameResults.append("Admin Number: ").append(student.getAdminNo()).append("\n");
                nameResults.append("Class: ").append(student.getClasses()).append("\n");
                nameResults.append("Modules Taken: \n");
                
                for(Module module : student.getModules_Taken()){
                    moduleCount++;
                    
                    double marks = module.getStudent_marks();
                    
                    MarksGrade grade = MarksGrade.getGrade(marks);
                    
                    nameResults.append(String.format("%s: %s/%s/%s: %s\n",
                            moduleCount,
                            module.getModule_cd(),
                            module.getModule_name(),
                            module.getCredit_units(),
                            grade));
                }
                nameResults.append(String.format("%.2f", student.calculateGPA()));
                found = true;
                break;
            }
        }
        if(!found){
            nameResults.append("Student with name ").append(name).append(" is not found.");
        }
        return nameResults.toString();
    }
    
    public String searchStudentClass(String classInput){
        int moduleCount = 0;
        boolean found = false;
        int count = 0;
        double totalGPA = 0.0;
        StringBuilder classResults = new StringBuilder();
        
        for(Student student : TxtFileReader.students){
            if(student.getClasses().equalsIgnoreCase(classInput)){
                classResults.append("Name: ").append(student.getName()).append("\n");
                classResults.append("Admin Number: ").append(student.getAdminNo()).append("\n");
                classResults.append("Class: ").append(student.getClasses()).append("\n");
                classResults.append("Modules Taken: \n");
                
                for(Module module : student.getModules_Taken()){
                    moduleCount++;
                    
                    double marks = module.getStudent_marks();
                    
                    MarksGrade grade = MarksGrade.getGrade(marks);
                    
                    classResults.append(String.format("%s: %s/%s/%s: %s\n",
                            moduleCount,
                            module.getModule_cd(),
                            module.getModule_name(),
                            module.getCredit_units(),
                            grade));
                }
                classResults.append(String.format("%.2f\n", student.calculateGPA()));
                classResults.append("--------------\n");
                count++;
                totalGPA += student.calculateGPA();
                found = true;
                break;
            }
        }
        if(!found){
            classResults.append("Student in class ").append(classInput).append(" is not found.");
        }
        return classResults.toString();
    }
    
    public String searchStudentAdminNo(String adminNoInput){
        StringBuilder adminNoResults = new StringBuilder();
        boolean found = false;
        int moduleCount = 0;
        
        for(Student student : TxtFileReader.students){
            if(student.getAdminNo().equalsIgnoreCase(adminNoInput)){
                adminNoResults.append("Name: ").append(student.getName()).append("\n");
                adminNoResults.append("Admin Number: ").append(student.getAdminNo()).append("\n");
                adminNoResults.append("Class: ").append(student.getClasses()).append("\n");
                adminNoResults.append("Modules Taken: \n");
                
                for(Module module : student.getModules_Taken()){
                    moduleCount++;
                    
                    double marks = module.getStudent_marks();
                    
                    MarksGrade grade = MarksGrade.getGrade(marks);
                    
                    adminNoResults.append(String.format("%s: %s/%s/%s: %s\n",
                            moduleCount,
                            module.getModule_cd(),
                            module.getModule_name(),
                            module.getCredit_units(),
                            grade));
                }
                adminNoResults.append(String.format("%.2f\n", student.calculateGPA()));
                adminNoResults.append("---------------\n");
                found = true;
                break;
            }
        }
        if(!found){
            adminNoResults.append("Student with admin number ").append(adminNoInput).append(" is not found.");
        }
        return adminNoResults.toString();
    }
}
