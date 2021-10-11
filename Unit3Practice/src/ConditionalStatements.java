/**
 * ConditionalStatements.java
 * 
 * Complete 2 static methods.  
 * One to determine leap years.
 * One to play Rock Paper Scissors
 * 
 * Suhas Julapalli
 * 11/25/19
 * Period 5
 * @deprecated19
 *
 */
import java.util.Scanner;

public class ConditionalStatements 
{

	public static void main(String[] args) 
	{
		//Test isLeapYear
		/*
		 * Acquire the yearToTest using a Scanner Object and 
		 * 		appropriate prompts and garbage collection
		 */	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year To Test: ");
		int yearToTest = Integer.parseInt(sc.next()); //there is no year 0. This quiets the compiler.
		sc.nextLine();
		System.out.println(isLeapYear(yearToTest)); 
		
		
		//Test RockPaperScissors
		/*
		 * Acquire the personPlay using a Scanner Object and
		 * 		appropriate prompts and garbage collection
		 * 
		 * Valid personPlay {"R", "P", "S"} only
		 */
		System.out.print("Let's play rock paper scissors! Enter your move: ");
		String personPlay = new String("I win"); //assigned to quiet the compiler. 
		personPlay = sc.next();
		sc.close();
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
		if (year - 1581 > 0) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.printf("The year %s is a leap year", year);
			}
			else {
				System.out.printf("The year %s is not a leap year", year);
			}
		}
		else {
		System.out.printf("The year %s is not part of the Gregorian Calendar", year); 	
		}
		
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
		int computerInt = (int)(Math.random() * 3);  //Assign as a random number for the computer play
		String computerPlay = "";  //Assign as "R", "P", or "S" based on the computerInt
		String reason = "";  //Assign based off the comparison of userPlay to computerPlay
						//Be sure to consider ties and invalid userPlay
		userPlay = new String(userPlay.toUpperCase());
		
		if (computerInt == 0) {
			computerPlay = "R";
		}
		else if (computerInt == 1) {
			computerPlay = "P";
		}
		else {
			computerPlay = "S";
		}

		if (computerPlay.equals("R") && userPlay.equals("P")) {
			reason = new String("Paper covers rock. You win!");
		}
		else if (computerPlay.equals("P") && userPlay.equals("R")) {
			reason = new String("Paper covers rock. The computer wins!");
		}
		else if (computerPlay.equals("S") && userPlay.equals("R")) {
			reason = new String("Rock crushes scissors. You win!");
		}
		else if (computerPlay.equals("R") && userPlay.equals("S")) {
			reason = new String("Rock crushes scissors. The computer wins!");
		}
		else if (computerPlay.equals("P") && userPlay.equals("S")) {
			reason = new String("Scissors cuts paper. You win!");
		}
		else if (computerPlay.equals("S") && userPlay.equals("P")) {
			reason = new String("Scissors cuts paper. The computer wins!");
		}
		else if (computerPlay.equals(userPlay)) {
			reason = new String("You both played the same move. It's a tie!");
		}
		else {
			return String.format("Invalid Input.");
		}

		return String.format("You played %s.\nComputer played %s.\n%s", userPlay, computerPlay, reason);	
		
	}

}