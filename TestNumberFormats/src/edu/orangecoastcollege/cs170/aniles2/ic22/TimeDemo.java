package edu.orangecoastcollege.cs170.aniles2.ic22;
import java.util.Scanner;
/*
 * Niles, Ashley
 * CS A170
 * May 2, 2017
 * IC #22 Time
 */
public class TimeDemo {

	public static void main(String[] args) throws InvalidHourException, InvalidMinuteException, InvalidMeridiemException{
		//Life is but a momentary glimpse of the wonder of this astonishing universe, and it is sad to see so many dreaming it away on spiritual fantasy

		Time enteredTime = new Time(1,1,"pm");
		Scanner consoleScanner = new Scanner(System.in);
		boolean validTime = false;
		
		do {
			try {				
				System.out.print("Please enter an hour: ");
				enteredTime.setHour(consoleScanner.nextInt()); 
				System.out.print("Please enter minutes: ");
				enteredTime.setMinute(consoleScanner.nextInt());
				System.out.print("Please specify AM or PM: ");
				consoleScanner.nextLine();
				enteredTime.setMeridiem(consoleScanner.nextLine());
				validTime = true;	
			}				
				catch(InvalidHourException e) {
					System.out.println(e.getMessage());
					validTime = false;
					}
				catch(InvalidMinuteException m) {
					System.out.println(m.getMessage());
					validTime = false;
				}

				catch(InvalidMeridiemException a) {
					System.out.println(a.getMessage());
					validTime = false;
				}
				
		} while(!validTime);
		
		System.out.println("\nThe time you entered is: "+enteredTime.toString());
		consoleScanner.close();
	}
}
