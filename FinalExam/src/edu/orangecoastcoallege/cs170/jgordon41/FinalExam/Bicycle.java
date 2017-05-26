package edu.orangecoastcoallege.cs170.jgordon41.FinalExam;

import java.io.Serializable;

public class Bicycle extends Cycle implements Serializable
{
    private int mFramesize;
    private int mCranks;
   
    public Bicycle(String make, int framesize, int cranks) throws InvalidFrameSize
    {
        super(make, 2);
        setFramesize(framesize);
        mCranks = cranks;
    }

    public int getFramesize()
    {
        return mFramesize;
    }

    public int getCranks()
    {
        return mCranks;
    }

    public void setFramesize(int framesize) throws InvalidFrameSize
    {
        switch (framesize){
            case 15: mFramesize = framesize;
            break;
            case 17: mFramesize = framesize;
            break;
            case 19: mFramesize = framesize;
            break;
            default:
                throw new InvalidFrameSize("Invalid frame size: Only 15\" (small), 17\" (medium) or 19\" (large) frame sizes are recognized.");
        }
    }

    public void setCranks(int cranks)
    {
        mCranks = cranks;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mCranks;
        result = prime * result + mFramesize;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Bicycle other = (Bicycle) obj;
        if (mCranks != other.mCranks) return false;
        if (mFramesize != other.mFramesize) return false;
        return true;
    }

    @Override
    public String toString()
    {
        String frame = "";
        switch (getFramesize()){
            case 15: frame = "Small";
            break;
            case 17: frame = "Medium";
            break;
            case 19: frame = "Large";
            break;
        }
        return "Bicycle: " + mMake + ", " + mNumberOfWheels + " Wheels, " + mFramesize + "\" Frame(" +
                frame + "), "
                + mCranks + " Gears";
    }
    
    
    
}
