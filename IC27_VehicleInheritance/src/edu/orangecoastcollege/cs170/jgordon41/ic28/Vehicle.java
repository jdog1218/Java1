package edu.orangecoastcollege.cs170.jgordon41.ic28;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vehicle implements Serializable {

	protected int horsepower;
	protected String mManufactureName;
	protected int mCylinders;
	protected Person mOwner;
	public Vehicle(int horsepower, String manufactureName, int cylinders, Person owner) {
		this.horsepower = horsepower;
		mManufactureName = manufactureName;
		mCylinders = cylinders;
		mOwner = owner;
	}
	
	public Vehicle(Vehicle copy){
		this.horsepower = copy.horsepower;
		mManufactureName = copy.mManufactureName;
		mCylinders = copy.mCylinders;
		mOwner = copy.mOwner;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public String getManufactureName() {
		return mManufactureName;
	}
	public void setManufactureName(String manufactureName) {
		mManufactureName = manufactureName;
	}
	public int getCylinders() {
		return mCylinders;
	}
	public void setCylinders(int cylinders) {
		mCylinders = cylinders;
	}
	public Person getOwner() {
		return mOwner;
	}
	public void setOwner(Person owner) {
		mOwner = owner;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horsepower;
		result = prime * result + mCylinders;
		result = prime * result + ((mManufactureName == null) ? 0 : mManufactureName.hashCode());
		result = prime * result + ((mOwner == null) ? 0 : mOwner.hashCode());
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
		if (!(obj instanceof Vehicle)) {
			return false;
		}
		Vehicle other = (Vehicle) obj;
		if (horsepower != other.horsepower) {
			return false;
		}
		if (mCylinders != other.mCylinders) {
			return false;
		}
		if (mManufactureName == null) {
			if (other.mManufactureName != null) {
				return false;
			}
		} else if (!mManufactureName.equals(other.mManufactureName)) {
			return false;
		}
		if (mOwner == null) {
			if (other.mOwner != null) {
				return false;
			}
		} else if (!mOwner.equals(other.mOwner)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Vehicle [ Make =" + mManufactureName + ", Horsepower= " + horsepower + ", Cylinders="
				+ mCylinders + ", " + mOwner.getFullName() + "]";
	}
	
	
	
}
