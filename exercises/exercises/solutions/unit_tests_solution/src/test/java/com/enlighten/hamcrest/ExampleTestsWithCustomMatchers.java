package com.enlighten.hamcrest;

import org.junit.Test;

import static com.enlighten.hamcrest.matchers.CustomMatchers.eachAndEveryIntegerIs;
import static com.enlighten.hamcrest.matchers.CustomMatchers.startAndEndsWith;
import static org.junit.Assert.assertThat;


import static org.hamcrest.Matchers.greaterThan;

public class ExampleTestsWithCustomMatchers {

	@Test
	public void exampleTestWithStartsAndEndsWithMatcher(){
		assertThat("that", startAndEndsWith("t"));
	}

	@Test
	public void exampleTestWithStartsAndEndsWithMatcherThatFails(){
		assertThat("theatre", startAndEndsWith("t"));
	}
	
	@Test
	public void exampleTestWithEachAndEveryIntegerMatcher(){
		Integer[] data = {-1,2,3,4};
		assertThat(data , eachAndEveryIntegerIs(greaterThan(0)));
	}
	
	
	
	
	
	
	
	
	

}
