
public class ArrayChallenges {

	public static int[][] copy(int[][] twoDArray) {
		
		int[][] copy = new int[twoDArray.length][twoDArray[0].length];
		
		for(int row = 0; row < twoDArray.length; row++) {
			for(int col = 0; col < twoDArray[0].length; col++) {
				copy[row][col] = twoDArray[row][col];
			}
		}
		
		return copy;
		
	}
	
	public static void print2d(int[][] twoDArray) {

		for (int r = 0; r < twoDArray.length; r++) {
			for (int c = 0; c < twoDArray[0].length; c++) {
				System.out.print(twoDArray[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] triple(int[][] arr) {
		
		int[][] triple = new int[arr.length][arr[0].length];
		
		for (int r = 0; r < triple.length; r++) {
			for (int c = 0; c < triple[0].length; c++) {
				triple[r][c] = arr[r][c] * 3;
				System.out.print(triple[r][c] + " ");
			}
			System.out.println();
		}
		
		return triple;
		
	}
	
	public static void main(String[] args) {
		int[][] test = { {1, 2, 3}, 
						 {4, 5, 6}, 
						 {7, 8, 9},
						 {10, 11 ,12} };
		
		copy(test);
		print2d(test);
		triple(test); 
		print2d(test);	
		
	}
	
}
