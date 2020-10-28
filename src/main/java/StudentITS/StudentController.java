/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentITS;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class StudentController {
    ArrayList<Student> students;
    
    public StudentController(){
        students = new ArrayList();
        students.add(new Student("luksok-8","9603169876"));
        students.add(new Student("magrad-2","9205231234"));
        students.add(new Student("simste-6","9408315678"));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public Student getStudentByUsername(String searchName){
        for(Student student: students){
            if(student.getUserName().equals(searchName)){
                return student;
            }
        }
        return null;
    }
    
}
