package designPatterns.strategy.Payment.Strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private static CreditCardPaymentStrategy creditCardPaymentStrategy = null;
    private CreditCardPaymentStrategy() {}
    public static CreditCardPaymentStrategy getInstance() {
        if(creditCardPaymentStrategy == null) {
            synchronized (CreditCardPaymentStrategy.class) {
                if(creditCardPaymentStrategy == null) {
                    creditCardPaymentStrategy = new CreditCardPaymentStrategy();
                }
            }
        }
        return creditCardPaymentStrategy;
    }
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment success of Rs."+amount+" with Credit Card");
    }
}
