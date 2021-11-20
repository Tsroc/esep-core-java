package com.enlighten.clock;

public class Time {
	enum AmPm {
		AM,PM
	}

	private final AmPm amPm;
	private int hour;
	private int minute;

	public Time(int hour, int minute, AmPm amPm) {
		checkHoursMinutesInRange(hour, minute);
		this.hour = hour;
		this.minute = minute;
		this.amPm = amPm;
	}

	private void checkHoursMinutesInRange(int hour, int minute) {
		if(hour < 0 || hour > 12 ) throw new IllegalArgumentException("hour is out of range hour = " + hour);
		if(minute < 0 || minute > 59 ) throw new IllegalArgumentException("minute is out of range minute = " + minute);
	}

	public static final AmPm AM = AmPm.AM;
	public static final AmPm PM = AmPm.PM;
	
	public int getHours() {
		return hour;
	}
	
	public int getMinutes() {
		return minute;
	}

	
	public boolean isAm() {
		return amPm == AM;
	}

}
