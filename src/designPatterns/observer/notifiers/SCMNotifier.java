package designPatterns.observer.notifiers;

import designPatterns.observer.Amazon;

public class SCMNotifier implements OrderPlacedNotifier, OrderCanceledNotifier {
    Amazon amazon = Amazon.getInstance();
    public SCMNotifier() {
        amazon.registerOrderPlacedSubscriber(this);
    }
    @Override
    public ReturnData orderPlaced() {
        ReturnData r = new ReturnData("SCM Notify Return Data");
        System.out.println("SCM notified for order placed");
        return r;
    }

    @Override
    public ReturnData orderCanceled() {
        ReturnData r = new ReturnData("SCM Notify Return Data");
        System.out.println("SCM notified for order cancelled");
        return r;
    }
}
