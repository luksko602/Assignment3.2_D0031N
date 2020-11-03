/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentITS;

import Ladok.Grade;
import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class DBTest {
 
    public static void main(String[] args){
        DBController db = new DBController();
        ArrayList<Grade> grad = db.getGrades("D0031N", "D0006");
        for (Grade g: grad){
            System.out.println(g.getpNmr());
            System.out.println(g.getGrade());
            System.out.println(g.getDate());
            System.out.println(g.getAttested());
        }
        
        
    }
    
}
