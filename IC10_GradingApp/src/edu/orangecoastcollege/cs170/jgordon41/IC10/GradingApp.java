/**
 * Gordon, Joel
 * CS170
 * Mar-02-2017
 * 
 * IC10_GradingApp
 */
package edu.orangecoastcollege.cs170.jgordon41.IC10;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Joel
 *
 */
public class GradingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade, low= Double.MAX_VALUE, average = 0.0, high = Double.MIN_VALUE, sum = 0.0;
		int total = 0, numberAs = 0, numberBs = 0, numberCs = 0, numberDs = 0, numberFs = 0;
		Scanner consoleScanner = new Scanner(System.in);
		DecimalFormat zeroDp = new DecimalFormat("#.0");

		System.out.println("Please input grades one per line (or type -1 to quit): ");

		// to automatic align ctl+shift+F

		do {
			grade = consoleScanner.nextDouble();

			// if statement to see what grade
			if (grade >= 0) {
				if (grade >= 90.0)
					numberAs++;
				else if (grade >= 80.0)
					numberBs++;
				else if (grade >= 70.0)
					numberCs++;
				else if (grade >= 60.0)
					numberDs++;
				else
					numberFs++;
				total++;
				high = grade>=high ? grade:high;
				low = grade<=low ? grade:low;
				sum +=grade;
			}
			
		} while (grade >= 0);
		consoleScanner.close();
		average = sum/total;
		
		System.out.println("Total number of Grades: " + total + 
							"\nNumber of As: " + numberAs + 
							"\nNumber of Bs: " + numberBs + 
							"\nnumber of Cs: " + numberCs + 
							"\nNumber of Ds: " + numberDs +
							"\nNumber of Fs: " + numberFs + 
							"\nLow Grade: " + low + "%" + 
							"\nClass Average: " + zeroDp.format(average) + "%" + 
							"\nHigh Grade: " + high + "%");
		
	}

}
