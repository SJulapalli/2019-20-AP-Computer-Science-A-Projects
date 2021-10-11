import java.util.Scanner;
public class DoMath {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter an addition problem: Use the word \"plus\": ");
		String addition = sc.nextLine();
		int firstNumber = Integer.parseInt(addition.substring(0, addition.indexOf("plus")).trim());
		int secondNumber = Integer.parseInt(addition.substring(addition.length() - addition.indexOf("plus")).trim());
		int answer = firstNumber + secondNumber;

		System.out.println(answer);
		
	}

}
