package edu.orangecoastcollege.cs170.jgordon41.ic15;

/*
 * Gordon,Joel
 * cs170
 * March 21st,2017
 * 
 * IC15_Dog
 */

public class DogDemo
{

    public static void main(String[] args)
    {
        Dog scooby = new Dog("Scooby", "Great Dane", 7.0);
        Dog myDog = new Dog(scooby);
        
        System.out.println(scooby + "\n" + myDog + "\n");
        
        if(scooby.equals(myDog))
            System.out.println("They are the same Dog");
        else
            System.out.println("They are not the Same Dog");
        myDog.setName("Bruno");
        myDog.setBreed("German Shepard");
        myDog.setAge(3.0);
        
        System.out.println("\n" + scooby + "\n" + myDog + "\n");
        
        if(scooby.equals(myDog))
            System.out.println("They are the same Dog");
        else
            System.out.println("They are not the Same Dog");

    }

}
