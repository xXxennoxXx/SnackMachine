package payments;

import junit.framework.TestCase;
import org.junit.Test;

public class PaymentTypeTest {

    @Test
    public void newPay() {
        newPayment(PaymentType.CARD);
    }

    private Payment newPayment(PaymentType paymentType) {
        return paymentType.getNewPayment();
    }

    private Payment newPaymentSwitch(PaymentType paymentType) {

        switch (paymentType) {
            case CARD:
                return new CardPayment();
            case CASH:
                return new CashPayment();
            default:
                return null;
        }
    }


}