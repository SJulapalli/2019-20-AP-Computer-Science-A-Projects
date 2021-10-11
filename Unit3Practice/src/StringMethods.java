/**
 * Complete each of the practice methods for String manipulation.
 * There is an include main method designed to test your code
 * 
 * Suhas Julapalli
 * 11/12/19
 * Period 5
 * 
 */
public class StringMethods 
{
	/**
	 * wordInMiddle("computer", "science") -> "compscienceuter"
	 * wordInMiddle("science", "computer") -> "scicomputerence"
	 */
	public static String wordInMiddle(String str, String word)
	{
		
		String middle = str.substring(0, str.length() / 2) + word + str.substring(str.length() / 2);
		
		return middle;
	}
	
	/**
	 * flippedString("computer") -> "utercomp"
	 * flippedString("science") -> "encesci"
	 * flippedString("AP") -> "PA"
	 * flippedString("A") -> "A"
	 */
	public static String flippedString(String str)
	{
		
		String flip = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
		
		return flip;
	}
	
	/**
	 * flipFlopFirstLast("science") -> "eciencs"
	 * flipFlopFirstLast("computer") -> "romputec"
	 * flipFlopFirstLast("AP") -> "PA"
	 * 
	 *  PRECONDITION: str.length() > 1
	 */
	public static String flipFlopFirstLast(String str)
	{
		String flipFlop = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
		
		return flipFlop;
	}
	
	/**
	 * first2Last2("computer") -> "coer"
	 * first2Last2("science") -> "scce"
	 * first2Last2("AP") -> "APAP"
	 * 
	 * PRECONDITION: str.length() > 1
	 */
	public static String first2Last2(String str)
	{
		String first2Last2 = str.substring(0, 2) + str.substring(str.length() - 2);
		
		return first2Last2;
	}
	
	/**
	 * first2Mid2Last2("computer") -> "copuer"
	 * first2Mid2Last2("science") -> "sciece"
	 * first2Mid2Last2("AP") -> "APAPAP"
	 * 
	 * PRECONDITION: str.length() > 1
	 */
	public static String first2Mid2Last2(String str)
	{
		String first2Mid2Last2 = str.substring(0, 2) + str.substring(str.length() / 2 - 1, str.length() / 2 + 1) + str.substring(str.length() - 2);
		
		return first2Mid2Last2;
	}

	/**
	 * Main method to test all the methods.
	 * 
	 */
	public static void main(String[] args) 
	{
		System.out.println("Testing wordInMiddleString...");
		System.out.println("wordInMiddle(\"computer\", \"science\") -> \"compscienceuter\" " + 
				wordInMiddle("computer", "science").equals("compscienceuter"));
		System.out.println("wordInMiddle(\"science\", \"computer\") -> \"scicomputerence\" " +
				wordInMiddle("science", "computer").equals("scicomputerence"));
		System.out.println();
		System.out.println("Testing flippedString...");
		System.out.println("flippedString(\"computer\") -> \"utercomp\" " +
				flippedString("computer").equals("utercomp"));
		System.out.println("flippedString(\"science\") -> \"encesci\" " + 
				flippedString("science").equals("encesci"));
		System.out.println("flippedString(\"AP\") -> \"PA\" " + 
				flippedString("AP").equals("PA"));
		System.out.println("flippedString(\"A\") -> \"A\" " + 
				flippedString("A").equals("A"));
		System.out.println();
		System.out.println("Testing flipFlopFirstLast...");
		System.out.println("flipFlopFirstLast(\"science\") -> \"eciencs\" " +
				flipFlopFirstLast("science").equals("eciencs"));
		System.out.println("flipFlopFirstLast(\"computer\") -> \"romputec\" " +
				flipFlopFirstLast("computer").equals("romputec"));
		System.out.println("flipFlopFirstLast(\"AP\") -> \"PA\" " + 
				flipFlopFirstLast("AP").equals("PA"));
		System.out.println();
		System.out.println("Testing first2Last2...");
		System.out.println("first2Last2(\"computer\") -> \"coer\" " +
				first2Last2("computer").equals("coer"));
		System.out.println("first2Last2(\"science\") -> \"scce\" " +
				first2Last2("science").equals("scce"));
		System.out.println("first2Last2(\"AP\") -> \"APAP\" " + 
				first2Last2("AP").equals("APAP"));
		System.out.println();
		System.out.println("Testing first2Mid2Last2...");
		System.out.println("first2Mid2Last2(\"computer\") -> \"copuer\" " +
				first2Mid2Last2("computer").equals("copuer"));
		System.out.println("first2Mid2Last2(\"science\") -> \"sciece\" " +
				first2Mid2Last2("science").equals("sciece"));
		System.out.println("first2Mid2Last2(\"AP\") -> \"APAPAP\" " +
				first2Mid2Last2("AP").equals("APAPAP"));
	}
}
