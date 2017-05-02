package edu.orangecoastcollege.cs170.aniles2.ic22;

public class Time {
	
	private int mHour, mMinute;
	private String mMeridiem;
	
	public Time(int hour, int minute, String meridiem) throws InvalidHourException,InvalidMinuteException, InvalidMeridiemException {
		super();
		setHour(hour);
		setMinute(minute);
		setMeridiem(meridiem);
	}
	
	public void setHour(int hour) throws InvalidHourException {
		if (hour < 1 || hour > 12) {
			throw new InvalidHourException("How dare you choose an incorrect hour you pleb!");
		}
		this.mHour = hour;
	}
	
	public void setMinute(int minute) throws InvalidMinuteException {
		if(minute < 0 || minute > 59) {
			throw new InvalidMinuteException("How dare you choose an incorrect minute you pleb!");
		}
		this.mMinute = minute;
	}
	
	public void setMeridiem(String meridiem) throws InvalidMeridiemException {
		if (!meridiem.equalsIgnoreCase("pm") && !meridiem.equalsIgnoreCase("am")) {
			throw new InvalidMeridiemException("How dare you choose an incorrect meridiem you pleb!");
		}
		this.mMeridiem = meridiem.toUpperCase();
	}
	
	public String toString() {
		return ((mHour<10) ? "0" : "")+mHour+":"+((mMinute<10) ? "0" : "")+mMinute+" "+mMeridiem;
	}

}
