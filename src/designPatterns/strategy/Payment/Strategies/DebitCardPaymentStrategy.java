package designPatterns.strategy.Payment.Strategies;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    private static DebitCardPaymentStrategy debitCardPaymentStrategy = null;
    private DebitCardPaymentStrategy() {}
    public static DebitCardPaymentStrategy getInstance() {
        if(debitCardPaymentStrategy == null) {
            synchronized (DebitCardPaymentStrategy.class) {
                if(debitCardPaymentStrategy == null) {
                    debitCardPaymentStrategy = new DebitCardPaymentStrategy();
                }
            }
        }
        return debitCardPaymentStrategy;
    }
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment success of Rs."+amount+" with Debit Card");
    }
}
