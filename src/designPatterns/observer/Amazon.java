package designPatterns.observer;

import designPatterns.observer.notifiers.OrderCanceledNotifier;
import designPatterns.observer.notifiers.OrderPlacedNotifier;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon amazon = null;
    private List<OrderPlacedNotifier> orderPlacedNotifierList;
    private List<OrderCanceledNotifier> orderCanceledNotifierList;
    private Amazon() {
        orderPlacedNotifierList = new ArrayList<>();
        orderCanceledNotifierList = new ArrayList<>();
    }

    public static Amazon getInstance() {
        if(amazon == null) {
            synchronized (Amazon.class) {
                if(amazon == null) {
                    amazon = new Amazon();
                }
            }
        }
        return amazon;
    }
    public void registerOrderPlacedSubscriber(OrderPlacedNotifier orderPlacedNotifier) {
        orderPlacedNotifierList.add(orderPlacedNotifier);
    }
    public void registerOrderCancelledSubscriber(OrderCanceledNotifier orderCanceledNotifier) {
        orderCanceledNotifierList.add(orderCanceledNotifier);
    }
    public void unRegisterSubscriber(OrderPlacedNotifier orderPlacedNotifier) {
        orderPlacedNotifierList.remove(orderPlacedNotifier);
    }
    public void placeOrder() {
        for (OrderPlacedNotifier o : orderPlacedNotifierList) {
            o.orderPlaced();
        }
    }
    public void cancelOrder() {
        for (OrderCanceledNotifier o : orderCanceledNotifierList) {
            o.orderCanceled();
        }
    }
}
