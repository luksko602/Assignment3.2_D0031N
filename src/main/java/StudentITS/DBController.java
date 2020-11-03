/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentITS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import Ladok.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lukas
 */

public class DBController {
    private static final String USERNAME ="luksok8";
    private static final String PASSWORD ="luksok8";
    private static final String URL = "jdbc:mysql://192.168.1.4:3306/canvasdatabase";

    private PreparedStatement getAllGrades;
    
    private Connection myConn;

    public DBController(){
        try{
           myConn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
           getAllGrades = myConn.prepareStatement("SELECT * FROM ladokmodule");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
      public ArrayList<Grade> getGrades(String courseCode, String moduleCode){
      ArrayList<Grade> grades = new ArrayList();
      try{
          ResultSet myRs = getAllGrades.executeQuery();
          while(myRs.next()){
              grades.add(new Grade(myRs.getString("ladokStudentPnmr")));
          }
      }catch(SQLException e){
          e.printStackTrace();
      }
        return grades;
      }
    
}
