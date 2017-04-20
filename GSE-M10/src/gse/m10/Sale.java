/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gse.m10;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Sale {
    private Date date;
    private boolean isComplete;
    private ArrayList<SalesLineItem> salesLineItems;
    private Payment payment;
    
    public Sale (Date date, float amount) {
        this.date = date;
        this.isComplete = false;
        //this.payment = new Payment(amount);
    }
    
    public void makeLineItem (int quantity) {
        salesLineItems.add(new SalesLineItem(quantity));
    }
}
