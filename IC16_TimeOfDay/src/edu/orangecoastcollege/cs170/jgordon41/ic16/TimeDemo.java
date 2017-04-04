/**
 * CS170
 * Gordon, Joel
 * 4/4/2017
 * 
 * IC16_Time
 */
package edu.orangecoastcollege.cs170.jgordon41.ic16;

import java.util.Scanner;

/**
 * @author jgordon41
 *
 */
public class TimeDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        int hour, minute;
        
        System.out.print("Please enter a time, hour then minute ");
        hour = consoleScanner.nextInt();
        minute = consoleScanner.nextInt();
        
        System.out.println("Checking if the argument works");
        
        Time time = new Time(hour,minute);
        
        System.out.println("Out Put " + time);
        

    }

}
