/**
 * 
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;

/**
 * @author JG
 *
 */
public class MovieDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie(6,5,3,7,4, "James Cameron", "Titanic", "pg-13");
		Movie movieCopy = new Movie(movie1);
		
		System.out.println(movie1 + "\n\n" + movieCopy);
		
		System.out.println(movie1.equals(movieCopy) ? "They equal each other": "They do not equal each other");
		
		movie1.addRating(3);
		
		System.out.println(movie1.equals(movieCopy) ? "They equal each other": "They do not equal each other");
		
	}

}
