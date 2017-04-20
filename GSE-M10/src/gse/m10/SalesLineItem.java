/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gse.m10;

/**
 *
 * @author Alex
 */
public class SalesLineItem {
    private ProductDescription productDesciption;
    private int quantity;
    
    public SalesLineItem (ProductDescription productDescription, int quantity) {
        this.productDesciption = productDesciption;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductDescription getProductDesciption() {
        return productDesciption;
    }
    
}
