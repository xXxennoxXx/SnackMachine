package orders;

import payments.Payment;
import payments.PaymentType;
import products.Product;

import java.util.List;

public class Order {

    private Payment payment;
    private Product product;

    public Order(PaymentType payment, Product product) {
        this.payment = payment.getNewPayment();
        this.product = product;
    }

    public boolean evaluate() throws Exception {
        if (!payment.makePayment(product.getPrice()))
            throw new Exception("Some error occur during payments.");
        return product.takeProduct();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order:\n")
                .append("\tPayment: " + payment)
                .append("\n");

        for (String s : product.toString().split("\n"))
            sb.append("\t" + s + "\n");

        return sb.toString();
    }
}
