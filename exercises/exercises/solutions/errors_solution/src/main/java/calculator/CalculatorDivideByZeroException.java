package calculator;

public class CalculatorDivideByZeroException extends RuntimeException {
    public CalculatorDivideByZeroException(String msg){
        super(msg);
    }
}
