import java.util.*;		// Import Scanner Class
/**
 * WordDissector.java - #gk12579
 *
 * WordDissector application
 * Determine the number of letters, consonants, vowels, and Scrabble value for a word.
 * Do not alter or delete any existing comments, code or variables unless prompted to do so.
 * Your code MUST exist in the designated locations in this starter code.
 * 
 * Suhas Julapalli
 * 12/13/2019
 * Period 5
 *
 */
public class WordDissector
{
	/**
	 * Part a
	 * Helper method to determine if str is a VALID word
	 * A valid word includes only letters and no other symbols
	 * No print, printf, println statements allowed in this method
	 * 
	 * @return true if str includes only letters, false otherwise.
	 */   
	public static boolean isValid(String str)
	{

		String upperStr = new String(str.toUpperCase());
		boolean isValid = true;
		
		for (int i = 0; i != str.length(); i++ ) {
			
			if (upperStr.charAt(i) < 64) {
				isValid = false;
				break;
			}
			else if (upperStr.charAt(i) > 91) {
					isValid = false;	
					break;
			}
			else {
					isValid = true;
				}
			}
		
		return isValid;  //quiets the compiler
	
	}
	
	/**
	 * Part b
	 * Method to dissect the word completely
	 * PRECONDITION: str is a valid word
	 * Determines the wordLength, consonantCount, vowelCount, and scrabbleScore.
	 * Uses the given printf statements to output the values.
	 * 
	 */
	public static void dissect(String str)
	{
		int wordLength = 0, consonantCount = 0, vowelCount = 0, scrabbleScore = 0;
 
		/*Your code for part b goes below here*/
		
		 String upperStr = new String(str.toUpperCase());
		
		for (int i = 0; i < str.length(); i++) {
			if (upperStr.charAt(i) == 65 || upperStr.charAt(i) == 69 || upperStr.charAt(i) == 73 || upperStr.charAt(i) == 79 || upperStr.charAt(i) == 85) {
				vowelCount++;
			}
			else consonantCount++;
			
			if (upperStr.charAt(i) == 65 || upperStr.charAt(i) == 69 || upperStr.charAt(i) == 73 || upperStr.charAt(i) == 76 || upperStr.charAt(i) == 78 || upperStr.charAt(i) == 79 || upperStr.charAt(i) == 82 || upperStr.charAt(i) == 83 || upperStr.charAt(i) == 84 || upperStr.charAt(i) == 85) {
				scrabbleScore += 1;
			}
			else if (upperStr.charAt(i) == 68 || upperStr.charAt(i) == 71) {
				scrabbleScore += 2;
			}
			else if (upperStr.charAt(i) == 66 || upperStr.charAt(i) == 67 || upperStr.charAt(i) == 77 || upperStr.charAt(i) == 80) {
				scrabbleScore += 3;
			}
			else if (upperStr.charAt(i) == 70 || upperStr.charAt(i) == 72 || upperStr.charAt(i) == 86 || upperStr.charAt(i) == 87 || upperStr.charAt(i) == 89) {
				scrabbleScore += 4;
			}
			else if (upperStr.charAt(i) == 75) {
				scrabbleScore += 5;
			}
			else if (upperStr.charAt(i) == 74 || upperStr.charAt(i) == 88) {
				scrabbleScore += 8;
			}
			else scrabbleScore += 10;
		
			wordLength = str.length();
		
		}	
		//Uncomment the following printf statements
		System.out.printf("%s has %d letters, %d consonants, and %d vowels.\n", str, wordLength, consonantCount, vowelCount);
		System.out.printf("%s will be worth %d points in the game of SCRABBLE.\n\n", str, scrabbleScore);
	}
	
	/**
	 * Part c
	 * Complete the main method to ask if the user would like to enter another word.
	 * -Prompt to user should look identical to the project write up.
	 * -Will continue to request an appropriate response from the user until yes or no is given.
	 * -Responses will be accepted without case sensitivity.
	 * -No break statements, or System.exit statements are allowed.
	 * -Program must be able to terminate itself with user input of "no".
	 */
	public static void main(String[] args)
	{
		String word = new String();
		String userInput = new String();
		Scanner scan = new Scanner(System.in);

		boolean isRunning = true; 	// A boolean flag
									// Used to determine if the program will continue to run
									// Should start true for initial run
		
		while(isRunning)
		{
			System.out.println("\tWord Dissector\n");

			System.out.print("Enter word to be dissected: ");
			word = scan.next();
			scan.nextLine();  

			if( isValid(word) )
				dissect( word );
			else
				System.out.println(word + " is an invalid word.");
		
			/*Your code for part c goes below here*/
			
			while (!userInput.equals("YES") && !userInput.equals("NO")) {
				
				System.out.print("Would you like to dissect another word? (Yes/No) ");
				userInput = scan.next().toUpperCase();
				scan.nextLine();
				
				if (userInput.equals("YES"))
					isRunning = true;
				else  if (userInput.equals("NO")) 
					isRunning = false;				
			}
			userInput = "";
		}
		scan.close();
	}
	
}

