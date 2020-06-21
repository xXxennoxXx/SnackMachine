package products;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductTest {

    @Test
    public void toStringTest() {

        Product product = new Product("Bar", 12.0, 4);

        System.out.println(product);

        assertNotNull(product);


    }

    @Test
    public void testTakeProduct() throws Exception {
        Product product = new Product("Bar", 12.0, 4);

        assertEquals(product.getAmount(), 4);
        product.takeProduct();

        assertEquals(product.getAmount(), 3);

        for (int i = 0; i < 3; i++)
            product.takeProduct();

        assertEquals(product.getState(), ProductState.LACK_OF_PRODUCT);

        product.takeProduct();
    }
}