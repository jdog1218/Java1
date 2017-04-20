package edu.orangecoastcollege.cs170.jgordon41.ic21;

import java.util.Arrays;
import java.util.Scanner;

public class ManagingTimeSheets
{
    public static Scanner consoleScanner = new Scanner(System.in);
    public static final int DAYS = 5;
    public static final int EMPLOYEES = 3;
    
    public static void main(String[] args)
    {
        double[][] timeSheet = new double[EMPLOYEES][DAYS];
        promptUser(timeSheet);
        getArraySum(timeSheet);
        
        
        consoleScanner.close();
    }
    //The Redudant emthods used multiple times
    public static void getArraySum(double[][] array){
        int counter = 1;
        for (double[] row : array){
            double sum = 0.0;
            for (double col : row){
                sum += col;
            }
            System.out.println("Total hours worked for employee #" + counter + " : " + sum);
            System.out.println("Average hours worked for employee #" + counter + " : " + (sum/DAYS) + "\n");
            counter++;
        }
    }
    
    public static void promptUser(double[][] timesheetData){
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        for (int employee = 0; employee < timesheetData.length; employee++){
            for (int hours = 0; hours < timesheetData[employee].length; hours++){
                System.out.print("Please enter hours worked for employee #" + (employee+1) + " on  " + daysOfWeek[hours] + " :");
                timesheetData[employee][hours] = consoleScanner.nextDouble();
            }
            System.out.println();
        }
    }
}
