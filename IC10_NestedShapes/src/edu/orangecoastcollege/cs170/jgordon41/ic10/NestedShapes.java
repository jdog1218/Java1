/**
 * Gordon, Joel
 * CS170
 * Mar-02-2017
 * 
 * IC10_NestedShapes
 */
package edu.orangecoastcollege.cs170.jgordon41.ic10;

/**
 * @author Joel
 *
 */
public class NestedShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++){
			for(int col = 1; col <= 4; col++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row = 1; row <= 4; row++){
			for(int col = 1; col <=4; col++){
				System.out.print(row);
			}
			System.out.println();
		}

		//for the prymid shape
		for(int row = 1; row <= 4; row++){
			for(int col = 1; col <=4; col++){
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
