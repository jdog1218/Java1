/**
 * Gordon, Joel
 * CS170
 * May-17-2017
 * 
 * IC26_HikingLog
 */
package edu.orangecoastcollege.cs170.jgordon41.ic26;

import java.io.*;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Gordon, Joel
 * CS170
 * jgordon41
 * 
 * IC26_HikingLog
 *
 */
public class HikingLog {

	static HashMap<Hike, Integer> hikingLog;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		hikingLog = new HashMap<Hike,Integer>();
		double miles;int count =1;
		Scanner consoleScanner = new Scanner(System.in);
		String name = "", dateCompleted, comment;
		try {
			ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(new File("hikinglog.dat")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("---------------------Hiking Log------------------------");
		
		do{
			System.out.print("Please enter name of hike completed (or \"quit\" to exit):");
			name = consoleScanner.nextLine();
			if(name.equalsIgnoreCase("quit"))
				break;
			System.out.print("Please enter the date of completion (MM/DD/YYYY)   :");
			dateCompleted = consoleScanner.nextLine();
			System.out.print("Please enter the number of miles: ");
			miles = consoleScanner.nextDouble();
			System.out.print("Please comment about taking the hike, " + name + " : ");
			comment = consoleScanner.nextLine();
			Hike input = new Hike(name, dateCompleted, comment, miles);
			hikingLog.put(input, count);
		}while(name.equalsIgnoreCase("quit"));
		

	}

}
