package main;

import calculator.Calculator;
import calculator.CalculatorDivideByZeroException;
import calculator.CalculatorException;

public class Driver {
    public static void main(String[] args) {
        Calculator calculator =  new Calculator();


        long result;
        try {
            result = calculator.add(-1011, 20);
            System.out.println("10 + 20 is "+ result);
        } catch (CalculatorException e) {
            System.out.println("Error on add: " + e.getMessage() );
            e.printStackTrace();
        }

        try {
            result = calculator.subtract(10, 20);
            System.out.println("10 - 20 is "+ result);
        } catch (CalculatorException e) {

            System.out.println("Error on subtract: " + e.getMessage() );
            e.printStackTrace();
        }

        try {
            result = calculator.divide(40, 0);
            System.out.println("40 / 20 is "+ result);
        } catch (CalculatorException e) {
            System.out.println("Error on divide: " + e.getMessage() );
            e.printStackTrace();
        }catch(CalculatorDivideByZeroException e){
            System.out.println("Error on divide: " + e.getMessage() );
            e.printStackTrace();
        }

        try {
            result = calculator.multiply(10, 20);
            System.out.println("10 * 20 is "+ result);
        } catch (CalculatorException e) {
            System.out.println("Error on divide: " + e.getMessage() );
            e.printStackTrace();
        }

    }
}
