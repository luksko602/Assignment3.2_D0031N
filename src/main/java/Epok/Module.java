/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Epok;


/**
 *
 * @author Lukas
 */
public class Module {
 String code;
 String name;
    
 public Module(String code, String name){
     this.code = code;
     this.name = name;
 }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
 