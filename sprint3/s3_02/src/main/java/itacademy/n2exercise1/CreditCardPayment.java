package itacademy.n2exercise1;

import java.util.Random;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(PaymentCallback callback) {
        boolean success = new Random().nextBoolean();

        if (success) {
            callback.onPaymentSuccess("Payment made successfully with Credit Card.");
        } else {
            callback.onPaymentFailure("Credit Card payment failed.");
        }
    }
}