package designPatterns.observer.notifiers;

import designPatterns.observer.Amazon;

public class CustomerNotifier implements OrderPlacedNotifier, OrderCanceledNotifier {
    Amazon amazon = Amazon.getInstance();
    public CustomerNotifier() {
        amazon.registerOrderPlacedSubscriber(this);
        amazon.registerOrderCancelledSubscriber(this);
    }
    @Override
    public ReturnData orderPlaced() {
        ReturnData r = new ReturnData("Customer Notify Return Data");
        System.out.println("Customer notified for order placed");
        return r;
    }

    @Override
    public ReturnData orderCanceled() {
        ReturnData r = new ReturnData("Customer Notify Return Data");
        System.out.println("Customer notified for order cancelled");
        return r;
    }
}
