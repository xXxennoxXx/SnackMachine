package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsExtent {
    static {
        new ProductsExtent();
    }

    private static ProductsExtent entity = new ProductsExtent();
    private List<Product> products;

    private ProductsExtent() {
        products = new ArrayList<>();
    }

    public static ProductsExtent getInstance() {
        return entity;
    }

    public boolean addToProducts(Product p) {
        return products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}
