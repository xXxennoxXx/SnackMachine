package products;

import org.junit.Test;

import java.util.List;

public class ProductsEntityTest {

    public void testGetInstance() {
        ProductsExtent instance = ProductsExtent.getInstance();

    }

    @Test
    public void testAddToProducts() {

        Product product1 = new Product("Bar", 12.0, 1),
                product2 = new Product("Tea", 14.0, 5),
                product3 = new Product("Coffee", 13.0, 6);

        List<Product> products = ProductsExtent.getInstance().getProducts();
//        products.remove(0); java.lang.UnsupportedOperationException
        products.forEach(e -> System.out.println(e.toString()));
    }
}