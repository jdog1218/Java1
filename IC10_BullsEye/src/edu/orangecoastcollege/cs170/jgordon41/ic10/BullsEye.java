/**
 * Gordon, Joel
 * CS170
 * Mar-02-2017
 * 
 * IC10_BullsEye
 */
package edu.orangecoastcollege.cs170.jgordon41.ic10;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

/**
 * @author Joel
 *
 */
public class BullsEye extends JApplet{

	public void init(){
		setSize(600,600);
	}
	public void paint(Graphics canvas){
		/*
		canvas.setColor(Color.RED);
		canvas.fillOval(50, 50, 500, 500);
		
		canvas.setColor(Color.WHITE);
		canvas.fillOval(100, 100, 400, 400);
		
		canvas.setColor(Color.RED);
		canvas.fillOval(150, 150, 300, 300);
		
		canvas.setColor(Color.WHITE);
		canvas.fillOval(200, 200, 200, 200);
		*/
		
		for(int i = 1; i<= 9;i++){
			if (i %2 == 1)
				canvas.setColor(Color.red);
			else
				canvas.setColor(Color.WHITE);
			
			canvas.fillOval(50 + (i-1)*25, 50 + (i-1)*25, 500-(i-1)*50, 500 - (i-1)*50);
			
		}
		
		//add 50 each time and subtract size by 100 each time
		
	}
	

}
