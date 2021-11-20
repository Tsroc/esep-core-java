package com.enlighten.clock;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class SpeakingClockEngineTests {

	private SpeakingClockEngine engine;
	private Time time;
	private String expected;

	@Parameters
	public static Collection data() {
		return Arrays.asList(
				new Object[][]{
						{12,0,Time.AM, "midnight"},
						{12,0,Time.PM, "noon"},
						{1,0,Time.AM, "one o'clock in the morning"},
						{2,0,Time.AM, "two o'clock in the morning"},
						{2,0,Time.PM, "two o'clock in the afternoon"},
						{5,0,Time.PM, "five o'clock in the afternoon"},
						{6,0,Time.PM, "six o'clock in the evening"},
						{6,19,Time.PM, "nineteen minutes past six in the evening"},
						{6,30,Time.PM, "thirty minutes past six in the evening"},
						{6,55,Time.PM, "five minutes to seven in the evening"},
						{11,55,Time.PM, "five minutes to twelve in the evening"},
						{11,55,Time.AM, "five minutes to twelve in the morning"},
						{4,45,Time.PM, "fifteen minutes to five in the afternoon"},
						{2,33,Time.AM, "twenty seven minutes to three in the morning"},
						{9,1,Time.AM, "one minute past nine in the morning"}
						
				}
			);
	}
	
	
	public SpeakingClockEngineTests(
			int hours, int minutes, Time.AmPm amPm, String expected) {
		this.time = new Time(hours, minutes, amPm);
		this.expected = expected;
	}

	@Before
	public void setUp() {
		engine = new SpeakingClockEngine();
	}
	
	@After
	public void tearDown() {
		engine = null;
	}
	
	@Test
	public void shouldTranslate() {
		assertEquals(engine.timeToWords(time), expected);
	}


}
