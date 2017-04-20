/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gse.m10;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Sale {
    private Date date;
    private boolean isComplete;
    
    public void Sale (Date date, boolean isComplete) {
        this.date = date;
        this.isComplete = false;
    }
    
    public void makeLineItem () {
    }
}
