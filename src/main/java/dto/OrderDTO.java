package dto;

import payments.PaymentType;
import products.Product;

import java.util.List;

public class OrderDTO {

    private PaymentType paymentType;
    private List<Product> productList;

    public PaymentType getPaymentType() {

        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
