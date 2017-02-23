import java.util.Scanner;

public class BirthdayWizard {
	public static void main(String[] args)
	{
		int year, birthYear, futureYear, currentAge, futureAge;
		Scanner consoleScanner = new Scanner(System.in);
		year = 2017;
		System.out.print("Please enter your Birth Year...");
		birthYear = consoleScanner.nextInt();
		currentAge = (year - birthYear)-1;
		System.out.print("Your age is " + currentAge +"." + "\n\nWhat age do u want to be...");
		futureAge = consoleScanner.nextInt();
		futureYear = birthYear + futureAge;
		System.out.println("The year you will turn " + futureAge + " is " + futureYear);
		consoleScanner.close();
	}
}