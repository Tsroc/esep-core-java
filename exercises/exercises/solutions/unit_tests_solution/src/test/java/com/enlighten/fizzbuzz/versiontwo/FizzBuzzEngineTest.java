package com.enlighten.fizzbuzz.versiontwo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzEngineTest {

    private FizzBuzzEngine engine;


    @Before
    public void setUp(){
        engine = new FizzBuzzEngine();
    }

    @Test
    public void verifyThatDivisibleByThreeReturnsFizz(){
        assertThat(engine.getResult(3), is(equalTo("Fizz")));
    }

    @Test
    public void verifyThatDivisibleByFiveReturnsBuzz(){
        assertThat(engine.getResult(5), is(equalTo("Buzz")));
    }

    @Test
    public void verifyThatDivisibleByThreeAndFiveReturnsFizzBuzz(){
        assertThat(engine.getResult(15), is(equalTo("FizzBuzz")));
    }

    @Test
    public void verifyNotThatDivisibleByThreeAndFiveReturnsNumber(){
        assertThat(engine.getResult(8), is(equalTo("8")));
    }

}
