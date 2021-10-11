package defaultpackage;

import java.util.*;
public class Hotel 
{
	/**
	 * each element corresponds to a room in the hotel;
	 * if room[index] is null, the room is empty;
	 * otherwise, it contains a reference to the Reservation
	 * for that room, such that
	 * rooms[index].getRoomNumber() returns index
	 */
	private Reservation[] rooms;
	
	/**
	 * contains names of guests who have not yet been 
	 * assigned a room because all rooms are full
	 */
	private ArrayList<String> waitList;
	
	public Hotel(int numRooms)
	{
		rooms = new Reservation[numRooms];
		waitList = new ArrayList<String>();
	}
	
	/**
	 * if there are any empty rooms (room with no reservation),
	 * then create a reservation for an empty room for the 
	 * specified guest and return the Reservation;
	 * otherwise, add the gues to the end of waitList
	 * and return null
	 */
	public Reservation requestRoom(String guestName)
	{
		return null;
		/*	to be implemented in part (a)	*/
		
	}

	/**
	 * release the room associated with parameter res, effectively
	 * canceling the reservation;
	 * if any names are stored in waitList, remove the first name 
	 * and create a Reservation for this person in the room
	 * reserved by res; return that new Reservation;
	 * if waitList is empty, mark the room specified by res as empty and 
	 * return null
	 * precondition: res is a valid Reservation for some room in this hotel
	 */
	public Reservation cancelAndReassign(Reservation res)
	{
		return res;
		/*	to be implemented in part (b)	*/
	}
	
	public String toString()
	{
		String s = "RESERVATIONS: \n";
		for(Reservation r: rooms)
			if(r != null)
				s += r.toString() + "\n";
		if(waitList.size() > 0)
			s += "\nWAITLIST:\n" + waitList.toString();
		else
			s += "\nWAITLIST: EMPTY";
		return s;
	
	}

}
