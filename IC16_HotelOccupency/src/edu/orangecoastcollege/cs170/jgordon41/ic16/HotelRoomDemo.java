/**
 * CS170
 * Gordon, Joel
 * 4/4/2017
 * 
 * IC16_HotelOccupency
 */
package edu.orangecoastcollege.cs170.jgordon41.ic16;

/**
 * @author jgordon41
 *
 */
public class HotelRoomDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        HotelRoom room103 = new HotelRoom (103, 2);
        HotelRoom room104 = new HotelRoom (104, 1);
        HotelRoom room105 = new HotelRoom (105, 1);
        HotelRoom room106 = new HotelRoom (106, 4);
        
        System.out.println("Total amount of People: " + HotelRoom.getTotalOccupancy());
        
        System.out.print("Adding 1 person to a room 103" + "\n Total in hotel");
        
        room103.addToRoom(1);
        
        System.out.println(HotelRoom.getTotalOccupancy() + "\n Total in Room 103" + room103.getPeopleInRoom());
        
        System.out.println("Removing 2 some people from room 104");
        room104.removeFromRoom(2);
        System.out.println("Room 104 has : " + room104.getPeopleInRoom() + "\nTotal in Building " + HotelRoom.getTotalOccupancy());
        System.out.println("Room 105 has " + room105.getPeopleInRoom() + "\nRoom 106 has " + room106.getPeopleInRoom());
        
        
    }

}
