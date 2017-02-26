/**
 * Gordon, Joel
 * CS170
 * Feb-24-2017
 * 
 * IC07_RockPaperScissors
 */
package com.orangeCoastCollege.CS170.IC07.jgordon41;

import java.util.Scanner;

/**
 * @author Joel
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stance = {"R", "P", "S"};
		String player1, player2 = "";
		Scanner consoleScanner = new Scanner(System.in);
		String[] result = {"Player 1 wins!!", "Player 2 wins!!", "It's a Draw!"};  
		
		System.out.print("Player 1: please input your option: R for Rock, P for paper, S for scissors:");
		player1 = consoleScanner.next();
		System.out.print("Player 2: please input your option: R for Rock, P for paper, S for scissors:");
		player2 = consoleScanner.next();
		
		
		if (player1.equalsIgnoreCase(stance[0])){
			if (player1.equalsIgnoreCase(player2)) System.out.println(result[2]);
			else if (player2.toUpperCase().equals(stance[1])) System.out.println(result[1] + " Rock beats Paper!");
			else if (player2.toUpperCase().equals(stance[2])) System.out.println(result[0] + " Rock beats Scissors!");
		}
		else if(player1.equalsIgnoreCase(stance[1])){
			if (player1.equals(player2)) System.out.println(result[2]);
			else if (player2.toUpperCase().equals(stance[1])) System.out.println(result[0] + " Paper beats Rock!");
			else if (player2.toUpperCase().equals(stance[2])) System.out.println(result[1] + " Scissors beats Paper!");
		}else {
			if (player1.equalsIgnoreCase(player2)) System.out.println(result[2]);
			else if (player2.toUpperCase().equals(stance[1])) System.out.println(result[0] + " Scissors beats Paper!");
			else if (player2.toUpperCase().equals(stance[0])) System.out.println(result[1] + " Rock beats Scissors!");
		}
		consoleScanner.close();
	}

}
