package edu.orangecoastcollege.cs170.jgordon41.ic22;

public class RationalDemo
{

    public static void main(String[] args)
    {
        //create 2 fractions 1/2 and 1/0
        try
        {
            Rational f1 = new Rational(-1,-2);
            System.out.println(f1);
            Rational f2 = new Rational(1,0);
            System.out.println(f2);
        }
        catch (ZeroDenominatorException e)
        {
            System.out.println(e.getMessage());
            
        }

    }

}
