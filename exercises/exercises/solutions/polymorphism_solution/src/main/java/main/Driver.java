package main;


import domain.LimitOrder;
import domain.MarketOrder;
import domain.Order;

public class Driver {
    public static void main(String[] args) {
        Order [] orders = new Order[2];
        orders[0] = new MarketOrder();
        orders[1] = new LimitOrder();

        for(Order order: orders){
            System.out.println(order);
        }
    }
}
