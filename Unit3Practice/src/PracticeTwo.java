
public class PracticeTwo {

	public static void main(String[] args) {	
		String str = "111/222";
		System.out.println(str.indexOf("/"));
		
	}

	public static double stringDivision(String str) {
		
		int num1 = Integer.parseInt(str.substring(0, str.indexOf("/")));
		int num2 = Integer.parseInt(str.substring(str.indexOf("/" + 1)));
		double answer = ((double)num1) / num2;
		return answer;
		
	}
	
}