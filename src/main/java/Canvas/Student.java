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
public class Student {
    String firstName;
    String lastName;
    String userName;
    ArrayList<Grade> grades;    
    
    public Student(String fName, String lName, String uName){
        this.firstName = fName;
        this.lastName = lName;
        this.userName = uName;
        grades = new ArrayList();
    }
    
    public void addGrade(String nameOfAssignment, String grade){
        grades.add(new Grade(nameOfAssignment, grade));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}