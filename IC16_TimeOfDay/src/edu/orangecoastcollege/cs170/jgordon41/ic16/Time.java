/**
 * CS170
 * Gordon, Joel
 * 4/4/2017
 * 
 * IC16_TimeOfDay
 */
package edu.orangecoastcollege.cs170.jgordon41.ic16;

import java.text.DecimalFormat;

/**
 * @author jgordon41
 *
 */
public class Time
{

    private int mHour;
    private int mMinute;
    
    public Time(int hour, int minute)
    {
        //check for invalid input
        if(hour < 0 || hour > 23)
            throw new IllegalArgumentException ("Error. Hour must be between 0 and 23.");
        if(minute < 0 || minute > 59)
            throw new IllegalArgumentException ("Error. Minute must be between 0 and 59.");
        this.mHour = hour;
        this.mMinute = minute;
    }
    
    public Time(Time otherTime){
        this(otherTime.mHour, otherTime.mMinute);
    }
    
    public Time(){
        this(0,0);
    }

    public int getHour()
    {
        return mHour;
    }

    public int getMinute()
    {
        return mMinute;
    }

    public void setHour(int mHour)
    {
        this.mHour = mHour;
    }

    public void setMinute(int mMinute)
    {
        this.mMinute = mMinute;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mHour;
        result = prime * result + mMinute;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Time other = (Time) obj;
        if (mHour != other.mHour) return false;
        if (mMinute != other.mMinute) return false;
        return true;
    }

    @Override
    public String toString()
    {
        DecimalFormat twoDigits = new DecimalFormat("00");
        return "Time [" + twoDigits.format(mHour) + ":" + twoDigits.format(mMinute) + (isAm() ? "AM":"PM") + "]";
    }
    
    private boolean isValid(int hour, int minute){
        if(hour < 0 || hour > 23)
            return false;
        if(minute < 0 || minute > 59)
            return false;
        return true;
    }

    public void setTime(int hour, int minute){
        if(isValid(hour, minute))
            throw new IllegalArgumentException ("Error. Hour must be between 0 and 23.");
        
        this.mHour = hour;
        this.mMinute = minute;
    }
    
    public boolean isAm(){
        return mHour < 12 && mMinute <= 59? true:false;
    }
    
    public boolean isPM(){
        return mHour > 12 && mMinute <=59 ? true:false; 
    }
}
