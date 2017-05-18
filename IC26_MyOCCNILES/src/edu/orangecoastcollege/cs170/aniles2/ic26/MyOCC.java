package edu.orangecoastcollege.cs170.aniles2.ic26;
import java.util.ArrayList;
import java.util.HashMap;

public class MyOCC
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        String username="", course="";
        HashMap <String, ArrayList<String>> myOCC = new HashMap <> (40000);
        
        
        System.out.println("~~~~~~~~~~~~~~~~~~Welcome to MyOCC~~~~~~~~~~~~~~~~~~");
        
        do {            
            
            if (!myOCC.containsKey(username)) {
                //can't just add with .put(username, 1);
                //Have to create an array list of strings
                ArrayList <String> allCoursesList = new ArrayList <> ();
                allCoursesList.add(course);
                myOCC.put(username, allCoursesList);
            } else {
               ArrayList <String> allCoursesList = myOCC.get(username); //get list of courses for that particular user
               allCoursesList.add(course);
            }
            
        } while (!username.equalsIgnoreCase("quit"));

    }
}