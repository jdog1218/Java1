package edu.orangecoastcollege.cs170.jgordon41.ic28;

public class Person {

	private String mHonorific;
	private String mName;
	
	public Person()
	{
		mHonorific = "";
		mName = "";		
	}
	
	public Person(String honorific, String name)
	{
		mHonorific = honorific;
		mName = name;
	}
	
	public Person(Person other)
	{
		mHonorific = other.mHonorific;
		mName = other.mName;
	}

	public String getHonorific() {
		return mHonorific;
	}

	public void setHonorific(String newHonorific) {
		mHonorific = newHonorific;
	}

	public String getName() {
		return mName;
	}

	public void setmName(String newName) {
		mName = newName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mHonorific == null) ? 0 : mHonorific.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (mHonorific == null) {
			if (other.mHonorific != null)
				return false;
		} else if (!mHonorific.equals(other.mHonorific))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		return true;
	}

	// Gets the full name with the honorific prefix in front (e.g. Ms. Smart Student)
	public String getFullName()
	{
		if (mHonorific.equals(""))
			return mName;
		else
			return mHonorific + " " + mName;
	}
	
	@Override
	public String toString() {
		return "Person [" + getFullName() + "]";
	}
	
	
	
}