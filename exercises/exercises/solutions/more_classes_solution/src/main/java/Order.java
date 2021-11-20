
public class Order {
    private String stockSymbol;
    private String currency;
    private double amount;
    private static long numberOfOrders;

    public Order(String stockSymbol, String currency, double amount) {
        this.stockSymbol = stockSymbol;
        this.currency = currency;
        this.amount = amount;
        numberOfOrders++;
    }

    public Order(String stockSymbol) {
        this(stockSymbol,"USD", 0.0);
    }

    public Order() {
        this("UNDEFINED");
    }


    public static long getNumberOfOrders(){
        return numberOfOrders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
