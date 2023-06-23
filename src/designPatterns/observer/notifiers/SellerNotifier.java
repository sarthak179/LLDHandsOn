package designPatterns.observer.notifiers;

import designPatterns.observer.Amazon;

public class SellerNotifier implements OrderPlacedNotifier, OrderCanceledNotifier {
    Amazon amazon = Amazon.getInstance();
    public SellerNotifier() {
        amazon.registerOrderPlacedSubscriber(this);
        amazon.registerOrderCancelledSubscriber(this);
    }
    @Override
    public ReturnData orderPlaced() {
        ReturnData r = new ReturnData("Seller Notify Return Data");
        System.out.println("Seller notified for order placed");
        return r;
    }

    @Override
    public ReturnData orderCanceled() {
        ReturnData r = new ReturnData("Seller Notify Return Data");
        System.out.println("Seller notified for order cancelled");
        return r;
    }
}
