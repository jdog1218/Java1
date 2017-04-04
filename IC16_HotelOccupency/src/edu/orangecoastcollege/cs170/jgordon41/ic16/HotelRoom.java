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
public class HotelRoom
{

    private int mRoomNumber, mPeopleInRoom;
    private static int sTotalOccupancy;

    public HotelRoom(int roomNumber, int peopleInRoom)
    {
        if(peopleInRoom < 0 || peopleInRoom > 4){
            throw new IllegalArgumentException("Please enter a number people below 4 but greater than 0");
        }
        this.mRoomNumber = roomNumber;
        this.mPeopleInRoom = peopleInRoom;
        HotelRoom.sTotalOccupancy += peopleInRoom;
    }

    public int getPeopleInRoom()
    {
        return mPeopleInRoom;
    }

    public static int getTotalOccupancy()
    {
        return sTotalOccupancy;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mPeopleInRoom;
        result = prime * result + mRoomNumber;
        result = prime * result + sTotalOccupancy;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        HotelRoom other = (HotelRoom) obj;
        if (mPeopleInRoom != other.mPeopleInRoom) return false;
        if (mRoomNumber != other.mRoomNumber) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "HotelRoom [Room Number=" + mRoomNumber + ", People In Room=" + mPeopleInRoom + ", TotalOccupancy="
                + sTotalOccupancy + "]";
    }

    public void addToRoom(int numberOfPeople){
        if(numberOfPeople + mPeopleInRoom <= 4)
            throw new IllegalArgumentException("Please enter a number people below 4 but greater than 0");
        sTotalOccupancy += numberOfPeople;
        mPeopleInRoom += numberOfPeople;
    }

    public void removeFromRoom(int numberOfPeople){
        if(numberOfPeople + mPeopleInRoom >= 4){
            throw new IllegalArgumentException("Please enter a number people below 4 but greater than 0");
        }
        mPeopleInRoom -= numberOfPeople;
        sTotalOccupancy = numberOfPeople;
    }

    
}
