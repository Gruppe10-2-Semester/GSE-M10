package gse.m10;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class Store {

    private String adress;
    private String name;
    private ProductCatalog productCatalog;
    private Register register;


    public Store(String adress, String name) {
        this.adress = adress;
        this.name = name;
        this.productCatalog = new ProductCatalog();
        this.register = new Register(this.productCatalog);
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public Register getRegister() {
        return register;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
}
