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
public class Course {
    String name;
    ArrayList<Student> students;
    
public Course(String name){
    this.name = name;
    students = new ArrayList();
}    

public void addStudent(String fName, String lName, String uName){
    students.add(new Student(fName,lName,uName));
}

public void setGradeForStudent(String uName, String nameOfAssignment, String grade){
   for(Student stud: students){
       if(stud.getUserName().equals(uName)){
           stud.addGrade(nameOfAssignment, grade);
       }
   } 
}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


}
