package gse.m10;

import java.util.Date;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class Register {

    private ProductCatalog productCatalog;
    private Sale currentSale;
    private ProductDescription productDescription;

    public Register() {
        productCatalog = new ProductCatalog();
    }


    public void makeNewSale(){



    }
    public void enterItem(String itemID, int quantity) {

        Date date = new Date();
        productDescription = productCatalog.getProductDescription(itemID);
        currentSale = new Sale(date);



    }
    public void endSale() {



    }
    public void makePayment(double amount) {



    }

}
