package domain;

public class MarketOrder extends Order {

    @Override
    public boolean match(Order order) {
        System.out.println("domain.MarketOrder match");
        return false;
    }


    public MarketOrder(String stockSymbol, String currency, double amount) {
        super(stockSymbol, currency, amount);
    }
}
