import java.util.Scanner;
public class Parsing {

	public Parsing() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string of values: ");
		String numbers = s.nextLine();
	
		Scanner s2 = new Scanner(numbers);
		int sum = 0;
		double count = 0.0;
		
		while (s2.hasNext()) {
			sum += Integer.parseInt(s2.next());
			count++;
		}
		
		System.out.println(sum/count);
	}
	
}
