package payments;

public enum PaymentType {
    CASH("Cash") {
        @Override
        public Payment getNewPayment() {
            return new CashPayment();
        }
    }, CARD("Card") {
        @Override
        public Payment getNewPayment() {
            return new CardPayment();
        }
    };

    private String name;

    PaymentType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract Payment getNewPayment();
}
