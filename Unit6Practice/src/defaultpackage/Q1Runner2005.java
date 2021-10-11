package defaultpackage;
import java.util.*;
public class Q1Runner2005
{
	public static void main(String[] args)
	{
		String[] names = {"Abby", "Bart", "Connie", "Devin", "Ester", "Frank", "George", "Harper", "Irene", "Joey", "Kayla", "Leigh", "Mitchell", "Nicole", "Odin"};
		Hotel super8 = new Hotel(8);
		Hotel laViente = new Hotel(20);
		List<Reservation> allRes = new ArrayList<Reservation>();

		for(String s: names)
		{	
			allRes.add(0,super8.requestRoom(s));
			allRes.add(laViente.requestRoom(s));
		}
		
		System.out.println("Testing requestRoom");
		System.out.println("Super8 should have all 8 rooms reserved,");
		System.out.println("and a waitList of [Irene,Joey,Kayla,Leigh,Mitchell,Nicole,Odin]");
		System.out.printf("Super8: %s\n",super8);
		System.out.println();
		System.out.println("laViente should have 15 of 20 rooms reserved,");
		System.out.println("and an empty waitList");
		System.out.printf("laViente: %s\n",laViente.toString());
		System.out.println();
		System.out.println("Testing cancelAndReassign");
		System.out.printf("Super8 reservation to cancel: %s\n", allRes.get(9));
		allRes.set(9, super8.cancelAndReassign(allRes.get(9)));
		System.out.printf("New Super8 reservation for Irene: %s\n", allRes.get(9));
		System.out.printf("laViente reservation to cancel: %s\n", allRes.get(20));
		allRes.set(20, laViente.cancelAndReassign(allRes.get(20)));
		System.out.printf("New laViente reservation should be null: %s\n", allRes.get(20));
		
	
	}
}
