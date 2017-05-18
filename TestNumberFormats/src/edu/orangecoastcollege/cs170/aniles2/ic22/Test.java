package edu.orangecoastcollege.cs170.aniles2.ic22;
public class Test{
	public static void main(String[]args){
		String word = "a";
		while(word.length() < 10){
			word = "b" + word + "b";
		}
		System.out.println(word);
	}
}