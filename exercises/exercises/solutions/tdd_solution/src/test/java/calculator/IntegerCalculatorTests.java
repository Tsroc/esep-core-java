package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerCalculatorTests {


    @Test
    public void verifyAddTwoIntegersWorksCorrectly(){
        assertEquals(10, IntegerCalculator.add(6,4));
    }

    @Test
    public void verifySubtractTwoIntegersWorksCorrectly(){
        assertEquals(2, IntegerCalculator.subtract(6,4));
    }

    @Test
    public void verifyMultiplyTwoIntegersWorksCorrectly(){
        assertEquals(24, IntegerCalculator.multiply(6,4));
    }

    @Test
    public void verifyAddDivideIntegersWorksCorrectly(){
        assertEquals(1, IntegerCalculator.divide(6,4));
    }

}
