package com.beniregev.designpatterns.behavioral_patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command invoker class.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
