package calculator;

public class Calculator {
    public long add(int valueOne, int valueTwo) throws CalculatorException{
        checkInputs(valueOne,valueTwo);
        return valueOne+valueTwo;
    }

    public long subtract(int valueOne, int valueTwo) throws CalculatorException{
        checkInputs(valueOne,valueTwo);
        return valueOne-valueTwo;
    }

    public long divide(int valueOne, int valueTwo) throws CalculatorException{
        checkInputs(valueOne,valueTwo);
        if(valueTwo == 0){
            throw new CalculatorDivideByZeroException("trying to divide by zero");
        }
        return valueOne/valueTwo;
    }

    public long multiply(int valueOne, int valueTwo) throws CalculatorException{
        checkInputs(valueOne,valueTwo);
        return valueOne*valueTwo;
    }

    private void checkInputs(int valueOne, int valueTwo) throws CalculatorException{
        if(valueOne < -100 || valueOne > 100 ){
            throw new CalculatorException("Input one out of range");
        }
        if(valueTwo < -100 || valueTwo > 100 ){
            throw new CalculatorException("Input two out of range");
        }
    }
}
