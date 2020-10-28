/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Epok;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class EpokController {
ArrayList<Course> courses;

public EpokController(){
    courses = new ArrayList();
    courses.add(new Course("D0031N"));
    courses.get(0).addModules("0005", "Inlämningsuppgifter");
    courses.get(0).addModules("0006", "Projekt");
    
    courses.add(new Course("D0025E"));
    courses.get(1).addModules("0023", "Inlämningsuppgifter");
    courses.get(1).addModules("0073", "Tentamen");
    
    courses.add(new Course("D0004N"));
    courses.get(2).addModules("0042", "Tentamen");
    courses.get(2).addModules("0003", "Inlämningsuppgifter");
}

public Course getCourse(String courseCode){
    for(Course course: courses){
        System.out.println("Sök på: " + courseCode);
        System.out.println("Hittade: " + course.getCourseCode());
        if (course.getCourseCode().equals(courseCode)){
            return course;
        }
    }
    return null;
}
public ArrayList getModules(String courseCode){
     for(Course course: courses){
        if (course.getCourseCode() == courseCode){
            return course.getModules();
        }
    }
     return null;
}
}