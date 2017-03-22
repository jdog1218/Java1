/**
 * Gordon, Joel
 * CS170
 * Mar-16-2017
 * 
 * IC14_GetToThePoint
 */
package edu.orangecoastcollege.cs170.jgordon41.ic14;

/**
 * @author Joel
 *
 */
public class Line {

	private Point p1, p2;
	
	public Line(int x, int x2, int y, int y2) {
		
		p1 = new Point(x, y);
		p2 = new Point(x2, y2);
		
	}
	
	public Line(Point other, Point other2){
		p1 = new Point(other.getX(), other.getY());
		p2 = new Point(other.getX(), other.getY());
		
	}
	
	public Line(Line other){
		p1 = new Point (other.getX1(), other.getY1());
		p2 = new Point (other.getX2(), other.getY2());
	}

	
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public int getX1(){
		return p1.getX();
	}
	
	public int getY1(){
		return p1.getY();
	}
	
	public int getX2(){
		return p2.getX();
	}
	
	public int getY2(){
		return p2.getY();
	}
	
	public void setX1(int x){
		p1.setX(x);
	}
	
	public void setY1(int y){
		p1.setX(y);
	}
	
	public void setX2(int x){
		p2.setX(x);
	}
	
	public void setY2(int y){
		p2.setX(y);
	}
	
	
	public boolean equals(Line other){
		if(p1.equals(other))
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "Line[(x1 = " + p1.getX() + ", y1 = " + p1.getY() + "), (x2 = " + p2.getX() + ", y2 = " + p2.getY() + ")]";
	}
	
	public double length(Point p1, Point p2){
		return p1.distanceTo(p2);
	}
	
}
