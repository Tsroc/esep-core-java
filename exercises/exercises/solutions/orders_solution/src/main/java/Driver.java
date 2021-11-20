
public class Driver {
    public static void main(String[] args) {
        Order facebookOrder = new Order("FB", "USD", 90.01);
        System.out.println(facebookOrder);

        Order twitterOrder = new Order("TWTR");
        System.out.println(twitterOrder);


        // Bonus work

        Order undefinedOrder = new Order();
        System.out.println(undefinedOrder);

    }
}
