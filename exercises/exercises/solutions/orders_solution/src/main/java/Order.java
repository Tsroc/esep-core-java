
public class Order {
    private String stockSymbol;
    private String currency;
    private double amount;

    public Order(String stockSymbol, String currency, double amount) {
        this.stockSymbol = stockSymbol;
        this.currency = currency;
        this.amount = amount;
    }

    public Order(String stockSymbol) {
        this(stockSymbol,"USD", 0.0);
    }


    // Bonus work

    public Order() {
        this("UNDEFINED");
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
