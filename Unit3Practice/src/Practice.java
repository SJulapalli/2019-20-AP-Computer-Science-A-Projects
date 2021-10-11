import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Object;

public class Practice {

	public Practice() {
		// Assign with a string literal (primitive assignment)
		String one = "hello";
		
		// Use a constructor with a String literal
		String two = new String("World");
		
		//Use a constructor with a string object
		String three = new String(two);
		
		//Creates and alias
		String four = one;
		
		//checks to see if two objects are aliases
		//System.out.println(one == 
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(0);
		numbers.add(0);
		numbers.add(0);
		numbers.add(13);
		numbers.add(0);
		numbers.add(0);
		numbers.add(4);
		
		deleteZeroes(numbers);
		
		for (int i: numbers) System.out.print(i);
		
	}

	public static int[][] copyArray(int[][] twoDArray) {
		return null;
		
		
		/*
		for (int row = 1; row <= numRows; row++) {
			for (int numSpaces = 0; numSpaces < (numRows - row); numSpaces++) {
				for (int numStars = 1; numStars <= 2 * row - 1; numStars++) {
				}
			}
		}
		*/
	}
	
	public static void deleteZeroes(ArrayList<Integer> nums) {
		int i = 0;
		while (i < nums.size()) {
			if (nums.get(i) == 0) {
				nums.remove(i);
			}
			else i++;
		}
	}
	
	public static void deleteZeroesAlternate(ArrayList<Integer> nums) {
		//go backwards or go forwards and go back one each time you hit a zero, thereby skipping none.
	}
	
	public static int removeAndAddEvens(ArrayList<Integer> nums) {
		
		int sum = 0;
		for (int i = 0; i < nums.size(); i--) {
			if (nums.get(i) % 2== 0) {
				sum += nums.get(i);
				nums.remove(i);
			}
		}	
		return 0;
	}

	public static void setEvensAsNegatives(ArrayList<Integer> nums) {
		int temp = 0;
		
		for (int i = 0; i < nums.size(); i++) {
			temp = nums.get(i);
			if (temp % 2 == 0) 
				temp = temp * -1;
			nums.set(i, temp);
		}
	}
}
