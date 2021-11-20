package domain;

public class LimitOrder extends Order implements Transferable{


    public LimitOrder(String stockSymbol, String currency, double amount) {
        super(stockSymbol, currency, amount);
    }


    @Override
    public boolean match(Order order) {
        System.out.println("domain.LimitOrder match");
        return false;
    }

    @Override
    public void transfer(Broker targetExchange) {

    }
}
