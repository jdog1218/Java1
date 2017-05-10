package edu.orangecoastcollege.cs170.mpaulding.ic24;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializedDogDemo
{

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ArrayList<Dog> allDogsList = new ArrayList<>();
        
        // Create ObjectInputStream to read the binary file (Dogs.dat)
        ObjectInputStream fileReader;
        // Create ObjectOutputStream to write the binary file (Dogs.dat)
        ObjectOutputStream fileWriter;
        
        // Create a reference to the binary file that will be used
        // for both reading and writing
        // Binary Files ARE NOT automatically created
        File binaryFile = new File("Dogs.dat");
        System.out.println("Previously saved dogs from binary file:");
        // If binary file does not exist, tell user to enter new dogs
        if(!binaryFile.exists())
        {
            System.out.println("[None. Please enter new Dog data.]");
        }
        else
        {
            // Step 2) Load in all the existing dogs from binary file into ArrayList            
            // Connect the ObjectInputStream to read binary file:
            try
            {
                fileReader = new ObjectInputStream(new FileInputStream(binaryFile));
                allDogsList = (ArrayList<Dog>)fileReader.readObject();
                // Step 3) Loop through each Dog in the ArrayList and print to console
                for (Dog d :  allDogsList)
                    System.out.println(d);
                
            }
            catch (IOException e)
            {
                System.out.println("Binary file cannot be read.");
            }
            catch (ClassNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            
        //after reading from binary file, Let's allow user
        //to enter new dogs
        
        String name= "", breed;
        int age;
        Scanner consoleScanner = new Scanner(System.in);
        do{
            System.out.print("Please enter the Dogs name (or \"quit\" to exit): ");
            name = consoleScanner.nextLine();
            if(!name.equalsIgnoreCase("quit")){
                System.out.print("Please enter the breed: ");
                breed = consoleScanner.nextLine();
                System.out.print("Please enter the Age: ");
                age = consoleScanner.nextInt();
                
                allDogsList.add(new Dog(name,breed,age));
                System.out.println();
                consoleScanner.nextLine();
                }
        }while(!name.equalsIgnoreCase("quit"));
        
        consoleScanner.close();
        try{
            fileWriter = new ObjectOutputStream(new FileOutputStream(binaryFile));
            fileWriter.writeObject(allDogsList);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
