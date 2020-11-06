/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ladok;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Module implements Serializable{
    String code;
    ArrayList<Grade> grades;


public Module(String code){
    this.code = code;
    grades = new ArrayList();
}

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(String pNmr){
        grades.add(new Grade(pNmr));
    }
    
public boolean regBetyg(String pNmr, String date, String grade){
    for(Grade gradeList: grades){
        if (gradeList.getpNmr().equals(pNmr)){
            gradeList.setDate(date);
            gradeList.setGrade(grade);
            return true;
        }
    }
    return false;
}
}

