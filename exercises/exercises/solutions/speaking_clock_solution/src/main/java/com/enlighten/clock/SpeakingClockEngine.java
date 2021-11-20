package com.enlighten.clock;

public class SpeakingClockEngine {

	String[] integers = {
			"",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
	};
	public String asSpeech(Time time) {
		if (time.getMinute() == 0) {
			int hour = time.getHour();
			switch(hour) {
			case 12:
				if (time.isAm()) {
					return "midnight";
				} else {
					return "noon";
				}
			default:
				String hourStr = integers[hour];
				String morningAfternoonStr = 
					time.isAm()?"morning":time.getHour()<6?"afternoon":"evening";
				return hourStr + " o'clock in the " + morningAfternoonStr;
			}
		}
		return "cannot translate that time yet";
	}

}
