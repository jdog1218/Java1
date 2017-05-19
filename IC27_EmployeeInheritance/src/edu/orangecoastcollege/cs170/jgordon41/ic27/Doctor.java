package edu.orangecoastcollege.cs170.jgordon41.ic27;

public class Doctor extends Employee {

	private int mOfficeFee;
	private String mSpeciality;
	
	
	public Doctor(String honorific, String name, int id, String yearHired, double annualSalary, int officeFee,
			String speciality) {
		super(honorific, name, id, yearHired, annualSalary);
		mOfficeFee = officeFee;
		this.mSpeciality = speciality;
	}


	public Doctor(Person other, int id, String yearHired, double annualSalary, int officeFee, String speciality) {
		super(other, id, yearHired, annualSalary);
		mOfficeFee = officeFee;
		this.mSpeciality = speciality;
	}


	public Doctor(Employee copy, int officeFee, String speciality) {
		super(copy);
		mOfficeFee = officeFee;
		this.mSpeciality = speciality;
	}


	public Doctor(Employee copy) {
		super(copy);
		// TODO Auto-generated constructor stub
	}


	public Doctor(Person other, int id, String yearHired, double annualSalary) {
		super(other, id, yearHired, annualSalary);
		// TODO Auto-generated constructor stub
	}


	public Doctor(String honorific, String name, int id, String yearHired, double annualSalary) {
		super(honorific, name, id, yearHired, annualSalary);
		// TODO Auto-generated constructor stub
	}


	public int getOfficeFee() {
		return mOfficeFee;
	}


	public void setOfficeFee(int officeFee) {
		mOfficeFee = officeFee;
	}


	public String getSpeciality() {
		return mSpeciality;
	}


	public void setSpeciality(String speciality) {
		this.mSpeciality = speciality;
	}


	@Override
	public String toString() {
		return "Doctor [Honorific=" + mHonorific + ", Name=" + mName + ", YearHired=" + mYearHired
				+ ", AnnualSalary=" + mAnnualSalary + ", OfficeFee=" + mOfficeFee + ", Speciality=" + mSpeciality
				+ "]";
	}
	
	
	
	
}
