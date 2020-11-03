/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canvas;
 
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "message")
public class Message {
     
    public Message() {
        super();
    }
 
    public Message(String content) {
        super();
        this.content = content;
    }
 
    private String content;
 
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }
}