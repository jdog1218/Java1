package edu.orangecoastcollege.cs170.jgordon41.ic22;

public class Time {

	private int mHour, mMinute;
	
	public Time(int hour, int minute)throws InvalidHourException,InvalidMinuteException {
		setHour(hour);
		setMinute(minute);
	}

	public int getHour() {
		return mHour;
	}

	public void setHour(int hour) throws InvalidHourException{
		mHour = hour;
		if(mHour > 12 || mHour < 1){
			throw new InvalidHourException("The hour cannot be over 12 or under 1!");
		}
	}

	public int getMinute() {
		return mMinute;
	}

	public void setMinute(int minute)throws InvalidMinuteException {
		mMinute = minute;
		if(mMinute > 59 || mMinute < 0){
			throw new InvalidMinuteException("Please enter a Minute that is between 59 and 0");
		}
	}
	
	public String toString(){
		return (getHour() + ":" + getMinute());
	}

}
