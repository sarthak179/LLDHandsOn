package designPatterns.strategy.Payment;

import designPatterns.strategy.Payment.Strategies.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = PaymentFactory.getPaymentStrategy(PaymentModes.DEBIT_CARD);
        paymentStrategy.makePayment(3000);
        paymentStrategy.makePayment(2500);
    }
}
