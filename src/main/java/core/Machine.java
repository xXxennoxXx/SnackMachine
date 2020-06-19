package core;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Machine {

     {
        products = new ArrayList<>();
    }

    private  List<Product> products;

    public  boolean addProduct(Product p) {
        return products.add(p);
    }

    public  List<Product> getProducts() {
        return products;
    }
}
