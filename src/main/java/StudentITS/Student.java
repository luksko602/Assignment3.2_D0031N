/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentITS;

/**
 *
 * @author Lukas
 */
public class Student {
    public String pNmr;
    public String userName;
    
    public Student(String uName, String pNmr){
        this.pNmr = pNmr;
        this.userName = uName;
    }

    public String getpNmr() {
        return pNmr;
    }

    public String getUserName() {
        return userName;
    }

    public void setpNmr(String pNmr) {
        this.pNmr = pNmr;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
