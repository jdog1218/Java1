package edu.orangecoastcollege.cs170.jgordon41.ic28;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDemo {
		public static void main(String[] args) {
			ArrayList<Vehicle> allVehicleList = new ArrayList<>();
			
			Scanner consoleScanner = new Scanner(System.in);
			String name = "";
			do{
				consoleScanner.nextLine();
				System.out.print("Do you have a boat or a car? ");
				boolean boat = (consoleScanner.nextLine().equalsIgnoreCase("boat"));
				if(!boat){
				System.out.print("Name of Car  (or type \"quit\"): ");
				name = consoleScanner.nextLine();
				if(name.equalsIgnoreCase("quit"))
					break;
				System.out.print("enter name of dealer: ");
				String make = consoleScanner.nextLine();
				System.out.print("Please enter a Year it was made: ");
				int year = consoleScanner.nextInt();
				allVehicleList.add(new Car(year, make, 4));
				}
				System.out.print("Name of Boat  (or type \"quit\"): ");
					name = consoleScanner.nextLine();
				if(name.equalsIgnoreCase("quit"))
					break;
				System.out.print("enter name of dealer: ");
				String make = consoleScanner.nextLine();
				System.out.print("Please how many Cabins: ");
				int cabins = consoleScanner.nextInt();
				System.out.print("Please enter Year: ");
				int year = consoleScanner.nextInt();
				allVehicleList.add(new Boat(year, make, cabins));
			}while(!name.equalsIgnoreCase("quit"));
			consoleScanner.close();
			for(Vehicle v:allVehicleList){
				System.out.println(v);
			}
		}

}
