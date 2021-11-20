
public class Driver {
    public static void main(String[] args) {
        System.out.printf("Numer of orders is %d %n", Order.getNumberOfOrders());

        Order facebookOrder = new Order("FB", "USD", 90.01);
        System.out.println(facebookOrder);

        Order twitterOrder = new Order("TWTR");
        System.out.println(twitterOrder);

        Order undefinedOrder = new Order();
        System.out.println(undefinedOrder);

        System.out.printf("Numer of orders is %d %n", Order.getNumberOfOrders());
    }
}
