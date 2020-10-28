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
public class Course {
ArrayList <Module> modules;
String courseCode;
public Course(String courseCode){
    this.courseCode = courseCode;
    modules = new ArrayList();
}

    public void addModules(String code, String name) {
        modules.add(new Module(code,name));
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public String getCourseCode() {
        return courseCode;
    }

}

