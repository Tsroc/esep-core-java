package domain;

public class MarketOrder extends Order {
    @Override
    public String toString(){
        return "Market Order's toString() " + super.toString();
    }
}
