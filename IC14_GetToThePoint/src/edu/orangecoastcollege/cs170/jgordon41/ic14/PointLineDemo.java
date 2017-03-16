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
public class PointLineDemo {

	
	public static void main(String [] args){
		
		//midterm test demo for point on coordinate plane
		Point p1 = new Point(2,3);
		Point p2 = new Point();
		Point p3 = new Point(p1);
		Line l1 = new Line(p1,p2);
		
		System.out.println(p1);
		
		p1.setX(3);
		p1.setY(4);
		
		System.out.println(p1);
		
		System.out.println(p1.equals(p2) ? "The Same":"Not The same" );
		
		
		System.out.println(p2.distanceTo(p1));
		
		System.out.println(l1.length(p2,p1));
		
		
	}
	
	

}
