/**
 * Gordon, Joel
 * CS170
 * Mar-07-2017
 * 
 * IC11_GuessingGame
 */
package edu.orangecoastcollege.cs170.jgordon41.ic11;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Joel
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// need string for the input and using substring to check
		//random number generator
		//consoleScanner
		
		String inputString = "";
		Random rng = new Random();
		Scanner consoleScanner = new Scanner(System.in);
		
		
		//int answer = rng.nextInt(90000) + 10000, 
		int sumCorrect = 0, numberCorrect = 0;
		//System.out.println("The number is: " + answer + "\n");
		int answer = 14924;
		
		System.out.println("I have randomly chosen a 5-digit code for you to guess.\n" + 
							"Each time you guess, I will tell you how many digits are correct and the sum of the digits that are correct.\n" + 
							"For example, if the number is \"68420\" and you guess 12468, I will respond:\n" + 
							"Number of Digits Correct: 1\n" + 
							"Sum of Digits Correct: 4\n" + 
							"From deduction, you will know the 4 was correct in the guess.\n\n" + 
							"Now its your turn..................................................................\n\n");
		
		do {
			System.out.print("Please enter a 5-digit code (your guess): ");
			inputString = consoleScanner.nextLine();
			if(Integer.parseInt(inputString) >= 10000 && Integer.parseInt(inputString) <= 99999){
				for (int i = 0; i < 5; i++){
					String answerString = String.valueOf(answer);
					if(inputString.charAt(i) == answerString.charAt(i)){
						numberCorrect++;
						sumCorrect = sumCorrect + Integer.parseInt(answerString.substring(i, i+1));
						
					}
				}
				
				System.out.println("Number of digits correct: " + numberCorrect);
				System.out.println("Sum of Digits Correct: " + sumCorrect + "\n");
				
			}else
				System.out.println("Guess must be a 5-digit code between 10000 and 99999.\n");
		}while(numberCorrect < 5);
		consoleScanner.close();
	}

}
