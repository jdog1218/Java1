package edu.ornagecoastcollege.cs170.jgordon41.ic29;

import java.io.Serializable;

public abstract class PaleoFoods implements Serializable
{
    protected int mCalories, mCarbohydrates;
    protected String mName;
    /**
     * @return the name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        mName = name;
    }

    /**
     * @return the calories
     */
    public int getCalories()
    {
        return mCalories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories)
    {
        mCalories = calories;
    }

    /**
     * @return the carbohydrates
     */
    public int getCarbohydrates()
    {
        return mCarbohydrates;
    }

    /**
     * @param carbohydrates the carbohydrates to set
     */
    public void setCarbohydrates(int carbohydrates)
    {
        mCarbohydrates = carbohydrates;
    }
    
}
