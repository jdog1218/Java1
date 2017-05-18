package edu.orangecoastcollege.cs170.jgordon41.ic28;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		ArrayList<Vehicle> allVehicleList = new ArrayList<>();
		Person dylan = new Person("Mr.", "Dylan");
		
		Vehicle maclareanP1 = new Vehicle(727, "Maclearn", 8, dylan);
		Scanner consoleScanner = new Scanner(System.in);
		String input = "";
		allVehicleList.add(maclareanP1);
		do{
			System.out.print("Name of Car (or type \"quit\"): ");
			String name = consoleScanner.nextLine();
			if(name.equalsIgnoreCase("quit"))
				break;
			System.out.print("enter name of dealer: ");
			String make = consoleScanner.nextLine();
			System.out.print("Please Cylinders: ");
			int cynlinders = consoleScanner.nextInt();
			System.out.println("Please enter Horse Power: ");
			int horsePower = consoleScanner.nextInt();
			System.out.println("Please enter Owner: ");
			String ownerName = consoleScanner.nextLine();
			System.out.print("Please enter your honorific: ");
			String honorific = consoleScanner.nextLine();
			allVehicleList.add(new Vehicle(horsePower, make, cynlinders,new Person(honorific, ownerName)));
		}while(input.equalsIgnoreCase("quit"));
		for(Vehicle v:allVehicleList){
			System.out.println(v);
		}
	}

}
