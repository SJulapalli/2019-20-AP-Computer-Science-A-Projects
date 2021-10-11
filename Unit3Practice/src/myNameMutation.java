
public class myNameMutation {

	public static void main(String[] args) {
							//123456789012345
		String myFullName =  "Suhas Julapalli";
		int indexOfSpace = myFullName.indexOf(" ");
		
		System.out.printf("Hello, my name is %s\n", myFullName);
		System.out.printf("My first name is %s\n", myFullName.substring(0, indexOfSpace));
		System.out.printf("My last name is %s\n", myFullName.substring(indexOfSpace + 1));
		System.out.printf("I'M %s!!!\n", myFullName.toUpperCase());
		System.out.printf("My name has %d letters\n", myFullName.length() - 1);
		System.out.printf("My last name is %s letters long\n", myFullName.substring(indexOfSpace + 1).length());
		System.out.printf("%s, %s\n", myFullName.substring(indexOfSpace + 1), myFullName.substring(0, indexOfSpace));
		System.out.printf("Username: %s%s%d%d\n", myFullName.charAt(0), myFullName.substring(indexOfSpace + 1), 
				myFullName.substring(0, indexOfSpace).length(), myFullName.substring(indexOfSpace + 1).length());
		System.out.printf("The first half of my name is %s\n", 
				myFullName.substring(0, myFullName.length()/2));
		System.out.printf("The third letter is %s and the third to last is %s\n", 
				myFullName.charAt(2), myFullName.charAt(myFullName.length() - 3));
		System.out.printf("Letters three last are %s%s%s\n", 
				myFullName.charAt(myFullName.length() - 1), myFullName.charAt(myFullName.length() - 2),
				myFullName.charAt(myFullName.length() - 3));
		System.out.printf("Random substring: %s", 
				myFullName.substring((int)(Math.random() * myFullName.length()), 
						(int)(Math.random() * myFullName.length())));
	
	}

}