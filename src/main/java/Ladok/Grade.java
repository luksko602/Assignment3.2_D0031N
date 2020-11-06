/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ladok;

import java.io.Serializable;

/**
 *
 * @author Lukas
 */
public class Grade implements Serializable{
    String pNmr;
    Boolean attested;
    String grade;
    String date;
    
    public Grade(String pNmr){
        this.pNmr = pNmr;
        this.grade = "-";
        this.date = "-";
        this.attested = false;
        
    }
    
     public Grade(String pNmr, String grade, String date, Boolean attested){
        this.pNmr = pNmr;
        this.grade = grade;
        this.date = date;
        this.attested = false;
        
    }

    public void setpNmr(String pNmr) {
        this.pNmr = pNmr;
    }

    public String getpNmr() {
        return pNmr;
    }

    public void setAttested(Boolean attested) {
        this.attested = attested;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getAttested() {
        return attested;
    }

    public String getGrade() {
        return grade;
    }

    public String getDate() {
        return date;
    }
    
    
}
