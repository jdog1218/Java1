import java.util.Scanner;

/**
 * Gordon, Joel
 * CS170
 * Feb-23-2017
 * 
 * ICO7_BasicCalculator
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
		
		String OUTPUT_MESSAGE = "*********************************************************************\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n"+
								"\n";
		
		operator = consoleScanner.next();
		
		System.out.print("Enter an Operand (number): ");
		operand1 = consoleScanner.nextDouble();
		System.out.print("Enter an Operand (number): ");
		operand2 = consoleScanner.nextDouble();
		
		
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
		}
		System.out.println(operand1 + operator + operand2 + " = " + result);
	}

}
