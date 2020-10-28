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
        courses.get(0).setGradeForStudent("luksok-8", "Inlämningsuppgifter", "U");
    }
    public Course getCourse(String courseSearch){
        for(Course course: courses){
            if(course.getName().equals(courseSearch)){
                return course;
            }}
        return null;
    }
}
