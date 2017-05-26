package edu.orangecoastcoallege.cs170.jgordon41.FinalExam;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CycleDemo
{

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ArrayList<Cycle> cycleList = new ArrayList<>();
        Scanner consoleScanner = new Scanner(System.in);
        ObjectInputStream filerReader;
        try
        {
            filerReader  = new ObjectInputStream(new FileInputStream(new File("CycleInventory.dat")));
            for(Cycle c : cycleList){
                cycleList = (ArrayList<Cycle>) filerReader.readObject();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        if (!cycleList.isEmpty()){
            for(Cycle c: cycleList){
                System.out.println(c);
            }
        }else
            System.out.println("[No data.  Please enter cycles into inventory.] ");
        int input = 0;
        do{
            System.out.print("Please enter 1 for Bicycle, 2 for Motorcycle, 3 to Quit: ");
            input = consoleScanner.nextInt();
            switch(input){
                case 1: 
                    try{
                        Bicycle bike = new Bicycle(null, 15, 0);
                        consoleScanner.reset();
                        System.out.print("Please enter Make of Bicycle: "); 
                        bike.setMake(consoleScanner.nextLine());
                        consoleScanner.nextLine();
                        int frame = 0;
                        //do{
                            System.out.print("Please Enter the Frame Size: ");
                            consoleScanner.reset(); 
                            //try{
                                frame = consoleScanner.nextInt();
                            bike.setFramesize(frame);
                            /*}catch(InvalidFrameSize e){
                                System.out.println(e.getMessage());
                            }*/
                        //}while(frame == 15 || frame <= 17 || frame <= 19);
                        System.out.print("Please Enter the Number of Gears You have: ");
                        bike.setCranks(consoleScanner.nextInt());
                        cycleList.add(bike);
                        break;
                    }catch(InvalidFrameSize e){
                        e.printStackTrace();
                        
                    }
                    
                case 2: Motorcycle motorBike = new Motorcycle(null, 0, 0.0);
                    System.out.print("Please enter the Make of MotorCycle: ");
                    motorBike.setMake(consoleScanner.nextLine());
                    System.out.print("Please enter the Fuel Capacity: ");
                    consoleScanner.reset();
                    motorBike.setFuelCapacity(consoleScanner.nextInt());
                    System.out.print("Please enter the Displacement of Engine: ");
                    motorBike.setDisplacement(consoleScanner.nextInt());
                    cycleList.add(motorBike);
                    break;
                    
            }
            for(Cycle c: cycleList){
                System.out.println(c);
                System.out.println("Motorcycle with the biggest Displacement: " /*+ findMaxDisplacement(cycleList)*/);
            }
            System.out.println();
            try
            {
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File("CycleInventory.dat")));
                for(Cycle c : cycleList){
                    output.writeObject(c);
                }
                output.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }while(input != 3);
        System.out.println("Drive safe and have an enjoyable break!");
    }
    
    
    
    /*public static Motorcycle findMaxDisplacement(ArrayList<Cycle> list){
        ArrayList<Motorcycle> motorlist = new ArrayList<>();
        for(Cycle e: list){
            if(e.)
        }
        
        int first = list.get(0).getDisplacement();;
        int toreturn, index = 0;
        for(int i = 0; i < list.size(); i++){
            toreturn = list.get(i).getDisplacement();
            if(first < toreturn){
                first = toreturn;
                index = i;
            }
        }
        return list.get(index);
    }*/
    
}
