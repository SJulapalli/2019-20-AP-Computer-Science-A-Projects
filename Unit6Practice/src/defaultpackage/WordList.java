package defaultpackage;

import java.util.*;
public class WordList 
{
	private ArrayList<String> myList;
	
	public WordList(String[] words)
	{
		myList = new ArrayList<String>();
		for(String s: words)
			myList.add(s);
	}
	
	/**
	 * postcondition: returns the number of words in this WordList that
	 * 					are exactly len letters long
	 */
	public int numWordsOfLength(int len)
	{
		return len;
		/*	to be implemented in part (a)	*/
	}
	
	/**
	 * postcondition: all words that are exactly len letters long
	 * 				have been removed from this WordList, with the 
	 * 				order of the remaining words unchanged
	 */
	public void removeWordsOfLength(int len)
	{
		/*	to be implemented in part (b)	*/
	}
	
	public String toString()
	{
		return myList.toString();
	}

}
