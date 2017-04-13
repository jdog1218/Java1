package edu.ornagecoastcollege.cs170.jgordon41.ic19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Gordon, Joel
 * cs170
 * 4/13/2017
 * 
 * IC19_LATemps
 */

public class LATemps
{

    public static void main(String[] args)
    {
        int[] temps = new int[30];
        double sum = 0.0;
        int high = 0, mode = 0;
        Scanner consoleScanner = new Scanner(System.in);
        DecimalFormat twoDP = new DecimalFormat("#.00");
        
        for (int day = 1; day <= temps.length; day++){
            System.out.print("Please enter daily high for September " + (day < 10 ? "0" + day:day) + ": ");
            temps[day-1] = consoleScanner.nextInt();
        }
        Arrays.sort(temps);
        high = temps[temps.length -1];
        System.out.println("~~~~~~~~~~~Temperature Statistics~~~~~~~~~~");
        int[] counts = new int[high+1];
        
        for(int t : temps){
            counts[t]++;
        }
        
        int maxCount = 0;
        for (int i = temps[0]; i < counts.length-1; i++){
            if(counts[i] > maxCount){
                maxCount = counts[i];
                mode = i;
            }
        }
        
        for(int i = 0; i < temps.length; i++){
            if(high < temps[i]){
                high = temps[i];
                }
            sum += temps[i];
        }
        
       
        
        System.out.println("September's highest daily temperature was: " + high);
        System.out.println("September's average high temperature was: " + twoDP.format(sum/temps.length));
        System.out.println("September's most frequent high temp: " + mode);
        
        
        
    }

}
