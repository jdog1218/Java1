package edu.orangecoastcoallege.cs170.jgordon41.FinalExam;

import java.io.Serializable;

public class Motorcycle extends Cycle implements Serializable
{
    private int mDisplacement;
    private double mFuelCapacity;
    public Motorcycle(String make, int displacement, double fuelCapacity)
    {
        super(make, 2);
        mDisplacement = displacement;
        mFuelCapacity = fuelCapacity;
    }
    public int getDisplacement()
    {
        return mDisplacement;
    }
    public double getFuelCapacity()
    {
        return mFuelCapacity;
    }
    public void setDisplacement(int displacement)
    {
        mDisplacement = displacement;
    }
    public void setFuelCapacity(double fuelCapacity)
    {
        mFuelCapacity = fuelCapacity;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mDisplacement;
        long temp;
        temp = Double.doubleToLongBits(mFuelCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Motorcycle other = (Motorcycle) obj;
        if (mDisplacement != other.mDisplacement) return false;
        if (Double.doubleToLongBits(mFuelCapacity) != Double.doubleToLongBits(other.mFuelCapacity)) return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "Motorcycle: " + mMake + ", " + mNumberOfWheels + " wheels, " + mDisplacement + " cc, " + mFuelCapacity +
                " gallons.";
    }
    
    
    
}
