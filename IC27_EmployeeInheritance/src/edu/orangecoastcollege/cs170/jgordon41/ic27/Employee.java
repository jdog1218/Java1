/**
 * Gordon, Joel
 * CS 170
 * May 19, 2017
 * 
 * Employee.java
 */
package edu.orangecoastcollege.cs170.jgordon41.ic27;

/**
 * @author JG
 *
 */
public class Employee extends Person {

	protected int mId;
	protected String mYearHired;
	protected double mAnnualSalary;
	

	

	public Employee(String honorific, String name, int id, String yearHired, double annualSalary) {
		super(honorific, name);
		mId = id;
		mYearHired = yearHired;
		mAnnualSalary = annualSalary;
	}
	

	public Employee(Person other, int id, String yearHired, double annualSalary) {
		super(other);
		mId = id;
		mYearHired = yearHired;
		mAnnualSalary = annualSalary;
	}
	
	public Employee(Employee copy) {
		super(copy.getHonorific(), copy.getName());
		mId = copy.getId();
		mYearHired = copy.getYearHired();
		mAnnualSalary = copy.mAnnualSalary;
	}
	
	protected String getYearHired() {
		return mYearHired;
	}

	protected void setYearHired(String yearHired) {
		mYearHired = yearHired;
	}

	protected double getAnnualSalary() {
		return mAnnualSalary;
	}

	protected void setAnnualSalary(double annualSalary) {
		mAnnualSalary = annualSalary;
	}

	protected int getId() {
		return mId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(mAnnualSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mId;
		result = prime * result + ((mYearHired == null) ? 0 : mYearHired.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(mAnnualSalary) != Double.doubleToLongBits(other.mAnnualSalary))
			return false;
		if (mId != other.mId)
			return false;
		if (mYearHired == null) {
			if (other.mYearHired != null)
				return false;
		} else if (!mYearHired.equals(other.mYearHired))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [mId=" + mId + ", mYearHired=" + mYearHired + ", mAnnualSalary=" + mAnnualSalary
				+ ", getFullName()=" + getFullName() + "]";
	}

	
	
}
