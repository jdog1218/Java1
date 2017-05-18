package edu.orangecoastcollege.cs170.jgordon41.ic28;

public abstract class Vehicle {
	
	protected String mManufacture;
	protected int mYear;
	protected String color;
	
	protected Vehicle(String manufacture, int year){
		this.mManufacture = manufacture;
		this.mYear = year;
	}
	
	public String getManufacture() {
		return mManufacture;
	}
	public void setManufacture(String manufacture) {
		mManufacture = manufacture;
	}
	public int getYear() {
		return mYear;
	}
	public void setYear(int year) {
		mYear = year;
	}
	
	
}
