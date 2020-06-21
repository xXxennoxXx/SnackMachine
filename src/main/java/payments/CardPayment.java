package payments;

public class CardPayment  implements Payment{
    @Override
    public boolean makePayment(Double amount) {
        /*
        Tutaj dostep do jakiegos urzadzenia
        peryferyjnego ktore zwraca czy platnosc sie
        powiodła
         */
        Boolean decision = true;//MOCK

        return decision;
    }

    @Override
    public String toString() {
        return "Payment by Card";
    }
}
