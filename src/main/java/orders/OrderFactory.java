package orders;

import payments.Payment;
import payments.PaymentType;
import products.Product;
import products.ProductState;

public class OrderFactory {

    public static Order newOrder(PaymentType paymentType,
                                 Product product) throws Exception {
        if (product.getState() == ProductState.LACK_OF_PRODUCT)
            throw new Exception("Lack of product: " + product.getName());
        return new Order(paymentType, product);
    }
}
