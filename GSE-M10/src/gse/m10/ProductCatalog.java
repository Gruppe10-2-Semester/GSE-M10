package gse.m10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class ProductCatalog {

    List<ProductDescription> productDescriptions;

    public ProductCatalog() {

        productDescriptions = new ArrayList<>();
        initializeProductDescriptions();

    }

    private void initializeProductDescriptions() {

    }


    public ProductDescription getProductDescription(String itemID) {

        for(ProductDescription productDescription : productDescriptions) {
            if(productDescription.getItemID().equals(itemID)) {
                return productDescription;
            }
        }

        return null;


    }


}
