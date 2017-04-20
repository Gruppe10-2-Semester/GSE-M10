package gse.m10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class Store {

    private String adress;
    private String name;
    private ProductCatalog productCatalog;
    private Register register;
    private List<Sale> sales;


    public Store(String adress, String name) {
        this.adress = adress;
        this.name = name;
        this.productCatalog = new ProductCatalog();
        this.register = new Register(this.productCatalog);
        this.sales = new ArrayList<Sale>();
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

    public void addSale(Sale sale) {
        sales.add(sale);
    }
}
