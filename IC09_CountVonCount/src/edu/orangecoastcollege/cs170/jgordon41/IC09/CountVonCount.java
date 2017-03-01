/**
 * Gordon, Joel
 * CS170
 * Feb-28-2017
 * 
 * IC09_CountVonCount
 */
package edu.orangecoastcollege.cs170.jgordon41.IC09;
import java.util.Scanner;
/**
 * @author Joel
 *
 */
public class CountVonCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		int magicNumber = 0;
		
		
		System.out.println("Count von Count:  What is the magic number of the day?");
		
			magicNumber = consoleScanner.nextInt();
			
			if(magicNumber < 0 ){
				System.out.println("I'm sorry, but the Count von Count only counts positive numbers!  Muhahahaha" );
				System.exit(0);
				
			}
			
		
		
		for (int i = 1; i <= magicNumber; i++){
			System.out.print(i==magicNumber ? magicNumber:i + ", ");
		}
		consoleScanner.close();
		System.out.println("\n" + magicNumber + "! " + magicNumber + " is the magic number of the day. " + magicNumber +
							" dancing vegetables are here to celebrate with me!  I love dancing vegetables!");

	}
}

