package designPatterns.observer;

import designPatterns.observer.notifiers.CustomerNotifier;
import designPatterns.observer.notifiers.OrderPlacedNotifier;
import designPatterns.observer.notifiers.SCMNotifier;
import designPatterns.observer.notifiers.SellerNotifier;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        OrderPlacedNotifier seller = new SellerNotifier();
        OrderPlacedNotifier scm = new SCMNotifier();
        OrderPlacedNotifier customer = new CustomerNotifier();

        //will insert these in list while initializing
        //amazon.registerOrderPlacedSubscriber(seller);
        //amazon.registerOrderPlacedSubscriber(scm);
        //amazon.registerOrderPlacedSubscriber(customer);

        amazon.placeOrder();
        System.out.println();
        amazon.cancelOrder();
    }
}
