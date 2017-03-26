/**
 * Gordon, Joel
 * CS170
 * Mar-09-2017
 * 
 * IC12_OCCStudent
 */
package edu.orangecoastcollege.cs170.jgordon41.ic12;

/**
 * @author Joel
 *
 */
public class OCCStudent {

	/**
	 * @param args
	 */
	private String mCNumber;
	private int mAge;
	private double mGpa;
	private String mFullName,mUserName;
	
	public OCCStudent (String fullname, String userName, String cNumber, double gpa, int age){
		
		mFullName = fullname;
		mCNumber = cNumber;
		mUserName = userName;
		mGpa = gpa;
		mAge = age;
		
	}
	
	public String getFullName(){
		return mFullName;
	}
	
	public String getUserName(){
		return mUserName;
	}
	
	public String getCNumber(){
		return mCNumber;
	}
	
	public double getGpa(){
		return mGpa;
	}	

	public int getAge(){
		return mAge;
	}
	
	public void setAge(int newAge){
		mAge = newAge;
	}
	
	public void setFullName(String newName){
		mFullName = newName;
	}
	
	public void setGpa(int newGpa){
		mGpa = newGpa;
	}
	
	public void setUserName(String newUserName){
		mUserName = newUserName;
	}
	
	public boolean equals( OCCStudent student2){
		boolean sameName = false;
		
		if (this.getFullName().equalsIgnoreCase(student2.getFullName()))
			sameName = true;
		
		return sameName;
	}
	public boolean equalStudents(OCCStudent student2){
		if(this.getFullName().equalsIgnoreCase(student2.getFullName()) && 
				this.getAge() == student2.getAge() && 
				this.getCNumber().equalsIgnoreCase(student2.getCNumber()) && 
				this.getGpa() == student2.getGpa() && 
				this.getUserName().equalsIgnoreCase(student2.getUserName())){
			return true;
		}
		else 
			return false;
	}
	
	public String isOlder( OCCStudent student2){
		
		 if(this.getAge() > student2.getAge())
			 return this.getFullName() + " is older than " + student2.getFullName();
		 else 
			 return student2.getFullName() + " is the older age of  " + this.getFullName();
	}
	
	public String isSameAge( OCCStudent student2){
		if (this.getAge() == student2.getAge())
			return this.getFullName() + " is the same age as " + student2.getFullName();
		else
			return this.getFullName() +" is not the same age as " + student2.getFullName();
	}
	
	public String isYounger(OCCStudent student2){
		if(this.getAge() < student2.getAge())
			return this.getFullName() + " is younger than " + student2.getFullName();
		else 
			return student2.getFullName() + " is younger than " + this.getFullName();
	}
	//methods to make are isYounger, isSameAge, 
	
	
	public String toString(){
		return "This is the students name: " + mFullName + "\nStudent has a C Number of " + mCNumber + " with a gpa of " + mGpa + 
				"\nThe Username of this student is: " + mUserName + "\nThe age of this student is " + mAge;
	}
}
