/**
 * Gordon, Joel
 * CS170
 * Feb-28-2017
 * 
 * IC09_Magic8Ball
 */
package edu.orangecoastcollege.cs170.jgordon41.ic09;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Joel
 *
 */
public class Magic8Ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner (System.in);
		
		String exit;
		String[] answers = {"It is certain",
							"It is decidedly so", 
							"Most likely",
							"Signs point to yes",
							"Reply hazy, try again",
							"Ask again later",
							"Don't count on it",
							"My sources say no", 
							"Without a doubt",
							"Yes definitely",
							"You may rely on it", 
							"As I see it, yes", 
							"Outlook good",
							"Yes", "Better not tell you now",
							"Cannot predict now",
							"Concentrate and ask again",
							"My reply is no",
							"Outlook not so good",
							"Very doubtful"};
		Random rng = new Random();
		
		do{
			System.out.println("What question would you like to ask the Magic 8 ball?\n");
			
			String question = consoleScanner.nextLine();
			//generate a random answer
			int number = rng.nextInt(20);
			
			String response = answers[number];
			System.out.println("The answer is: " + response + "\n\nWould you like to ask another question (type Y or N)?");
			exit = consoleScanner.nextLine();
		}while (exit.equalsIgnoreCase("Y"));
		
		System.out.println("Thank you for playing the Magic 8 Ball.");
		
		consoleScanner.close();
		

	}

}
