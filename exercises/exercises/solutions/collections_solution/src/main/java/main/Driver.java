package main;

import domain.LimitOrder;
import domain.MarketOrder;
import domain.Order;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new MarketOrder("FB", "USD", 90.01));
        orders.add(new MarketOrder("TWTR", "USD", 35.99));
        orders.add(new LimitOrder("LNKD", "USD", 213.55));
        orders.add(new LimitOrder("IBM", "USD", 169.37));
        orders.add(new LimitOrder("ORCL", "USD", 40.55));

        for(Order order : orders){
            System.out.println(order);
        }

        Collections.sort(orders);

        System.out.println("\nSorted orders (by amount)");

        for(Order order : orders){
            System.out.println(order);
        }

        Collections.sort(orders);


        // Bonus

        Set<Order> ordersSet = new HashSet<>();
        ordersSet.add(new MarketOrder("FB", "USD", 90.01));
        ordersSet.add(new MarketOrder("TWTR", "USD", 35.99));
        ordersSet.add(new LimitOrder("LNKD", "USD", 213.55));
        ordersSet.add(new LimitOrder("IBM", "USD", 169.37));
        ordersSet.add(new LimitOrder("ORCL", "USD", 40.55));

        System.out.println("\nHashSet orders");

        for(Order order : ordersSet){
            System.out.println(order);
        }


        ordersSet = new TreeSet<>();
        ordersSet.add(new MarketOrder("FB", "USD", 90.01));
        ordersSet.add(new MarketOrder("TWTR", "USD", 35.99));
        ordersSet.add(new LimitOrder("LNKD", "USD", 213.55));
        ordersSet.add(new LimitOrder("IBM", "USD", 169.37));
        ordersSet.add(new LimitOrder("ORCL", "USD", 40.55));

        System.out.println("\nTreeSet orders");

        for(Order order : ordersSet){
            System.out.println(order);
        }


        Map<Integer, Order> ordersMap = new HashMap<>();

        Order orderOne = new MarketOrder("FB", "USD", 90.01);
        ordersMap.put(orderOne.getId(), orderOne);

        Order orderTwo = new MarketOrder("TWTR", "USD", 35.99);
        ordersMap.put(orderTwo.getId(), orderTwo);

        Order orderThree = new LimitOrder("LNKD", "USD", 213.55);
        ordersMap.put(orderThree.getId(), orderThree);

        Order orderFour= new LimitOrder("IBM", "USD", 169.37);
        ordersMap.put(orderFour.getId(), orderFour);

        Order orderFive = new LimitOrder("ORCL", "USD", 40.55);
        ordersMap.put(orderFive.getId(),orderFive);

        System.out.println("\nHashMap orders");

        for(Order order : ordersMap.values()){
            System.out.println(order);
        }


        ordersMap = new TreeMap<>();

        ordersMap.put(orderOne.getId(), orderOne);

        ordersMap.put(orderTwo.getId(), orderTwo);

        ordersMap.put(orderThree.getId(), orderThree);

        ordersMap.put(orderFour.getId(), orderFour);

        ordersMap.put(orderFive.getId(),orderFive);

        System.out.println("\nTreeMap orders");

        for(Order order : ordersMap.values()){
            System.out.println(order);
        }


    }
}
