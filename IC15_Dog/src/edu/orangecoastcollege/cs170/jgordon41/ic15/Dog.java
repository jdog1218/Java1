/*
 * Gordon,Joel
 * cs170
 * March 21st,2017
 * 
 * IC15_Dog
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;



public class Dog
{

    private double mAge;
    private String mName, mBreed;
    
    /**
     * 
     */
    public Dog(double age, String name, String breed)
    {
        mAge = age;
        mName = name;
        mBreed = breed;
    }
    
    public Dog (Dog otherDog){
        mAge = otherDog.getAge();
        mName = otherDog.getName();
        mBreed = otherDog.getBreed();
    }

    public double getAge()
    {
        return mAge;
    }

    public String getName()
    {
        return mName;
    }

    public String getBreed()
    {
        return mBreed;
    }

    public void setAge(double mAge)
    {
        this.mAge = mAge;
    }

    public void setName(String mName)
    {
        this.mName = mName;
    }

    public void setBreed(String mBreed)
    {
        this.mBreed = mBreed;
    }
    
    public boolean equals(Dog obj){
        if(obj.mAge == mAge)
            if(mBreed.equalsIgnoreCase(obj.getBreed()))
                if(mName.equalsIgnoreCase(obj.getName()))
                    return true;
        return false;
    }
    
    public String toString(){
        return "Dog [Name =" + mName + ", Breed =" + mBreed + ", Age =" + mAge + ", Human Age =" + ageInHumanYears() + "]";
    }
    
    public double ageInHumanYears(){
        
        if(mAge<= 2)
            return mAge * 11;
        else{
            return ((mAge-2)*5)+22;
        }
        
    }
    
}
