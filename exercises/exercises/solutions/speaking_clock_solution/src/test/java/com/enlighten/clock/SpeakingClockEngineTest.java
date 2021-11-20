package com.enlighten.clock;


import static org.hamcrest.core.Is.is;
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
public class SpeakingClockEngineTest {

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
				}
			);
	}
	
	public SpeakingClockEngineTest(
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
		assertThat(engine.asSpeech(time), is(expected));
	}


}
