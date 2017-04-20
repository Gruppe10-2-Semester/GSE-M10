package gse.m10;

/**
 * Created by MadsNorby on 20/04/17.
 */
public class StoreTester {


    public static void main(String[] args) {


        Store store = new Store("Alexvej 15", "Ærlige Alex' Elektronik");


        store.getRegister().makeNewSale();
        store.getRegister().enterItem("Alex", 5);
        store.getRegister().enterItem("Johan", 5);
        store.getRegister().makePayment(store.getRegister().getCurrentSale().getTotal());
        store.getRegister().endSale();

        double total = store.getRegister().getCurrentSale().getTotal();

        System.out.println(total);










    }

}
