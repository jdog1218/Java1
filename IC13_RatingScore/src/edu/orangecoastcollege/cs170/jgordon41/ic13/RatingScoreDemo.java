/**
 * Gordon, Joel
 * CS170
 * Mar-16-2017
 * 
 * IC13_RatingScore
 */
package edu.orangecoastcollege.cs170.jgordon41.ic13;

/**
 * @author Joel
 *
 */
public class RatingScoreDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RatingScore rating = new RatingScore("The Transformers action movie", "I did not like the movie", 3, 5);
		
		RatingScore rating2 = new RatingScore("The Transformers action movie", "I did not like the movie", 3, 5);
		
		System.out.println(rating.toString());
		
		System.out.println("Is the 2 ratings the same? "); 
		
		//changed for test
		//rating.setDescription("This movie is great");
		
		
		if(rating.equals(rating2)){
			System.out.println("They are the Same");
		}else
			System.out.println("They are not the Same");

		rating.setDescription("The movie is very action like and i like it alot");
		System.out.println("\n" + rating.toString());
		
		System.out.println("Sercond Check if they are the same");
		if(rating.equals(rating2)){
			System.out.println("They are the Same");
		}else
			System.out.println("They are not the Same");
	}

}
