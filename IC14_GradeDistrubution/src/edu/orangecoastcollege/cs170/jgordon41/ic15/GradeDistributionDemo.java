/**
 * Gordon, Joel
 * CS170
 * Mar-22-2017
 * 
 * IC14_GradeDistrubution
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;

import java.text.DecimalFormat;

/**
 * @author Joel
 *
 */
public class GradeDistributionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GradeDistribution grade = new GradeDistribution(18, 6, 4, 7, 9);
		
		DecimalFormat ZeroDp = new DecimalFormat("#");
		
		
		System.out.println(grade.getPercentBs());
		System.out.println(ZeroDp.format(grade.getPercent("a")) + "%");
		
		System.out.println(grade);
		
	}

}
