/**
 * 
 * IC27_HackerChallenge
 */
package edu.orangecoastcollege.cs170.jgordon41.ic27;

import java.io.Serializable;

/**
 * @author Joel
 *
 *IC27_ Waste of Time because its one point and I need to get other things done, I have to make the pet class in book
 * at 386-388;
 * Dont have time
 *
 */
public class Pet implements Serializable{

	
	protected String mName;
	protected int mAge;
	protected double mWeight;
	
	public Pet(String name, int age, double weight) {
		super();
		mName = name;
		mAge = age;
		mWeight = weight;
	}
	
	public Pet(){
		mName = "No more yet.";
		mAge = 0;
		mWeight = 0.0;
	}
	
	public Pet(Pet copy){
		
	}

	public String getName() {
		return mName;
	}

	public int getAge() {
		return mAge;
	}

	public double getWeight() {
		return mWeight;
	}

	public void setName(String name) {
		mName = name;
	}

	public void setAge(int age) {
		mAge = age;
	}

	public void setWeight(double weight) {
		mWeight = weight;
	}
	
	

}
