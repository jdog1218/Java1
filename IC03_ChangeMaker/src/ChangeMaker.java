import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		int cents = 0, quarters = 0, dimes = 0, nickels = 0, pennys = 0;
		final int QUARTER = 25, DIME = 10, NICKEL = 5, PENNY = 1;

		System.out.println("Enter a whole number from 1 to 99\n"
				+ "I will find a combination of coins to equal that amount of change ");
		cents = consoleScanner.nextInt();
		System.out.println(cents + " cents in coins can be given as:");

		quarters = cents / QUARTER;
		cents = cents % QUARTER;
		dimes = cents / DIME;
		cents = cents % DIME;
		nickels = cents / NICKEL;
		cents = cents % NICKEL;
		pennys = cents / PENNY;
		cents = cents % PENNY;

		System.out.println(quarters + " quarter(s)");
		System.out.println(dimes + " dime(s)");
		System.out.println(nickels + " nickel(s)");
		System.out.println(pennys + " penny(s)");

		consoleScanner.close();
	}

}
