package defaultpackage;

public class Reservation 
{
	private String guest;
	private int room;
	
	public Reservation(String guestName, int roomNumber)
	{
		guest = guestName;
		room = roomNumber;
	}
	
	public int getRoomNumber()
	{
		return room;
	}
	
	public String toString()
	{
		return String.format("Guest: %s\nRoom: %d", guest, room);
	}

}
