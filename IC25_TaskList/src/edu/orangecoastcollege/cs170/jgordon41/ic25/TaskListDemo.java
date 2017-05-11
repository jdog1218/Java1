package edu.orangecoastcollege.cs170.jgordon41.ic25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskListDemo
{
    public static void main(String[] args){
        Scanner consoleScanner = new Scanner(System.in);
        String taskName = "";
        String deadLine;
        String dueDate;
        int priority;
        ObjectInputStream fileReader;
        ObjectOutputStream fileWriter;
        File binaryFile = new File("TaskList.dat");
        ArrayList<Task> taskList= new ArrayList<>();
        System.out.println("Previously taskes saved from binary file:");
        if(!binaryFile.exists())
        {
            System.out.println("[None. Please enter new Task data.]");
        }
        else
        {
            // Step 2) Load in all the existing dogs from binary file into ArrayList            
            // Connect the ObjectInputStream to read binary file:
            try
            {
                fileReader = new ObjectInputStream(new FileInputStream(binaryFile));
                taskList = (ArrayList<Task>)fileReader.readObject();
                // Step 3) Loop through each Dog in the ArrayList and print to console
                for (Task t :  taskList)
                    System.out.println(t);
                
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
        
        do{
            System.out.print("Please enter the Task name (or \"quit\" to exit): ");
            taskName = consoleScanner.nextLine();
            if(!taskName.equalsIgnoreCase("quit")){
                System.out.print("Please enter the Due Date: ");
                dueDate = consoleScanner.nextLine();
                System.out.print("Please enter the Dead Line: ");
                deadLine = consoleScanner.nextLine();
                System.out.print("Please enter Prioirty of Task: ");
                priority = consoleScanner.nextInt();
                
                taskList.add(new Task(deadLine,dueDate,priority,taskName));
                System.out.println();
                consoleScanner.nextLine();
                }
        }while(!taskName.equalsIgnoreCase("quit"));
        
        consoleScanner.close();
        try{
            fileWriter = new ObjectOutputStream(new FileOutputStream("binaryFile.dat"));
            fileWriter.writeObject(taskList);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        
        
    }
}
