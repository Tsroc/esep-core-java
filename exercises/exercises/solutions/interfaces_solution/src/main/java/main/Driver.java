package main;

import domain.LimitOrder;
import domain.MarketOrder;
import domain.Order;
import domain.Transferable;

public class Driver {
    public static void main(String[] args) {

        Order orders[] = new Order[3];
        orders[0] = new MarketOrder("FB", "USD", 90.01);
        orders[1] = new MarketOrder("TWTR", "USD", 35.99);
        orders[2] = new LimitOrder("LNKD", "USD", 213.55);

        for(Order order : orders){
            if(order instanceof Transferable) {
                System.out.println(order);
            }
        }
    }
}
