package payments;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest  {

    @Test
    public void  makePayment(){

        Payment payment;

        payment = new CardPayment();

        assertTrue(payment.makePayment(100.0));

        payment = new CashPayment();

        assertTrue(payment.makePayment(100.0));
    }

}