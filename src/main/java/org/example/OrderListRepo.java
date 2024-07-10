package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> OrderList = new ArrayList<>();
    public void putOrder(Order order) {
        OrderList.add(order);
    }
    public List<Order> getOrder() {
        return OrderList;
    }
    public void removeOrder(Order order) {
        OrderList.remove(order);
    }
    public Order findByOrderId(String id){
        for (Order order : OrderList){
            if (order.getOrderID().equals(id)){
                return order;
            }
        }
        return null;
    }
}
