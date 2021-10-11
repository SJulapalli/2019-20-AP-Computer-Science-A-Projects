/**
 * ArraysHelper.java
 *
 * Array helper methods
 * Complete each of the static methods to perform the indicated task.
 * Write code in the main method to test each method
 * 
 * @Name 
 * @Date
 * @Period 
 *
 */
public class ArraysHelper 
{

	/**
	 * #1 arrayToInt will convert an array of ints to an int
	 * PRECONDITION: all elements of arr will be positive.
	 * POSTCONDITION: the elements of arr will be in the same order.
	 * @param arr an array of ints
	 * @return an integer representation of the ints in the array
	 * {1,2,3,4} -> 1234
	 * {0,3,0,5} -> 305
	 * {1,0} -> 10
	 */
	public static int arrayToInt(int[] arr)
	{
		return 0; //quiets the compiler
	}
	
	/**
	 * #2 intToArray will dissect an int into an array of ints
	 * PRECONDITION: num >= 0
	 * POSTCONDITION: each element of the array returned will be a single digit
	 * @param num a number that is greater than or equal to zero
	 * @return an array representation of num
	 * 1234 -> {1,2,3,4}
	 * 305 -> {3,0,5}
	 * 10 -> {1,0}
	 * 0 -> {0}
	 */
	public static int[] intToArray(int num)
	{
		return new int[0]; //quiets the compiler 
	}
	
	/**
	 * #3 indexOfZero returns the index of the first occurrence of Zero, or
	 * 			-1 if no zero exists
	 * @param arr an array of ints
	 * @return the index of the first zero, -1 if no zero exists
	 * {1,2,3,4} -> -1
	 * {0,3,0,5} -> 0
	 * {1,0} -> 1
	 */
	public static int indexOfZero(int[] arr)
	{
		return 0; //quiets the compiler
	}
	
	/**
	 * #4 lastIndexOfZero returns the index of the last occurrence of Zero, or 
	 * 			-1 if no zero exists
	 * @param arr an array of ints
	 * @return the index of the last zero, -1 if no zero exists
	 * {1,2,3,4} -> -1
	 * {0,3,0,5} -> 2
	 * {1,0} -> 1
	 */
	public static int lastIndexOfZero(int[] arr)
	{
		return 0; //quiets the compiler
	}
	
	/**
	 * #5 setZeros uses indexOZero and lastIndexOfZero to modify an array.  All values
	 * 		between the first and last zero will be replaced by a zero.  If only 1 or no zeros exist,
	 * 		array arr will remain unchanged
	 * @param arr an array of ints
	 * {1,2,3,4} -> {1,2,3,4}
	 * {0,3,0,5} -> {0,0,0,5}
	 * {1,0} -> {1,0}
	 */
	public static void setZeros(int[] arr)
	{
		/* your code goes here */
	}
	
	/**
	 * #6 reverseArray reverse the order of the elements in the array arr
	 * @param arr an array of ints to be reversed
	 * {1,2,3,4} -> {4,3,2,1}
	 * {0,3,0,5} -> {5,0,3,0}
	 * {1,0} -> {0,1}
	 */
	public static void reverseArray(int[] arr)
	{
		/* your code goes here */
	}
	
	/**
	 * #7 combineArrays merges two arrays (arr1 and arr2) into a single array.
	 * 		Elements will be merged in an alternating pattern. If arr1 and arr2
	 *  	are not the same length, all additional elements will be appended to 
	 *  	the end of the array being returned
	 * @param arr1 an array of ints
	 * @param arr2 an array of ints
	 * @return an array of ints which is a merged listing of arr1 and arr2
	 * {1,2,3,4} & {5,6,7,8} -> {1,5,2,6,3,7,4,8}
	 * {1,1,1,1} & {2,2} -> {1,2,1,2,1,1}
	 * {1,1} & {2,2,2,2} -> {1,2,1,2,2,2}
	 */
	public static int[] combineArrays(int[] arr1, int[] arr2)
	{
		return new int[0]; //quiets the compiler
	}
	
	/**
	 * Main method to test code.  Create any code you wish in the main method
	 * 		to test your methods and make sure they work.
	 * 
	 */
	public static void main(String[] args) 
	{
		/*
		 * Add code here to test each of your methods.
		 */
		
	}

}
