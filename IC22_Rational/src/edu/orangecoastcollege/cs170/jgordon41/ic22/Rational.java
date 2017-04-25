package edu.orangecoastcollege.cs170.jgordon41.ic22;

public class Rational
{
    private int mNumertor, mDenominator;

    public Rational(int mNumertor, int mDenominator) throws ZeroDenominatorException 
    {
        this.mNumertor = mNumertor;
        setmDenominator(mDenominator);
    }

    public int getNumerator()
    {
        return mNumertor;
    }

    public void setmNumerator(int mNumertor)
    {
        this.mNumertor = mNumertor;
    }

    public int getDenominator()
    {
        return mDenominator;
    }

    public void setmDenominator(int denominator) throws ZeroDenominatorException
    {
        //check for zero denominator
        if(denominator == 0)
            //problem !!! Alert Java that ZeroDenominatorException
            throw new ZeroDenominatorException("Denominator cannot be zero");
        this.mDenominator = denominator;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Rational other = (Rational) obj;
        if (mDenominator != other.mDenominator) return false;
        if (mNumertor != other.mNumertor) return false;
        return true;
    }

    @Override
    
    public String toString() 
    {
        return getNumerator() + "/" + getDenominator();
    }
    
    
    
}
