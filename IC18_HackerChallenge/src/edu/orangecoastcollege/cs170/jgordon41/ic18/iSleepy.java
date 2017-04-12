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
    
    public static int belowYear;
    public static AgeGroups group;
    public static int recommended = 0, notRecommended = 0, appropiate = 0;
    public static int recommendedNSFLow, notRecommendedNSF, appropiateNSFLow;
    public static int recommendedNSFHigh, notRecommendedNSFHigh, appropiateNSFHigh;
    
    public static void main(String[] args)
    {
        final String[] DAYS = {"Sunday", "Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner consoleScanner = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat("#.00");
        
        double[] slept = new double[DAYS.length];
        int counter = 0;
        double total = 0;
        
        System.out.print("Please Enter your age: ");
        consoleScanner.nextInt();
        System.out.print("Is it below a year, 1 for YES, and 2 for NO: ");
        belowYear = consoleScanner.nextInt();
        
        for(String day:DAYS){
            System.out.print("Enter number of hours slept on " + day + ": ");
            slept[counter] = consoleScanner.nextInt();
            total +=slept[counter];
            counter++;
        }
        consoleScanner.close();
        System.out.println("\nTotal Number of hours slept last week: " + total
                + "\nAverage number of hours slept per night: " + twoDP.format(total/slept.length) + "\n");
        
        for(double night: slept){
            if(night >= 8 && night <= 10){//recommended nights of sleep
                recommended++;
            }else if(night >=7 && night <= 11)//apporaite nights of sleep
                appropiate++;
            else//not recommended
                notRecommended++;
        }
        
        System.out.println("According to the NSF, you slept: \n" + 
                            recommended + (recommended == 1 ? " night":" nights") + " of \"recommended\" Sleep.\n" + 
                            appropiate + (appropiate == 1 ? " night":" nights") + " of \"appropiate\" Sleep.\n" + 
                            notRecommended + (notRecommended == 1 ? " night":" nights") + " of \"not recommended\" Sleep.");
        

    }
    
    public static void getAgeGroup(int age){
        if(age >= 0 && age <= 3 && belowYear == 1){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if(age >= 4 && age <= 11 && belowYear == 1){
            group = AgeGroups.INFANTS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }
        else if(age >= 1 && age <= 2 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if(age >= 3 && age <= 5 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if (age >= 6 && age <= 13 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if (age >= 14 && age <= 17 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if (age >= 18 && age <= 25 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else if (age >= 26 && age <= 64 && belowYear == 2){
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }else {
            group = AgeGroups.NEWBORNS;
            recommendedNSFLow = 14;
            notRecommendedNSF = 11;
            appropiateNSFLow = 11;
            recommendedNSFHigh = 17;
            notRecommendedNSFHigh = 19;
            appropiateNSFHigh = 18;
        }
        
    }

}
