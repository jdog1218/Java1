package edu.orangecoastcollege.cs170.jgordon41.ic28;

public class Car extends Vehicle {
	
	private int mNumberOfDoors;

	public Car( int year, String manufacture, int numberOfDoors) {
		super(manufacture,year);
		mNumberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return mNumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		mNumberOfDoors = numberOfDoors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mNumberOfDoors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (mNumberOfDoors != other.mNumberOfDoors) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "[Car: " + mManufacture + ", " +  mYear + ", " + mNumberOfDoors + "]";
	}
	
	
	
}
