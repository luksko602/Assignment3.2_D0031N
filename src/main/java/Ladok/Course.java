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
public class Course {
    ArrayList<Module> modules;
    String courseCode;
    
    public Course(String code){
        this.courseCode = code;
        modules = new ArrayList();
    }
    
    
    public boolean setGrade(String pNmr, String grade, String date, String moduleCode){
       for(Module module: modules){
           if(module.getCode().equals(moduleCode)){
               if(module.regBetyg(pNmr,date,grade))
                   return true;
           }
       }
        return false;
    }
    
    public ArrayList<Grade> getGrades(String courseCode){
        for(Module module: modules){
            if (module.getCode().equals(courseCode)){
                return module.getGrades();
            }
        }
        return null;
    }
    
    public boolean regBetyg(String pNmr,String modul, String date, String grade){
        for(Module mod: modules){
            if (mod.getCode().equals(modul)){
                return mod.regBetyg(pNmr,date,grade);
            }
        }
        return false;
    }
    
    public void addGrade(int module, String pNmr){
        modules.get(module).addGrade(pNmr);
    }
    
    public void addModule(String name){
        modules.add(new Module(name));
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
}
