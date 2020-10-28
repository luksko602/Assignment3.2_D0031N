/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canvas;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class CanvasController {
    ArrayList<Course> courses;

    public CanvasController(){
        courses = new ArrayList();
        courses.add(new Course("D0031N"));
        courses.get(0).addStudent("Lukas", "Skog", "luksok-8");
        courses.get(0).setGradeForStudent("luksok-8", "Inlämningsuppgift1", "U");
        courses.get(0).setGradeForStudent("luksok-8", "Inlämningsuppgift2", "G");
        courses.get(0).setGradeForStudent("luksok-8", "Inlämningsuppgift3", "U");
        courses.get(0).setGradeForStudent("luksok-8", "Projekt", "VG");
        
        courses.get(0).addStudent("Magdalena", "Fernlund", "magrad-2");
        courses.get(0).setGradeForStudent("magrad-2", "Inlämningsuppgift1", "VG");
        courses.get(0).setGradeForStudent("magrad-2", "Inlämningsuppgift2", "VG");
        courses.get(0).setGradeForStudent("magrad-2", "Inlämningsuppgift3", "G");
        courses.get(0).setGradeForStudent("magrad-2", "Projekt", "VG");
        
        courses.get(0).addStudent("Simon", "Sterner", "simste-6");
        courses.get(0).setGradeForStudent("simste-6", "Inlämningsuppgift1", "G");
        courses.get(0).setGradeForStudent("simste-6", "Inlämningsuppgift2", "G");
        courses.get(0).setGradeForStudent("simste-6", "Inlämningsuppgift3", "VG");
        courses.get(0).setGradeForStudent("simste-6", "Projekta", "VG");
    }
    public Course getCourse(String courseSearch){
        for(Course course: courses){
            if(course.getName().equals(courseSearch)){
                return course;
            }}
        return null;
    }
}
