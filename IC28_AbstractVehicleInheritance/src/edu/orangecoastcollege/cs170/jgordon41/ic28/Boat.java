package edu.orangecoastcollege.cs170.jgordon41.ic28;

public class Boat extends Vehicle {
	
	private int mNumberofCabins;

	public Boat( int year, String manufacture, int numberofCabins) {
		super(manufacture,year);
		mNumberofCabins = numberofCabins;
	}

	public int getNumberofCabins() {
		return mNumberofCabins;
	}

	public void setNumberofCabins(int numberofCabins) {
		mNumberofCabins = numberofCabins;
	}

	@Override
	public String toString() {
		return "[Boat: " + mManufacture + ", " +  mYear + ", " + mNumberofCabins + "]";
	}
	
	
	
	
}
