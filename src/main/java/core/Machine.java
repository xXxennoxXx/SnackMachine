package core;

import orders.Order;
import orders.OrderFactory;
import payments.PaymentType;
import products.Product;
import products.ProductsExtent;

import java.util.List;

public class Machine {

    private ProductsExtent productsEntity;

    private Order makeOrder(PaymentType paymentType,
                            Product product) throws Exception {
        return OrderFactory.newOrder(paymentType, product);
    }

    public boolean evaluateRequest(PaymentType paymentType,
                                   Product product) throws Exception {
        Order order = makeOrder(paymentType, product);

        return order.evaluate();
    }

}
