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
	
	public boolean equals(OCCStudent student1, OCCStudent student2){
		boolean sameName = false;
		
		if (student1.getFullName().equalsIgnoreCase(student2.getFullName()))
			sameName = true;
		
		return sameName;
	}
	
	public String isOlder(OCCStudent student1, OCCStudent student2){
		
		 if(student1.getAge() > student2.getAge())
			 return student1.getFullName() + " is older than " + student2.getFullName();
		 else 
			 return student2.getFullName() + " is the older age of  " + student1.getFullName();
	}
	
	public String isSameAge(OCCStudent student1, OCCStudent student2){
		if (student1.getAge() == student2.getAge())
			return student1.getFullName() + " is the same age as " + student2.getFullName();
		else
			return student1.getFullName() +" is not the same age as " + student2.getFullName();
	}
	
	public String isYounger(OCCStudent student1, OCCStudent student2){
		if(student1.getAge() < student2.getAge())
			return student1.getFullName() + " is younger than " + student2.getFullName();
		else 
			return student2.getFullName() + " is younger than " + student1.getFullName();
	}
	//methods to make are isYounger, isSameAge, 
	
	
	public String toString(){
		return "This is the students name: " + mFullName + "\nStudent has a C Number of " + mCNumber + "with a gpa of " + mGpa + 
				"\nThe Username of this student is: " + mUserName + "\nThe age of this student is " + mAge;
	}
}
