package edu.orangecoastcoallege.cs170.jgordon41.FinalExam;

import java.io.Serializable;

public abstract class Cycle implements Serializable
{
    protected String mMake;
    protected int mNumberOfWheels;
    
    protected Cycle(String make, int wheels){
        this.mMake = make;
        this.mNumberOfWheels= wheels;
    }
    
    public String getMake()
    {
        return mMake;
    }
    public int getNumberOfWheels()
    {
        return mNumberOfWheels;
    }
    public void setMake(String make)
    {
        this.mMake = make;
    }
    public void setNumberOfWheels(int numberOfWheels)
    {
        this.mNumberOfWheels = numberOfWheels;
    }
}
