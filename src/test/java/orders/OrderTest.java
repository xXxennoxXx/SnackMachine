package orders;

import junit.framework.TestCase;
import org.junit.Test;
import payments.CashPayment;
import payments.PaymentType;
import products.Product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OrderTest {

    @Test
    public void toStringTest() throws Exception {
        Product product = new Product("Bar",
                12.0,
                4);

        Order order = new Order(PaymentType.CARD, product);
        order.evaluate();

        assertEquals(product.getAmount(), 3);

        System.out.println(order);

    }

}