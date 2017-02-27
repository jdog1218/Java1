package edu.orangecoastcollege.cs170.jgordon41.IC07;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Gordon, Joel
 * CS170
 * Feb-16-2017
 * 
 * IC06_BasalMetabolicRatePartDeux
 */

/**
 * @author Joel
 * @version 2
 */
public class BasalMetabolicRatePartDeux extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner (System.in);
        DecimalFormat zeroDP = new DecimalFormat("#");
        
        double weight,height, age;
        int activityFactor = 0;
        String sex;
        double calories, bars = 0.0;//must use Rounding method
        final double CALORIES_PER_BAR = 230;
        
        String weightString = JOptionPane.showInputDialog("Please enter your weight (lb): ");
        weight = Integer.parseInt(weightString);
        String heightString = JOptionPane.showInputDialog("Please enter your height (in): ");
        height = Integer.parseInt(heightString);
        String ageString = JOptionPane.showInputDialog("Please enter your age: ");
        age = Integer.parseInt(ageString);
        
        String[] gender = {"Male", "Female"};
        
        int genderInput = JOptionPane.showOptionDialog(
        		null, "Calculate Bmr we need gender:", "Gender", 
        		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, gender, gender[0]);
        
        
        System.out.println("Please Neter the number with uour activity factor: \n"
        				+  "1. Sendentary (Not Active)\n"
        				+  "2. SomeWhat Active (excercise occasionally)\n"  + 
        				   "3. Active (excercise 3-4 times per week) \n" + 
        				   "4. Highly Active (excercise every)");
        
        
        activityFactor = consoleScanner.nextInt();
        consoleScanner.close();
        
        if (genderInput == 1 )
	        calories = 66 + (6.23*weight)+(12.7*height)-(6.8*age);
        else
        	calories = 655 + (4.35*weight)+(4.7*height)-(4.7*age);//remeber to Round for final value
        
        	if (activityFactor == 1){
            	calories *= 1.2;
            	bars = calories/CALORIES_PER_BAR;
            }else if (activityFactor == 2){
            	calories *= 1.3;
            	bars = calories/CALORIES_PER_BAR;
            }else if (activityFactor == 3){
            	calories *= 1.4;
            	bars = calories/CALORIES_PER_BAR;
            }else if (activityFactor == 4){
	        	calories *= 1.5;
	        	bars = calories/CALORIES_PER_BAR;
	        }else {
	        	System.out.println("Please restart and enter a valid input ");
	        	System.exit(0);
	        }
        
        //end of male and female check
        
        System.out.println("As a " + sex + " your BMR x Activity Factor is " + 
        				zeroDP.format(calories) + " and you need to eat " + 
        				zeroDP.format(bars) + " chocolate bars \nto maintain this amount of calories.");    
        
        //System.out.println("\nBmr (female): " + zeroDP.format(caloriesFemale) + " calories");
        //System.out.println("Bmr (male): " + zeroDP.format(caloriesMale) + " calories");
        
        
        //System.out.println("\nIf you are female, you need to consume " + oneDP.format(barsFemale) + " chocolate bars to maintain weight.");
        //System.out.println("If you are male, you need to consume " + oneDP.format(barsMale) + " chocolate bars to maintain weight.");
        
    }

}
