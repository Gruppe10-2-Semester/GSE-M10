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
public class Payment {
    private ProductDescription productDesciption;
    private float amount;
    
    public void Payment (ProductDescription productDesciption, float amount) {
        this.productDesciption = productDesciption;
        this.amount = amount;
    }
}