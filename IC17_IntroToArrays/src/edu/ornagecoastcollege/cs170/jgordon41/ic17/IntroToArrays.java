/**
 * Gordon, Joel
 * Apr 6, 2017
 * cs170
 * 
 * IntroToArrays.java
 */
package edu.ornagecoastcollege.cs170.jgordon41.ic17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jgordon41
 *
 */
public class IntroToArrays
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        int[] value = new int[10];
        
        double sum = 0.0;
        for(int i = 0; i < value.length; i++){
            System.out.print("Please enter value #" + (i + 1) + ": ");
            value[i] = consoleScanner.nextInt();
            sum += value[i];
        }
        Arrays.sort(value);
        
        System.out.println("\nThe Largest Value in the Array is: " + value[value.length -1]);
        System.out.println("The Smallest Value in the Array is: " + value[0]);
        System.out.println("The Sum of all Values is: " + sum);
        double average = sum/value.length;
        System.out.println("The Average of all Values is: " + average);
        consoleScanner.close();
        

    }

}
