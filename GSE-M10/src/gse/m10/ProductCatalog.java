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

        productDescriptions.add(new ProductDescription("Alex", "Alex er behåret", 2000));
        productDescriptions.add(new ProductDescription("Martin", "Martin er fynsk", 50));
        productDescriptions.add(new ProductDescription("Johan", "Johan er brandmand", 100));
        productDescriptions.add(new ProductDescription("Frederik", "Frederik studerede selv", 5));
        productDescriptions.add(new ProductDescription("Lasse", "Lasse er her ikke", 7000));
        productDescriptions.add(new ProductDescription("Trol", "Trol er trololol", 57));
        productDescriptions.add(new ProductDescription("Lone", "Lone er underviser", 100));
        productDescriptions.add(new ProductDescription("InstruktorKim", "Kim er instruktor", 200));





    }


    public ProductDescription getProductDescription(String itemID) {

        for(ProductDescription productDescription : productDescriptions) {
            if(productDescription.getItemID().equals(itemID)) {
                return productDescription;
            }
        }

        return null;


    }

    public List<ProductDescription> getProductDescriptions() {
        return productDescriptions;
    }
}
