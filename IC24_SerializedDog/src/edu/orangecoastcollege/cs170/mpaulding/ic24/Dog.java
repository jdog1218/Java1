package edu.orangecoastcollege.cs170.mpaulding.ic24;

import java.io.Serializable;

// In order to serialize objects (e.g. Dogs), we need to tell Java
// this class is SERIALIZABLE
public class Dog implements Serializable {

	private String mName;
	private String mBreed;
	private double mAge;

	// Parameterized constructor
	public Dog(String newName, String newBreed, double newAge) {
		mName = newName;
		mBreed = newBreed;
		mAge = newAge;
	}

	// Copy constructor
	public Dog(Dog otherDog) {
		mName = otherDog.mName;
		mBreed = otherDog.mBreed;
		mAge = otherDog.mAge;
	}

	public double getAge() {
		return mAge;
	}

	public String getName() {
		return mName;
	}

	public String getBreed() {
		return mBreed;
	}

	public void setAge(double newAge) {
		mAge = newAge;
	}

	public void setName(String newName) {
		mName = newName;
	}

	public void setBreed(String newBreed) {
		mBreed = newBreed;
	}

	public double ageInHumanYears() {
		if (mAge <= 2)
			return mAge * 11;
		else
			return (mAge - 2) * 5 + 22;
	}

	@Override
	public boolean equals(Object obj) {
		Dog otherDog = (Dog) obj;

		return (this.mName.equals(otherDog.mName) && this.mBreed.equals(otherDog.mBreed) && this.mAge == otherDog.mAge);
	}

	@Override
	public String toString() {
		return "Dog [name=" + mName + ", breed=" + mBreed + ", age=" + mAge + "]";
	}
}