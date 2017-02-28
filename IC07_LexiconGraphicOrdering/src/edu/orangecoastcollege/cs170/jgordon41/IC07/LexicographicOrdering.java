/**
 * Gordon, Joel
 * CS170
 * Feb-27-2017
 * 
 * IC07_LexiconGraphicOrdering
 */
package edu.orangecoastcollege.cs170.jgordon41.IC07;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Joel
 *
 */
public class LexicographicOrdering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
        String firstString;
        String secondString;
        String thirdString;
        TreeSet<String> treeSet=new TreeSet<>();
        
        System.out.println("Please enter 3 seperate strings in different order: ");
        firstString = consoleScanner.next();
        secondString = consoleScanner.next();
        thirdString = consoleScanner.next();
        consoleScanner.close();
        treeSet.add(firstString);
        treeSet.add(secondString);
        treeSet.add(thirdString);
        
        System.out.println("\nIn lexicongraphic Ordering, the strings you entered are: ");
        for(String s:treeSet){
            System.out.println(s);
        }
	}

}
