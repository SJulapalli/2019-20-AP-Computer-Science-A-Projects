/**
 * Card.java 
 *
 * Card represents a playing card.
 * @Name
 * @Date
 * @Period
 */
public class Card 
{

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new Card instance.
	 *
	 * @param cardRank  a String value
	 *                  containing the rank of the card
	 * @param cardSuit  a String value
	 *                  containing the suit of the card
	 * @param cardPointValue an int value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
	}


	/**
	 * Accesses this Card's suit.
	 * @return this Card's suit.
	 */
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
   }

	/**
	 * Accesses this Card's rank.
	 * @return this Card's rank.
	 */
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
	}

   /**
	 * Accesses this Card's point value.
	 * @return this Card's point value.
	 */
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
	}
	
	/**
	 * Mutate this Card's point value.
	 * @param newPointValue the new point value to assign
	 * 				to this card.
	 */
	public void setPointValue(int newPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
	}

	/** Compare this card with the argument.
	 * @param other the other object to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	@Override
	public boolean equals(Object other) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a Deck in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a String containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
	}

}
