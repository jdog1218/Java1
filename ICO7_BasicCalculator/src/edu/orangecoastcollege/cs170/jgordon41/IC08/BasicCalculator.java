package edu.orangecoastcollege.cs170.jgordon41.IC08;
import java.util.Scanner;


/**
 * Gordon, Joel
 * CS170
 * Feb-23-2017
 * 
 * ICO8_BasicCalculator
 */

/**
 * @author Joel
 *
 */

public class BasicCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String operator;
		double operand1, operand2, result = 0;
		Scanner consoleScanner = new Scanner (System.in);
		
		final String OUTPUT_MESSAGE = "*********************************************************************\n"+
								"**                                                                 **\n"+
								"**                 WELCOME TO JOEL'S BASIC CALCULATOR              **\n"+
								"**                                                                 **\n"+
								"*********************************************************************\n"+
								"Type one of the following operators: \n"+
								"+  (for adding numbers)\n"+
								"-  (for subtracting numbers)\n"+
								"*  (for multiplying numbers)\n"+
								"/  (for dividing numbers)\n"+
								"%  (for finding the reaminder when two numbers are divided)\n"+
								"^  (for exponentiation - one number raised to the power of the other)\n"+
								"*********************************************************************";
		
		System.out.println(OUTPUT_MESSAGE);
		
		operator = consoleScanner.next();
		
		System.out.print("Enter an Operand (number): ");
		operand1 = consoleScanner.nextDouble();
		System.out.print("Enter an Operand (number): ");
		operand2 = consoleScanner.nextDouble();
		
		consoleScanner.close();
		
		switch (operator){
		case "+":result = operand1 + operand2;
			break;
		case "-":result = operand1 - operand2;
		break;
		case "/":result = operand1 / operand2;
		break;
		case "*":result = operand1 * operand2;
		break;
		case "%":result = operand1 % operand2;
		break;
		case "^":result = Math.pow(operand1, operand2);
		break;
		default: System.out.println("Operator not recognized");
		System.exit(0);
		}
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}

}
