package domain;


public class LimitOrder extends Order{
    @Override
    public String toString(){
        return "Limit Order's toString() " + super.toString();
    }
}
