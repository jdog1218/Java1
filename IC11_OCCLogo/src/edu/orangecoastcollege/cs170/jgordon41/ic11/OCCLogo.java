/**
 * Gordon, Joel
 * CS170
 * Mar-07-2017
 * 
 * IC11_OCCLogo
 */
package edu.orangecoastcollege.cs170.jgordon41.ic11;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

/**
 * @author Joel
 *
 */
@SuppressWarnings("serial")
public class OCCLogo extends JApplet{

	/**
	 * @param args
	 */
	public void init(){
		setSize(1500,1400);
		setBackground(Color.WHITE);
	}
	public void paint(Graphics canvas){
		
		for (int y = 0; y <= 690; y += 230){
			for (int i = 0; i <=840; i += 210){
				canvas.setColor(Color.ORANGE);
				canvas.fillOval(i, y, 200, 200);
				
				canvas.setColor(getBackground());
				canvas.fillOval(i+10,10+y,180,180);
				
				canvas.setColor(Color.BLUE);
				canvas.fillArc(15+i, 15+y, 170, 170, 60, 260);
				canvas.setColor(Color.WHITE);
				canvas.fillOval(27+i, 30+y, 150, 150);
				
				canvas.setColor(Color.BLUE);
				canvas.fillArc(30+i, 36+y, 140, 140, 60, 260);
				canvas.setColor(Color.WHITE);
				canvas.fillOval(42+i, 52+y, 120, 120);
				
				canvas.setColor(Color.blue);
				canvas.drawString("Orange Coast College", 37+i, 220+y);
			}
		}
		
	}

}
