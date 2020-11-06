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
 String value;
 String text;
    
 public Module(String code, String name){
     this.value = code;
     this.text = name + " "+ code;
 }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setText(String text) {
        this.text = text;
    }


}
 