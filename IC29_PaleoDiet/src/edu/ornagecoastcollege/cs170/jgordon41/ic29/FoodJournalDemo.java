package edu.ornagecoastcollege.cs170.jgordon41.ic29;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodJournalDemo {
	static ArrayList<PaleoFoods> foodList = new ArrayList<>();
	static ObjectOutputStream fileWriter;
	static ObjectInputStream fileReader;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		File binaryFile = new File("FoodJournalFile.dat");

		if (!binaryFile.exists()) {
			System.out.println("[No paleo Foods]");
		} else {
			try {
				fileReader = new ObjectInputStream(new FileInputStream(binaryFile));
				try {
					foodList = (ArrayList<PaleoFoods>) fileReader.readObject();
					for(PaleoFoods f: foodList){
						System.out.println(f);
					}
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				}
				for (PaleoFoods p : foodList) {
					System.out.println(p);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Scanner consoleScanner = new Scanner(System.in);

		boolean quit = false;
		System.out.println("~~~~~~~~~~~Welcome to the paleo Food Journal~~~~~~~~~~~");
		do {
			int input = 0;
			RepititionStatement();
			input = consoleScanner.nextInt();
			consoleScanner.nextLine();
			switch (input) {
			case 1: // Meat
				String nameMeat = "";
				System.out.print("Please enter the Name of the Meat: ");
				nameMeat = consoleScanner.nextLine();
				System.out.print("Enter (1) for Meat and (2) for Fish: ");
				int type = 0;
				type = consoleScanner.nextInt();
				System.out.print("How many Calories was it? ");
				int calo = 0;
				calo = consoleScanner.nextInt();
				System.out.print("How many Carbohydrates? ");
				int cabo = 0;
				cabo = consoleScanner.nextInt();

				Meat meat;
				try {
					meat = new Meat(nameMeat, calo, cabo, 250, type);
					foodList.add(meat);
				} catch (UnknownMeatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// try{

				// }catch (UknownMeatException e){

				// }
				break;
			case 2:// Produce
				System.out.print("What was the name of the Produce eaten? ");
				String name = consoleScanner.nextLine();
				System.out.print("How many calories? ");
				int cal = consoleScanner.nextInt();
				System.out.print("How many CarboHydrates? ");
				int carb = consoleScanner.nextInt();
				Produce pro = new Produce(name, cal, carb, false);
				System.out.print("Enter (1) for organic or (2) for non-Organic ");
				pro.setOrganic(consoleScanner.nextInt() == 1 ? true : false);
				foodList.add(pro);
				break;
			case 3:// quit
				quit = true;
				break;
			}

		} while (!quit);
		try {
			fileWriter = new ObjectOutputStream(new FileOutputStream("binaryFile.dat"));
			fileWriter.writeObject(foodList);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void RepititionStatement() {
		if (!foodList.isEmpty()) {
			for (PaleoFoods f : foodList) {
				System.out.println(f);
			}
		} else
			System.out.println("No food yet!");
		System.out.println("");
		System.out.println("*******Option Menu *******\nEnter (1) to record a Meat"
				+ "\nEnter (2) to record a produce\nEnter (3) to quit");
	}

	public static int TotalCalories(ArrayList<PaleoFoods> foods) {
		int sum = 0;
		for (PaleoFoods f : foods) {
			sum += f.getCalories();
		}
		return sum;
	}

	public static int OrganicProducedConsumed(ArrayList<Produce> food) {
		int total = 0;
		for (Produce pf : food) {
			if (pf instanceof Produce) {
				Produce p = (Produce) pf;
				if (p.getOrganic())
					total += 1;
			}
		}
		return total;
	}
}
