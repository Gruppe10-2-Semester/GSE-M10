package gse.m10;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class Store {

    private String adress;
    private String name;
    private ProductCatalog productCatalog;

    public Store(String adress, String name) {
        this.adress = adress;
        this.name = name;
        this.productCatalog = new ProductCatalog();
    }





}
