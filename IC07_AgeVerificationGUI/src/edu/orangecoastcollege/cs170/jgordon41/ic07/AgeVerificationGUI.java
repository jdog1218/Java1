/**
 * Gordon, Joel
 * CS170
 * Feb-21-2017
 * 
 * IC07_AgeVerificationGUI
 */
package edu.orangecoastcollege.cs170.jgordon41.ic07;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Joel
 * description: 
 */

public class AgeVerificationGUI extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true){
			//shows a confirmation dialog (Chocices of Yes/No);
			int response = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older?", "Age Verification", JOptionPane.YES_NO_OPTION);
			
			//make a decsion based on user input:
			//0 == YES
			if (response == JOptionPane.YES_OPTION){
				//siplay diaglogue that says proced on adult
				JOptionPane.showMessageDialog(null, "Proceed on adult", "You are an Adult", JOptionPane.INFORMATION_MESSAGE);
				break;//will break operation if true
			}
			//1 == NO
			else if (response == JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog(null, "You shall NOT PASS!!!!", "Minor Dectected", JOptionPane.ERROR_MESSAGE);
				break;//will break operation if true
			}
			else {
				//displays that says "Please answer the question
				JOptionPane.showMessageDialog(null, "Please go back and answer the question!", "Aversion Detected", JOptionPane.ERROR_MESSAGE);
				//no break and repeats
			}
		}
	}

}
