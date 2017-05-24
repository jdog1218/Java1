/**
 * 
 */
package edu.ornagecoastcollege.cs170.jgordon41.ic29;

import java.io.Serializable;

/**
 * @author jgordon41
 *
 */

public class Produce extends PaleoFoods implements Serializable
{

    private boolean organic;
    
    
    /**
     * @param name
     * @param cal
     * @param carb
     * @param organic
     */
    public Produce(String name, int cal, int carb, boolean organic){
        this.mName = name;
        this.mCalories = cal;
        this.mCarbohydrates = carb;
        this.setOrganic(organic);
    }
    
    /**
     * @return the organic
     */
    public boolean getOrganic()
    {
        return organic;
    }

    /**
     * @param organic the organic to set
     */
    public void setOrganic(boolean organic)
    {
        this.organic = organic;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (organic ? 1231 : 1237);
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
        Produce other = (Produce) obj;
        if (organic != other.organic) return false;
        return true;
    }

    public String toString(){
        return (this.getOrganic() ? "Organic Produce: ": "Produce: ") + 
                this.mName + ", " + this.mCalories + " Calories, " +
                this.mCarbohydrates + "g Carbs";
    }

}
