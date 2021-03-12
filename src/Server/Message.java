/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author xeals
 */
public class Message implements Serializable {
    private String message;
    private Date date;
    
    public String getMsg() {
        return message;
    }
    
    public void setMsg(String message) {
        this.message = message;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}
