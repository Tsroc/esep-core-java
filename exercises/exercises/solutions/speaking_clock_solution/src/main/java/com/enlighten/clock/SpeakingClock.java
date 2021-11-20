package com.enlighten.clock;

import static com.enlighten.clock.Time.AmPm.AM;

public class SpeakingClock {

	private Clock clock;
	private SpeakingClockEngine spe;
	private SpeechSynthesiser ss;
	
	public SpeakingClock(Clock clock, SpeakingClockEngine spe, SpeechSynthesiser ss){
		this.clock = clock;
		this.spe = spe;
		this.ss = ss;
	}
	
	public void tellTheTime() {
		Time time = clock.getTime();
		String timeInWords = spe.asSpeech(time);
		ss.speak(timeInWords);
	}
}
