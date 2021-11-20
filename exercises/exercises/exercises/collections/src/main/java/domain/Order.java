package domain;

public abstract class Order implements Comparable<Order>{
    private String stockSymbol;
    private String currency;
    private double amount;
    private int id;
    private static int nextId;

    public Order(String stockSymbol, String currency, double amount) {
        this.stockSymbol = stockSymbol;
        this.currency = currency;
        this.amount = amount;
        id = nextId++;
    }

    public abstract boolean match(Order order);

    @Override
    public int compareTo(Order other){
        if(this.amount < other.amount) return -1;
        if(this.amount > other.amount) return 1;
        return 0;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "domain.Order{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
