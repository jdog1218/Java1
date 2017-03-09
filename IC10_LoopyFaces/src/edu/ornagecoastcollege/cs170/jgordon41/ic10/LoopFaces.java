/**
 * Gordon, Joel
 * CS170
 * Mar-09-2017
 * 
 * IC10_LoopyFaces
 */
package edu.ornagecoastcollege.cs170.jgordon41.ic10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JApplet;

/**
 * @author Joel
 *
 */
public class LoopFaces extends JApplet{

	/**
	 * @param args
	 */
	
	public void init(){
		setSize(1000,1000);
	}
	
	public void paint(Graphics canvas){
		
		for (int i = 1; i <= 850; i += 85){
			for (int row = 1; row <= 750; row +=75){
			canvas.setColor(i % 2 == 0 ? Color.BLUE:Color.YELLOW);
			canvas.fillOval(5+row, 5+i, 75, 75);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(10+row, 10+i, 100, 100);
			
			canvas.fillOval(35+row, 35+i, 6, 20);
			canvas.fillOval(75+row, 35+i, 6, 20);
			canvas.fillRect(57+row, 65+i, 6, 8);
			canvas.drawArc(40+row, 80+i, 40, 15, 0, -180);
			}
		}
	}
	

}
