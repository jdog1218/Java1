/**
 *Gordon, Joel
 *Mar 31, 2017
 *
 * IC15_Hangman
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;

import java.util.Scanner;

/**
 * @author JG
 *
 */
public class HangmanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hangman word1 = new Hangman("Struck");
		Scanner consoleScanner = new Scanner(System.in);
		char guess = 'a';
		
		System.out.println("This is hangman, I chose a string for you.");
		System.out.println(word1.getSecretWord());
		do {
			System.out.println("Please guess a letter, ");
			guess = consoleScanner.next().charAt(0);
			
			System.out.println(word1.makeGuesses(guess));
			
			
		}while(word1.isFound() || word1.getNumberOfGuesses() == 0);
		
		System.out.println(word1.getNumberOfGuesses()==0 ? "You ran out of guesses.": "You have made all the right guesses.");
		System.out.println("Thanks for playing.");
		
		consoleScanner.close();
		

	}

}
