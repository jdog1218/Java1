/**
 * 
 */
package edu.orangecoastcollege.cs170.jgordon41.ic12;

import java.util.Scanner;

/**
 * @author JG
 *
 */
public class OCCStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		
		OCCStudent student1 = new OCCStudent("Joel Gordon", "jgordon41", "c02483606", 2.39, 20);
		OCCStudent student2 = new OCCStudent("Tim Strom", "tstrom23", "c14353498", 2.98, 18);
		
		System.out.println("Hello, I have already made 2 students with toString() so they will output: \n" + student1.toString() + "\n\n" + student2.toString() + 
				"\n\nWhat would you like to do, \ntype 1 to compare the student age \ntype 2 to compare names" + 
				"\ntype 3 if you want to compare students to see if you have the same student");
		int wanted = consoleScanner.nextInt();
		
		switch (wanted){
		case 1:System.out.println(student1.isOlder(student2));
			break;
		case 2: System.out.println(student1.equals(student2) ? "They have the same age" : "They do not have the same Name");
		break;
		case 3: System.out.println(student1.equalStudents(student2) ? "They are the same student": "They are not the Same Student");
		break;
		default:System.out.println("Thanks for trying to type in something.");
		}
		consoleScanner.close();
	}

}
