package com.enlighten.clock;

import java.util.HashMap;
import java.util.Map;

public class SpeakingClockEngine {

	private Map<Integer, String> integers =new HashMap<Integer,String>(); 

	public SpeakingClockEngine(){
		integers.put(1,"one");
		integers.put(2,"two");
		integers.put(3, "three");
		integers.put(4,"four");
		integers.put(5,"five");
		integers.put(6,"six");
		integers.put(7,"seven");
		integers.put(8,"eight");
		integers.put(9,"nine");
		integers.put(10,"ten");
		integers.put(11,"eleven");
		integers.put(12,"twelve");
		integers.put(13,"thirteen");
		integers.put(14,"fourteen");
		integers.put(15,"fifteen");
		integers.put(16,"sixteen");
		integers.put(17,"seventeen");
		integers.put(18,"eighteen");
		integers.put(19,"nineteen");
		integers.put(20, "twenty");
		integers.put(21, "twenty one");
		integers.put(22, "twenty two");
		integers.put(23, "twenty three");
		integers.put(24, "twenty four");
		integers.put(25, "twenty five");
		integers.put(26, "twenty six");
		integers.put(27, "twenty seven");
		integers.put(28, "twenty eight");
		integers.put(29, "twenty nine");
		integers.put(30, "thirty");


	}


	public String timeToWords(Time time) {
		StringBuilder timeString = new StringBuilder();
		if(time.getMinutes() == 0){
			buildWholeHours(time, timeString);
		}else{
			buildHoursAndMinutes(time, timeString);
		}
		return timeString.toString();
	}


	private void buildHoursAndMinutes(Time time, StringBuilder timeString) {
		int hour = time.getHours();
		int minutes = time.getMinutes();

		if(minutes > 30){
			timeString.append(integers.get(60-minutes));
			timeString.append((60-minutes) == 1 ? " minute to " : " minutes to ");
			hour = hour+1;
		}else{
			timeString.append(integers.get(minutes));
			timeString.append(minutes == 1 ? " minute past " : " minutes past ");
		}

		timeString.append(integers.get(hour));
		timeString.append(" in the ");
		timeString.append(time.isAm()?"morning":time.getHours()<6?"afternoon":"evening");
	}


	private void buildWholeHours(Time time, StringBuilder timeString) {
		int hour = time.getHours();

		switch(hour) {
		case 12:
			timeString.append(time.isAm() ? "midnight" : "noon");
			return;
		default:
			timeString.append(integers.get(hour));
			timeString.append(" o'clock in the ");
			timeString.append(time.isAm()?"morning":time.getHours()<6?"afternoon":"evening");
		}
	}

}
