package core;

import junit.framework.TestCase;
import products.Product;

import java.util.List;

public class MachineTest extends TestCase {

    public void testAddProduct() {

        Product product1 = new Product(),
                product2 = new Product(),
                product3 = new Product();

        Machine.addProduct(product1);
        Machine.addProduct(product2);
        Machine.addProduct(product3);

        List<Product> products = Machine.getProducts();
        System.out.println(products.size());
    }
}