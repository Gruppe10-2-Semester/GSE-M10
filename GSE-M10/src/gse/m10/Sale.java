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
    
    public Sale (Date date) {
        this.date = date;
        this.isComplete = false;
        this.payment = new Payment();
        this.salesLineItems = new ArrayList<>();
    }
    
    public void makeLineItem (ProductDescription productDescription, int quantity) {
        salesLineItems.add(new SalesLineItem(productDescription, quantity));
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public Date getDate() {
        return date;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public ArrayList<SalesLineItem> getSalesLineItems() {
        return salesLineItems;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public double getTotal() {
        double amount;

        amount = 0;
        for(SalesLineItem salesLineItem : this.salesLineItems) {
            amount += (salesLineItem.getProductDesciption().getPrice() * salesLineItem.getQuantity());
        } 
        
        return amount;
    }
    
}
