package edu.orangecoastcollege.cs170.jgordon41.ic26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyOcc {

	public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        String username="", course="";
        HashMap <String, ArrayList<String>> myOCC = new HashMap <> (40000);
        int count = 0, studentNew = 0;
        Scanner consoleScanner = new Scanner(System.in);
        
        System.out.println("~~~~~~~~~~~~~~~~~~Welcome to MyOCC~~~~~~~~~~~~~~~~~~");
        
        do {            
        	System.out.print("Please enter Student username (or \"quit\" to exit): ");
        	username = consoleScanner.nextLine();
            if (!myOCC.containsKey(username)) {
            	if(username.equalsIgnoreCase("quit"))
             	   break;
            	System.out.print("Please Enter course to enroll in: ");
                course = consoleScanner.nextLine();
                //can't just add with .put(username, 1);
                //Have to create an array list of strings
            	
                ArrayList <String> allCoursesList = new ArrayList <> ();
                allCoursesList.add(course);
                myOCC.put(username, allCoursesList);
                studentNew++;
                count++;
            } else {
            	System.out.print("Please Enter course to enroll in: ");
                course = consoleScanner.nextLine();
            	ArrayList <String> allCoursesList = myOCC.get(username); //get list of courses for that particular user
               allCoursesList.add(course);
               count++;
            }	System.out.println();
            
        } while (!username.equalsIgnoreCase("quit"));
        consoleScanner.close();
        System.out.println("--------------------Spring 2017 Enrollment------------\n");
        for(String usernameCheck : myOCC.keySet()){
    		System.out.println("Student: "+ usernameCheck);
    		for(int i = 0; i < myOCC.get(usernameCheck).size(); i++){
    			System.out.print((i==0 ? "Courses: " + myOCC.get(usernameCheck).get(i):", " + myOCC.get(usernameCheck).get(i)));
    		}
    		System.out.println("\n");
        }
        System.out.println("\nTotal Students Enrolled: " + studentNew + "\nTotal Courses enrolled: " + count);
        
        //I cant figure how i am getting this
        int previous = 0;
        String person = "";
        String previousPerson = "";
        for(String key : myOCC.keySet()){
        	int mostCoursesNumber = 0;
        	previous = mostCoursesNumber;
        	person = key;
        	for(int i = 0; i < myOCC.get(key).size(); i++){
        		mostCoursesNumber++;
        	}
        	if(mostCoursesNumber>previous){
        		previous = mostCoursesNumber;
        		previousPerson = person;
        	}
        }
        System.out.println("Student with most courses: " + person);
    }

}
