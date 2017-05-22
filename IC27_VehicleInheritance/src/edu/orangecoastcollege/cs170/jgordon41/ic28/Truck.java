package edu.orangecoastcollege.cs170.jgordon41.ic28;

@SuppressWarnings("serial")
public class Truck extends Vehicle{

	private int towingCapacity, loadCapicity;
	
	public Truck(int horsepower, String manufactureName, int cylinders, Person owner, int towingCapacity,
			int loadCapicity) {
		super(horsepower, manufactureName, cylinders, owner);
		this.towingCapacity = towingCapacity;
		this.loadCapicity = loadCapicity;
	}

	public int getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	public int getLoadCapicity() {
		return loadCapicity;
	}

	public void setLoadCapicity(int loadCapicity) {
		this.loadCapicity = loadCapicity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + loadCapicity;
		result = prime * result + towingCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Truck)) {
			return false;
		}
		Truck other = (Truck) obj;
		if (loadCapicity != other.loadCapicity) {
			return false;
		}
		if (towingCapacity != other.towingCapacity) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Truck [Make=" + mManufactureName + ", Owner=" + mOwner.getFullName() + ", Horse Power=" + horsepower
				+ ", Cylinders=" + mCylinders + ", Towing Capacity=" + towingCapacity + ", Load Capicity=" + loadCapicity
				+ "]";
	}

}
