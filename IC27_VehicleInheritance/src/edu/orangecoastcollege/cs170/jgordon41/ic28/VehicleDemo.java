package edu.orangecoastcollege.cs170.jgordon41.ic28;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Gordon, Joel
 * 5/21/2017
 * CS170
 * 
 * IC27_VehicleInheritance
 */
public class VehicleDemo {

	public static void main(String[] args) {
		ArrayList<Vehicle> allVehicleList = new ArrayList<>();
		Person dylan = new Person("Mr.", "Dylan");
		
		Vehicle maclareanP1 = new Vehicle(727, "Maclearn", 8, dylan);
		Scanner consoleScanner = new Scanner(System.in);
		String name;
		Vehicle dogeRam = new Truck(34, "Dogde", 5 , new Person("Mr.", "Joel"), 400, 600);
		allVehicleList.add(dogeRam);
		allVehicleList.add(maclareanP1);
		do{
			consoleScanner.reset();
			System.out.print("Car or Truck (or type \"quit\")? ");
			String select = consoleScanner.nextLine();
			if(select.equalsIgnoreCase("quit"))
				break;
			if(select.equalsIgnoreCase("car")){
			System.out.print("Make of your Car: ");
			name = consoleScanner.nextLine();
			System.out.print("Enter name of Model: ");
			String make = consoleScanner.nextLine();
			System.out.print("How many Cylinders: ");
			int cynlinders = consoleScanner.nextInt();
			System.out.print("Please enter Horse Power: ");
			int horsePower = consoleScanner.nextInt();
			consoleScanner.nextLine();
			System.out.print("Please enter Owner: ");
			String ownerName = consoleScanner.nextLine();
			System.out.print("Please enter your sex? ");
			String sex = consoleScanner.nextLine();
			String honorific;
			if(sex.equalsIgnoreCase("male"))
				honorific = "Mr.";
			else{
				System.out.print("Please enter Your type of Miss or Mrs.");
				honorific = consoleScanner.nextLine().equalsIgnoreCase("Miss") ? "Miss":"Mrs.";
			}
			allVehicleList.add(new Vehicle(horsePower, make, cynlinders,new Person(honorific, ownerName)));
			}
			else{
				System.out.print("Name of Truck (or type \"quit\"): ");
				name = consoleScanner.nextLine();
				if(name.equalsIgnoreCase("quit"))
					break;
				System.out.print("enter name of dealer: ");
				String make = consoleScanner.nextLine();
				System.out.print("Please Cylinders: ");
				int cynlinders = consoleScanner.nextInt();
				System.out.print("Please enter Horse Power: ");
				int horsePower = consoleScanner.nextInt();
				consoleScanner.nextLine();
				System.out.print("Please enter Owner: ");
				String ownerName = consoleScanner.nextLine();
				String sex = consoleScanner.nextLine();
				String honorific;
				if(sex.equalsIgnoreCase("male"))
					honorific = "Mr.";
				else{
					System.out.print("Please enter Your type of Miss or Mrs.");
					honorific = consoleScanner.nextLine().equalsIgnoreCase("Miss") ? "Miss":"Mrs.";
				}
				allVehicleList.add(new Vehicle(horsePower, make, cynlinders,new Person(honorific, ownerName)));
			}
			System.out.println();
		}while(!name.equalsIgnoreCase("quit"));
		consoleScanner.close();
		System.out.println();
		for(Vehicle v:allVehicleList){
			System.out.println(v);
			System.out.println();
		}
	}

}
