package edu.orangecoastcollege.cs170.jgordon41.ic18;

import java.text.DecimalFormat;

/*
 * Gordon, Joel
 * cs170
 * April 11th, 2017
 * 
 * IC18_ISleepy
 */

import java.util.Scanner;

public class iSleepy
{

    public static void main(String[] args)
    {
        final String[] DAYS = {"Sunday", "Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner consoleScanner = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat("#0.00");
        
        double[] slept = new double[DAYS.length];
        int counter = 0;
        double total = 0;
        
        
        for(String day:DAYS){
            System.out.print("Enter number of hours slept on " + day + ": ");
            slept[counter] = consoleScanner.nextInt();
            total +=slept[counter];
            counter++;
        }
        consoleScanner.close();
        System.out.println("\nTotal Number of hours slept last week: " + total
                + "\nAverage number of hours slept per night: " + twoDP.format(total/slept.length) + "\n");
        
        int recommended = 0;
        int appropiate = 0;
        int notRecommended = 0;
        
        for(double night: slept){
            if(night >= 8 && night <= 10){//recommended nights of sleep
                recommended++;
            }else if(night >=7 && night <= 11)//appropriate nights of sleep
                appropiate++;
            else//not recommended
                notRecommended++;
        }
        
        System.out.println("According to the NSF, you slept: \n" + 
                            recommended + (recommended == 1 ? " night":" nights") + " of \"recommended\" Sleep.\n" + 
                            appropiate + (appropiate == 1 ? " night":" nights") + " of \"appropiate\" Sleep.\n" + 
                            notRecommended + (notRecommended == 1 ? " night":" nights") + " of \"not recommended\" Sleep.");
        

    }

}
