package com.enlighten.hamcrest.matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class EachAndEveryIntegerMatcher extends TypeSafeMatcher<Integer[]> {

	private Matcher matchAgainst;
	
	public EachAndEveryIntegerMatcher(Matcher matchAgainst){
		this.matchAgainst = matchAgainst;
	}
	
	@Override
	public void describeTo(Description description) {
		description.appendText(" One or more of the supplied integers does not match the required criteria");
	}

	protected boolean matchesSafely(Integer[] values) {
		for(Integer value: values){
			if(!matchAgainst.matches(value)){
				return false;
			}
		}
		return true;
	}
}
