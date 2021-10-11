package defaultpackage;

import java.util.*;

/**
 * ArrayListMethods.java
 * 
 * ArrayList Practice methods.
 * Complete each of the static methods to perform the indicated task 
 *  	using only the six List methods of the AP Subset 
 *  [size(), add(E), add(int, E), set(int, E), get(int), remove(int)]
 * 
 * @Name (Your Name)
 * @Date (Due Date)
 * @Period (Class Period)
 *
 */
public class ArrayListMethods 
{
	/**
	 * #1 totalNumVowels
	 * Returns the total number of vowels included in all the String elements
	 * 		of the ArrayList strList. For this method only include A, E, I, O and U as Vowels
	 * @param strList an ArrayList of Strings
	 * @return an integer representing the sum quantity of vowels in all Strings in strList
	 * [Hello, World] -> 3
	 * [AP, Computer, Science, A] -> 8
	 * [TRY, 2, fly] -> 0
	 */
	public static int totalNumVowels(ArrayList<String> strList)
	{
		/*  your code for #1 goes here  */
		int vowelCount = 0;
		String vowels = "aAeEiIoOuU";
		for (String str: strList) {
			for (int i = 0; i < str.length(); i++) {
				if (vowels.indexOf(str.charAt(i)) >= 0)
					vowelCount++;
			}
		}
		return vowelCount;
	}

	/**
	 * #2 getRandomString
	 * Returns a random String from within the ArrayList strList, or null if strList is empty.
	 * PRECONDITION: strList.size() >= 0
	 * POSTCONDITION: strList is unchanged.
	 * @param srtList an ArrayList of Strings
	 * @return a random String from within the list strList, or null
	 */
	public static String getRandomString(ArrayList<String> strList)
	{
		/*  your code for #2 goes here  */
		if (strList.size() == 0)
			return null;
		else return strList.get((int)(Math.random() * strList.size()));
	}

	/**
	 * #3 removeWordsOfLength
	 * Removes all words of the given length len from the ArrayList strList.  The given
	 * 		length len will be a positive number.
	 * PRECONDITION: strList.size() > 0
	 * PRECONDITION: len > 0
	 * POSTCONDITION: the Strings in strList are in the same order
	 * @param len an int > 0
	 * @param strList an ArrayList of Strings
	 */
	public static void removeWordsOfLength(int len, ArrayList<String> strList)
	{
		/*  your code for # 3 goes here  */
		for (int i = strList.size() - 1; i >= 0; i--) {
			if (strList.get(i).length() >= len) {
				strList.remove(i);
			}
		}
	}

	/**
	 * #4 addWordToSortedList
	 * Updates the ArrayList strList to include the String word in Lexicographic ordering.
	 * PRECONDITION: strList is arranged in Lexicographic (Alphabetical) order
	 * PRECONDITION: all Strings in strList are lower case words, no spaces or numbers
	 * PRECONDITION: strList.size() >= 0 
	 * @param word a String to be added to the List
	 * @param strList an ArrayList of Strings
	 */
	public static void addWordToSortedList(String word, ArrayList<String> strList)
	{
		/*  your code for #4 goes here  */
		boolean sorted = false;
		int i = 1;
		
		while (sorted == false) {
			
			if (i == strList.size()) {
				strList.add(word);
				sorted = true;
			}
			else if (word.compareTo(strList.get(i)) < 0 && word.compareTo(strList.get(i - 1)) >= 0) {
				strList.add(i, word);
				sorted = true;
			}
			i++;
		}
	}

	/**
	 * #5 reverseList
	 * Reverses the order of the Strings in strList
	 * @param strList an ArrayList of Strings
	 */
	public static void reverseList(ArrayList<String> strList)
	{
		/*  your code for #5 goes here  */
		int index = strList.size();
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int i = strList.size() - 1; i >= 0; i--) {
			temp.add(strList.get(i));
		}
		
		for (int i = strList.size() - 1; i >= 0; i--) {
			strList.remove(i);
		}
		
		for (int i = 0; i < index; i++) {
			strList.add(temp.get(i));
		}
	}

	/**
	 * #6 combineLists
	 * Merges two Lists into a single List.  Elements will be merged in an alternating
	 * 		pattern.  If list1 and list2 are not the same length, all additional 
	 * 		elements will be appended to the end of the List being returned.  While writing
	 * 		this method do not modify or remove items from list1 or list2
	 * POSTCONDITION: list1 and list2 remain unchanged
	 * @param list1 a List of Objects
	 * @param list2 a List of Objects
	 * @return a List of Objects which is the merged List of list1 and list2
	 */
	public static List combineLists(List list1,List list2)
	{
		/*  your code for #6 goes here  */
		ArrayList combinedList = new ArrayList();
		int index = 0;
		
		while(index < list1.size() && index < list2.size()) {
			combinedList.add(list1.get(index));
			combinedList.add(list2.get(index));
			index++;
		}
		
		if(list1.size() < list2.size()) {
			while(index < list2.size()) {
				combinedList.add(list2.get(index));
				index++;
			}
		}
		else {
			while(index < list1.size()) {
				combinedList.add(list1.get(index));
				index++;
			}
		}
		
		return combinedList; //Quiets the compiler
	}

	/**
	 * Main method to test code.  Create any code you wish in the main method
	 * 		to test your methods and make sure they work.
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> strList = new ArrayList<String>();
		fillList(strList);
		/* use this space to test methods  */
		addWordToSortedList("albekurky", strList);
		System.out.print(strList);
	}

	/**
	 * A Helper method used to fill the ArrayList with
	 * 		some sample code
	 * @param lst a List to be filled
	 */
	private static void fillList(List<String> lst)
	{
		String[] words = {"array", "brown", "to", "yup", "zip", "zop"};
		for(String s: words)
			lst.add(s);

		/*lst.add("Welcome");
		lst.add("to");
		lst.add("AP");
		lst.add("Computer");
		lst.add("Science");
		lst.add("A");
		lst.add("Good Luck!");
		 */
	}

}
