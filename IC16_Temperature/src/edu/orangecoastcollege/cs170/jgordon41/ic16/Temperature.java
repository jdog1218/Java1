/**
 * CS170
 * Gordon, Joel
 * 4/4/2017
 * 
 * IC16_Temperature
 */
package edu.orangecoastcollege.cs170.jgordon41.ic16;

/**
 * @author jgordon41
 *
 */
public class Temperature
{

    private double mDegrees;
    TemperatureUnit mUnit;
    public Temperature(double degrees, TemperatureUnit unit)
    {
        mDegrees = degrees;
        this.mUnit = unit;
    }
    
    public Temperature(Temperature other)
    {
        mDegrees = other.mDegrees;
        this.mUnit = other.mUnit;
    }

    public Temperature()
    {
        mDegrees = 0.0;
        this.mUnit = TemperatureUnit.CELSIUS;
    }

    public double getDegrees()
    {
        return mDegrees;
    }

    public void setDegrees(double degrees)
    {
        mDegrees = degrees;
    }

    public TemperatureUnit getUnit()
    {
        return mUnit;
    }

    public void setUnit(TemperatureUnit unit)
    {
        mUnit = unit;
    }
    
    public boolean convertTo(TemperatureUnit other){
        if(other.equals(TemperatureUnit.CELSIUS) && !mUnit.equals(other)){
            this.setDegrees(((mDegrees*9)/5)+32);
            return true;
        }else if(other.equals(TemperatureUnit.FAHRENHEIT) && !mUnit.equals(other)){
            this.setDegrees(((mDegrees/9)*5)-32);
            return true;
        }
        return false;
        
    }
    
    public Temperature inOtherUnit(TemperatureUnit otherUnit){
        if(otherUnit.equals(TemperatureUnit.CELSIUS) && !mUnit.equals(otherUnit))
            return new Temperature (((mDegrees*9)/5)+32, TemperatureUnit.CELSIUS);
        else{
            return new Temperature (((mDegrees/9)*5)-32, TemperatureUnit.FAHRENHEIT);
        }
        
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(mDegrees);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((mUnit == null) ? 0 : mUnit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Temperature other = (Temperature) obj;
        if (Double.doubleToLongBits(mDegrees) != Double.doubleToLongBits(other.mDegrees)) return false;
        if (mUnit != other.mUnit) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Temperature [" + mDegrees + " degrees " + mUnit + "]";
    }
}
