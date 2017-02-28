package edu.orangecoastcollege.cs170.jgordon41.IC08;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JFrame;
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
        DecimalFormat zeroDP = new DecimalFormat("#");
        
        double weight,height, age;
        String sex = "";
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
        
        String[] activity = {"Sendentary", "Some Activity", "Active", "Highly Active"};
        Object selectiveValue = JOptionPane.showInputDialog(null, "Choose One", "Activity", JOptionPane.INFORMATION_MESSAGE, null, activity, activity[0]);
        String activityFactor = selectiveValue.toString();
        
        
        if (genderInput == 0 )
	        calories = 66 + (6.23*weight)+(12.7*height)-(6.8*age);
        else
        	calories = 655 + (4.35*weight)+(4.7*height)-(4.7*age);//remeber to Round for final value
        
    	if (activityFactor.equals(activity[0])){
        	calories *= 1.2;
        	bars = calories/CALORIES_PER_BAR;
        }else if (activityFactor.equals(activity[1])){
        	calories *= 1.3;
        	bars = calories/CALORIES_PER_BAR;
        }else if (activityFactor.equals(activity[2])){
        	calories *= 1.4;
        	bars = calories/CALORIES_PER_BAR;
        }else if (activityFactor.equals(activity[3])){
        	calories *= 1.5;
        	bars = calories/CALORIES_PER_BAR;
        }else {
        	String invalid = "Please restart and enter a valid input ";
        	JOptionPane.showMessageDialog(null, invalid, "Invalid, Check", JOptionPane.ERROR_MESSAGE);
        	System.exit(0);
        }
        
        //end of male and female check
        
        String output = "As a " + sex + " your BMR x Activity Factor is " + 
        				zeroDP.format(calories) + " and you need to eat " + 
        				zeroDP.format(bars) + " chocolate bars \nto maintain this amount of calories.";
        JOptionPane.showMessageDialog(null, output);
        
        //System.out.println("\nBmr (female): " + zeroDP.format(caloriesFemale) + " calories");
        //System.out.println("Bmr (male): " + zeroDP.format(caloriesMale) + " calories");
        
        
        //System.out.println("\nIf you are female, you need to consume " + oneDP.format(barsFemale) + " chocolate bars to maintain weight.");
        //System.out.println("If you are male, you need to consume " + oneDP.format(barsMale) + " chocolate bars to maintain weight.");
        
    }

}
