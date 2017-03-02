import java.util.Random;

package edu.orangecoastcollege.cs170.jgordon41.ic09;
/**
 * Gordon, Joel
 * CS170
 * Mar-02-2017
 * 
 * IC09_BatmanAndRiddler
 */

/**
 * @author Joel
 *
 */
public class BatmanAndRiddler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Holy digits Batman!  The Riddler is planning his next caper somewhere on Pennsylvania Avenue. "
				+ "		    \nIn his usual sporting fashion, the Riddler has left the address in the form of a puzzle. "
				+ "		    " + 
				"\nThe address on Pennsylvania is a four-digit number where all the following criteria are true:");
		System.out.println("All four digits are different\n" + 
							"The digit in the thousands place is three times the digit in the tens place\n"
							+ "The number is odd\n" + "The sum of all four digits == 27");
		
		Random rng = new Random();
		int randomNumber = rng.nextInt(1000)+1;
		
		

	}

}
