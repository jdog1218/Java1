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
		
		Hangman word1 = new Hangman("Fire");
		Scanner consoleScanner = new Scanner(System.in);
		char guess = 'a';
		
		System.out.println("This is hangman, I chose a word for you. Here are all the letters " + word1.getDisgusedWord() + "\nYou got Seven Guesses, GoodLuck.");
		do {
			System.out.println("Please guess a letter, ");
			guess = consoleScanner.next().charAt(0);
			
			System.out.println(word1.makeGuesses(guess));
			
			if(word1.getNumberOfGuesses() <= 0)
				break;
			
		}while(word1.isFound());
		
		System.out.println(word1.getNumberOfGuesses() == 0 ? "You ran out of guesses.": "You have made all the right guesses.");
		System.out.println("Thanks for playing.");
		
		consoleScanner.close();
		

	}

}
