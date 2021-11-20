package domain;

public abstract class Order {
    private String stockSymbol;
    private String currency;
    private double amount;

    public Order(String stockSymbol, String currency, double amount) {
        this.stockSymbol = stockSymbol;
        this.currency = currency;
        this.amount = amount;
    }

    public abstract boolean match(Order order);

    @Override
    public String toString() {
        return "domain.Order{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
