package com.enlighten.clock;

public class ConsoleSpeechSynthesiser implements SpeechSynthesiser {

	@Override
	public void speak(String timeInWords) {
		System.out.println(timeInWords);	
	}

}
