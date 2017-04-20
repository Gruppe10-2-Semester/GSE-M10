package gse.m10;

import java.util.Date;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class Register {

    private ProductCatalog productCatalog;
    private Sale currentSale;
    private ProductDescription productDescription;

    public Register(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }


    public void makeNewSale(){
        Date date = new Date();
        currentSale = new Sale(date);
    }
    public void enterItem(String itemID, int quantity) {
        productDescription = productCatalog.getProductDescription(itemID);
        currentSale.makeLineItem(productDescription, quantity);
    }
    public void makePayment(double amount) {

        this.currentSale.getPayment().setAmount(amount);
    }


    public void endSale() {
        this.getCurrentSale().getSalesLineItems().clear();
        this.currentSale.setIsComplete(true);
    }

    public Sale getCurrentSale() {
        return currentSale;
    }

}
