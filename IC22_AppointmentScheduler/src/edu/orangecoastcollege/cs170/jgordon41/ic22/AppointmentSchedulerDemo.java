package edu.orangecoastcollege.cs170.jgordon41.ic22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppointmentSchedulerDemo
{
	
	public static void main(String [] args) throws TimeInUseException, InvalidTimeException{
		int time=0;
		String[] names = new String[6];
		for (int i = 0; i < names.length; i++){
			names[i] = "";
		}
		boolean error = false;
		Scanner consoleScanner = new Scanner(System.in);
		
		do{
			try{
				error = false;
				System.out.print("What Time would like to schedule: ");
				time = consoleScanner.nextInt();
				consoleScanner.nextLine();
				if(time > 6 || time < 1)
					throw new InvalidTimeException("Please Enter a valid Time! 1-6");
				System.out.print("Please Enter Your name: ");
				String inputName = consoleScanner.nextLine();
				if(names[time].equalsIgnoreCase(""))
					names[time] = inputName;
				else{
					throw new TimeInUseException("It is Taken");
				}
			}catch(InputMismatchException e){
				System.out.println("Please enter a valid Number, Not CHARCTERS!");
				error = true;
				consoleScanner.nextLine();
			}catch(TimeInUseException e){
				System.out.println(e.getMessage());
				error = true;
			}catch (InvalidTimeException e){
				System.out.println(e.getMessage());
				error = true;
			}
			if(!error){
				System.out.print("Would you like to schedule another?(Y for yes or N for no): ");
				String another = consoleScanner.next();
				if(another.equalsIgnoreCase("Y")){
					error = true;
				}
			}
		}while(error);
		int hour = 0;
		for(String name : names){
			hour++;
			System.out.println("Hour " + hour + ": " + name);
		}
		consoleScanner.close();
	}
}
