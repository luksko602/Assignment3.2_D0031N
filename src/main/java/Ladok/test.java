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
public class test {
    public static void main(String[] args){
        LadokController control = new LadokController();
       // control.saveAll();
        
        control.readAll();
        ArrayList<Grade> grades = control.getGrades("D0031N", "0005");
        for(Grade grad: grades){
            System.out.println("PNmr: " + grad.getpNmr());
            System.out.println("Betyg: " + grad.getGrade());
            System.out.println("Datum: " + grad.getDate());
            System.out.println("Attesterad: " + grad.getAttested());
            System.out.println();
        }      
    }
}
