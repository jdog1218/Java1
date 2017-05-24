package edu.ornagecoastcollege.cs170.jgordon41.ic29;

import java.io.Serializable;

public class Meat extends PaleoFoods implements Serializable
{
    private int mCookingTemp,mType;
    
    /**
     * @param cookingTemp
     * @param type
     * @throws UnknownMeatException To have the right type
     */
    public Meat(String name, int calories, int carbohydrates, int cookingTemp, int type) throws UnknownMeatException
    {
        this.mCalories = calories;
        this.mCarbohydrates = carbohydrates;
        this.mName = name;
        mCookingTemp = cookingTemp;
        mType = type;
        if(type != 1 || type != 2 || type != 3)
            throw new UnknownMeatException();
    }

    /**
     * @return the cookingTemp
     */
    public int getCookingTemp()
    {
        return mCookingTemp;
    }

    /**
     * @param cookingTemp the cookingTemp to set
     */
    public void setCookingTemp(int cookingTemp)
    {
        mCookingTemp = cookingTemp;
    }

    /**
     * @return the type
     */
    public int getType()
    {
        return mType;
    }

    /**
     * @param type the type to set
     * @throws UnknownMeatException Unknown Type of Meat
     */
    public void setType(int type) throws UnknownMeatException
    {
        if(type != 1 || type != 2 || type != 3)
            throw new UnknownMeatException("Wrong Type of meat, Enter another type of meat");
        mType = type;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mCookingTemp;
        result = prime * result + mType;
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Meat other = (Meat) obj;
        if (mCookingTemp != other.mCookingTemp) return false;
        if (mType != other.mType) return false;
        return true;
    }
    
    public String toString(){
        return (getType()==1 ? "Meat: ":"Fish: ")+ this.mName + ", " + this.mCalories + " Calories, " + this.mCarbohydrates + 
                "g Carbs, " + this.mCookingTemp + " degrees F";
    }
}
