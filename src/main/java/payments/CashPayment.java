package payments;

public class CashPayment implements Payment {
    @Override
    public boolean makePayment(Double amount) {
         /*
        Tutaj dostep do jakiegos urzadzenia
        peryferyjnego ktore zwraca ilosc wlozonych
        pieniedzy
         */
        Double inAmount = amount; //MOCK


        return amount <= inAmount;
    }

    @Override
    public String toString() {
        return "Payment in Cash";
    }
}
