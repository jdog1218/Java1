package edu.orangecoastcollege.cs170.jgordon41.ic22;

public class ZeroDenominatorException extends Exception
{
    public ZeroDenominatorException(String message){
        //pass the message to the super class (exception)
        super(message);
    }
}
