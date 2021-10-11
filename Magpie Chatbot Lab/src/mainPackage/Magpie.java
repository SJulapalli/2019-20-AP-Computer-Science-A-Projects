/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 *      Uses indexOf to find strings
 *      Handles responding to simple words and phrases 
 * 
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		
		playRPS(statement);
		reverseResponse(statement);
		
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.trim().equals("")) {
			response = "Say something please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "How come?";
		}
		else if (whichResponse == 5)
		{
			response = "I never knew that.";
		}

		return response;
	}
	
	private String playRPS(String userInput) {
	
		String computerPlay = "";
		String userPlay = userInput.toLowerCase();
		
		if (hasKeyword(userPlay, "rock"))
			userPlay = "r";
		else if (hasKeyword(userPlay, "paper"))
			userPlay = "p";
		else userPlay = "s";
		
		switch ((int)Math.random() * 3) {
		case 0: computerPlay = "r";
		case 1: computerPlay = "p";
		default: computerPlay = "s";
		}
		
		switch (userPlay.toLowerCase().compareTo(computerPlay)) {
		case 1: return "I played scissors. Rock crushes scissor, you win!";
		case -1: return "I played rock. Rock crushes scissors, I win!";
		case 2: return "I played rock. Paper covers rock, you win!";
		case -2: return "I played paper. Paper covers rock, I win!";
		case 3: return "I played scissors. Scissors cuts paper, I win!";
		case -3: return "I played paper. Scissors cuts paper, you win!";
		}
	}
	
	private boolean hasKeyword(String statement, String keyWord) {
		return (" " + statement + " ").indexOf(" " + keyWord + " ") >= 1;
	}
	
	private void reverseResponse(String userInput) {
		int rando = (int)Math.random() * 6;
		String response = "";
		
		if (hasKeyword(userInput.toLowerCase(), "backwards") || hasKeyword(userInput.toLowerCase(), "reverse"))
			switch (rando) {
			case 0: response = "erom em llet, gnitseretnI.";
			case 1: response = "mmmH.";
			case 2: response = "os kniht yllaer uoy oD?";
			case 3: response = "yas t'nod uoY.";
			case 4: response = "emoc woH?";
			case 5: response = "taht wenk reven I.";
		}
	}
	
}
