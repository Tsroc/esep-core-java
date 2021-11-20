package com.enlighten.clock;



import org.junit.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;


import static com.enlighten.clock.Time.PM;
public class SpeakingClockTest {

	
	@Test
	public void verifyThatSpeakingClockSequenceFlowsCorrectly() {
		
		Clock clock = mock(Clock.class);
		SpeakingClockEngine spe = mock(SpeakingClockEngine.class);
		SpeechSynthesiser ss = mock(SpeechSynthesiser.class);
		
		Time time = new Time(12,0,PM);
		when(clock.getTime()).thenReturn(time);
		String midday = "midday";

		when(spe.asSpeech(time)).thenReturn(midday);
		
		SpeakingClock sc = new SpeakingClock(clock,spe, ss);

		sc.tellTheTime();

		InOrder inOrder = inOrder(clock, spe, ss);
		inOrder.verify(clock).getTime();
		inOrder.verify(spe).asSpeech(time);
		inOrder.verify(ss).speak(midday);
		
	}

}
