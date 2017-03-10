/**
 * Gordon, Joel
 * CS170
 * Mar-09-2017
 * 
 * IC12_OrangeCountyCities
 */
package edu.orangecoastcollege.cs170.jgordon41.ic12;

import java.util.Scanner;

/**
 * @author Joel
 *
 */
public class OCityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String city;
		Scanner consoleScanner = new Scanner(System.in);
		boolean livesInOC = false;
		
		System.out.print("In what city do you live in?");
		city = consoleScanner.nextLine().toUpperCase().replace(' ', '_');  //New York

		for (OCity singleCity: OCity.values()){
			
			if (String.valueOf(singleCity).equals(city)){
				livesInOC = true;
				break;
			}
			
		}
		if(livesInOC)
			System.out.println("You are a city in Orange County!!!");
		else
			System.out.println("Sorry, you have a winter!");
	}

}
