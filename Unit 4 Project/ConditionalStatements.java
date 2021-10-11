/**
 * ConditionalStatements.java
 * 
 * Complete 2 static methods.  
 * One to determine leap years.
 * One to play Rock Paper Scissors
 * 
 * @author 
 * @dueDate
 * @period
 * @deprecated19
 *
 */
public class ConditionalStatements 
{

	public static void main(String[] args) 
	{
		//Test isLeapYear
		/*
		 * Acquire the yearToTest using a Scanner Object and 
		 * 		appropriate prompts and garbage collection
		 */	
		int yearToTest = 0; //there is no year 0. This quiets the compiler.
		System.out.println(isLeapYear(yearToTest)); 
		
		
		//Test RockPaperScissors
		/*
		 * Acquire the personPlay using a Scanner Object and
		 * 		appropriate prompts and garbage collection
		 * 
		 * Valid personPlay {"R", "P", "S"} only
		 */
		String personPlay = new String("I win"); //assigned to quiet the compiler. 
		System.out.println(rockPaperScissors(personPlay));

	}
	
	/**
	 * Determine leap years and non-leap years based on the rules provided in the write up
	 * Address years that are not part of the Gregorian Calendar
	 * Use a complete sentence for your output messages
	 * 
	 * @param year
	 * @return a String based off of the year
	 */
	public static String isLeapYear(int year)
	{
		return ""; // Quiets the compiler
	}
	
	/**
	 * Play Rock, Paper, Scissors
	 * 
	 * @param userPlay
	 * @return the game play message
	 */
	public static String rockPaperScissors(String userPlay)
	{
		int computerInt;  //Assign as a random number for the computer play
		String computerPlay; //Assign as "R", "P", or "S" based on the computerInt
		String reason;  //Assign based off the comparison of userPlay to computerPlay
						//Be sure to consider ties and invalid userPlay
		
		return ""; //Quiets the compiler.  Remove this line and uncomment the next return statement.
		//return String.format("You played %s.\nComputer played %s.\n %s", userPlay, computerPlay, reason);
	}

}
