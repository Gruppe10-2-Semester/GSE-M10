package gse.m10;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class ProductDescription {

    private String itemID;
    private String description;
    private double price;

    public ProductDescription(String itemID, String description, double price) {
        this.itemID = itemID;
        this.description = description;
        this.price = price;
    }


    public String getItemID() {
        return itemID;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
