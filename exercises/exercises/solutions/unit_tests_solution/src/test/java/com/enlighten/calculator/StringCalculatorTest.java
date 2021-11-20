package com.enlighten.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void setUp(){
        calculator = new StringCalculator();
    }

    @Test
    public void verifyEmptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void verifyOneNumberSumsCorrectly() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void verifyTwoNumbersSumCorrectly(){
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void verifyThreeNumbersSumCorrectly(){
        assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void verifyNegativeNumbersGenerateCorrectException(){
        try {
            calculator.add("-1,2");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }

        try {
            calculator.add("2,-4,3,-5");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
        }
    }

    @Test
    public void verifySemiColonDelimiter(){
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void verifyNewLineDelimeter(){
        assertEquals(6, calculator.add("1\n2,3"));
    }


}
