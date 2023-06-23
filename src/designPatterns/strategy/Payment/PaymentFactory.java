package designPatterns.strategy.Payment;

import designPatterns.strategy.Payment.Strategies.CreditCardPaymentStrategy;
import designPatterns.strategy.Payment.Strategies.DebitCardPaymentStrategy;
import designPatterns.strategy.Payment.Strategies.PaymentStrategy;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(PaymentModes paymentModes) {
        switch (paymentModes) {
            case DEBIT_CARD -> {
                return DebitCardPaymentStrategy.getInstance();
            }
            case CREDIT_CARD -> {
                return CreditCardPaymentStrategy.getInstance();
            }
        }
        return null;
    }
}
