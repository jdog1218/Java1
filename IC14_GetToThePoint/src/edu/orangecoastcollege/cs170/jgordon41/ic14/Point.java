/**
 * Gordon, Joel
 * CS170
 * Mar-16-2017
 * 
 * IC14_GetToThePoint
 */
package edu.orangecoastcollege.cs170.jgordon41.ic14;

import java.text.DecimalFormat;

/**
 * @author Joel
 *
 */
public class Point {

	private int mX, mY;
	
	private DecimalFormat zeroDp = new DecimalFormat("#");
	
	public Point(int X, int Y) {
		// TODO Auto-generated constructor stub
		this.mX = X;
		this.mY = Y;
	}
	
	public Point(Point other){
		this.mX = other.getX();
		this.mY = other.getY();
	}
	
	public Point(){
		this.mX = 0;
		this.mY = 0;
	}
	
	public int getX() {
		return mX;
	}
	
	public void setX(int x) {
		mX = x;
	}
	
	public int getY() {
		return mY;
	}
	
	public void setY(int y) {
		mY = y;
	}
	
	public boolean equals(Point otherPoint){
		if (mX == otherPoint.getX() && mY == otherPoint.getY()){
			return true;
		}
		else
			return false;
	}
	
	
	public String toString(){
		return "Point (" + mX + ", " + mY + ")";
	}
	

	public double distanceTo(Point other){
		double diffX2 = Math.pow(other.mX - mX, 2);
		double diffY2 = Math.pow(other.mY - mY, 2);
		
		return Math.round(Math.sqrt(diffX2 + diffY2));
	}
	
}
