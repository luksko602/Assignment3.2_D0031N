/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ladok;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class LadokController {
    ArrayList<Course> courses;
    
    public LadokController(){
        courses = new ArrayList();
        courses.add(new Course("D0031N"));
        courses.get(0).addModule("0005");
        courses.get(0).addModule("0006");
        courses.get(0).addGrade(0, "9603169876");
        courses.get(0).addGrade(0, "9205231234");
        courses.get(0).addGrade(0, "9408315678");
        courses.get(0).addGrade(1, "9603169876");
        courses.get(0).addGrade(1, "9205231234");
        courses.get(0).addGrade(1, "9408315678");
        
        courses.add(new Course("D0025E"));
        courses.get(1).addModule("0023");
        courses.get(1).addModule("0073");
        courses.get(1).addGrade(0, "9603169876");
        courses.get(1).addGrade(0, "9205231234");
        courses.get(1).addGrade(0, "9408315678");
        courses.get(1).addGrade(1, "9603169876");
        courses.get(1).addGrade(1, "9205231234");
        courses.get(1).addGrade(1, "9408315678");
        
        
        courses.add(new Course("D0004N"));
        courses.get(2).addModule("0042");
        courses.get(2).addModule("0003");      
        courses.get(2).addGrade(0, "9603169876");
        courses.get(2).addGrade(0, "9205231234");
        courses.get(2).addGrade(0, "9408315678");
   }
    public ArrayList<Grade> getGrades(String courseCode, String moduleCode){
        for(Course course: courses){
            if(course.getCourseCode().equals(courseCode)){
                 ArrayList<Grade> result = course.getGrades(moduleCode);
                 return result;
            }
        }
        return null;
    }
}
