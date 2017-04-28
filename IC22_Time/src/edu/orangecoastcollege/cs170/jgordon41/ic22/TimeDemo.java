package edu.orangecoastcollege.cs170.jgordon41.ic22;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TimeDemo
{
	
	public static void main (String [] args) throws InvalidHourException, InvalidMinuteException{
		Scanner consoleScanner = new Scanner(System.in);
		boolean verifyTime = false;
		Time time = new Time(2,2);
		
		do{
			
			try{
				System.out.print("Please enter A Time to see if Valid: \nHour: ");
				time.setHour(consoleScanner.nextInt());
				System.out.print("Please enter Minutes: ");
				time.setMinute(consoleScanner.nextInt());
				verifyTime = true;
			}catch (InputMismatchException mis){
				System.out.println("Please enter a valid Number, (NOT CHARACTERS!)");
				verifyTime = false;
			}catch (InvalidHourException e){
				System.out.println(e.getMessage());
				verifyTime = false;
			}catch (InvalidMinuteException e){
				System.out.println(e.getMessage());
				verifyTime = false;
			}
			consoleScanner.nextLine();
		}while(!verifyTime);
		System.out.println(time.toString() + " is Valid");
		consoleScanner.close();
		
		
	}
	
}


