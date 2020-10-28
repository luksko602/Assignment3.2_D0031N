/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canvas;

/**
 *
 * @author Lukas
 */
public class Grade {
    String nameOfAssignment;
    String grade;
    
    public Grade(String name, String grade){
        this.nameOfAssignment = name;
        this.grade = grade;
    }

    public void setNameOfAssignment(String nameOfAssignment) {
        this.nameOfAssignment = nameOfAssignment;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNameOfAssignment() {
        return nameOfAssignment;
    }

    public String getGrade() {
        return grade;
    }
    
}
