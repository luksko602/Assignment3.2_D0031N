/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ladok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



/**
 *
 * @author Lukas
 */
public class LadokController {
    ArrayList<Course> courses;
    
    public LadokController(){
        courses = new ArrayList();
        
        courses.add(new Course("D0031N"));
        courses.get(0).addModule("0005");
        courses.get(0).addModule("0006");
        courses.get(0).addGrade(0, "9603169876");
        courses.get(0).addGrade(0, "9205231234");
        courses.get(0).addGrade(0, "9408315678");
        courses.get(0).addGrade(1, "9205231234");
        courses.get(0).addGrade(1, "9408315678");
        
        courses.add(new Course("D0025E"));
        courses.get(1).addModule("0023");
        courses.get(1).addModule("0073");
        courses.get(1).addGrade(0, "9603169876");
        courses.get(1).addGrade(0, "9205231234");
        courses.get(1).addGrade(0, "9408315678");
        courses.get(1).addGrade(1, "9603169876");
        courses.get(1).addGrade(1, "9205231234");
        courses.get(1).addGrade(1, "9408315678");
        
        
        courses.add(new Course("D0004N"));
        courses.get(2).addModule("0042");
        courses.get(2).addModule("0003");      
        courses.get(2).addGrade(0, "9603169876");
        courses.get(2).addGrade(0, "9205231234");
        courses.get(2).addGrade(0, "9408315678");
   }
    
    public void saveAll() {
        try (FileOutputStream file = new FileOutputStream(new File("C:\\Users\\Lukas\\Documents\\NetBeansProjects\\Assignment3.2_D0031N\\files\\ladokStudents.txt"))) {
            ObjectOutputStream saveOut = new ObjectOutputStream(file);
            saveOut.writeInt(courses.size());
            for (int i = 0; i < courses.size(); i++) {
                saveOut.writeObject(courses.get(i));
            }
            saveOut.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void readAll(){
        try{
        FileInputStream file = new FileInputStream("C:\\Users\\Lukas\\Documents\\NetBeansProjects\\Assignment3.2_D0031N\\files\\ladokStudents.txt");
        ObjectInputStream readIn = new ObjectInputStream(file);
         int noToRead = readIn.readInt();
             for (int i = 0; i < noToRead; i++) {
                   courses.add((Course) readIn.readObject());
            }
      readIn.close();
      file.close();
        }catch(IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(LadokController.class.getName());
        }
    }
    
    public ArrayList<Grade> getGrades(String courseCode, String moduleCode){
       // this.readAll();
        for(Course course: courses){
            if(course.getCourseCode().equals(courseCode)){
                 ArrayList<Grade> result = course.getGrades(moduleCode);
                 return result;
            }
        }
        return null;
    }
    
    public boolean regBetyg(String pNmr, String kursKod,String modul, String date, String grade){
      //   this.readAll();
        for (Course cor: courses){
           if(cor.getCourseCode().equals(kursKod)){
               Boolean res = cor.regBetyg(pNmr,modul,date,grade);
            //   this.saveAll();
               return res;
           }
        }
        return false;
    }
}
