
public class FunNumberClient {

	public static void main(String[] args) {
		FunNumber one = new FunNumber(16);
		FunNumber two = new FunNumber();
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(one.allFactors());
		System.out.println(one.equals(two));
		System.out.println(one.findFactorial());
		System.out.println(one.findNumDigits());
		System.out.println(one.getSum(two));
		System.out.println(one.getValue());
		System.out.println(one.isEven());
		System.out.println(one.isPerfect());
		System.out.println(one.isPrime());
		System.out.println(one.reverse());
		one.setValue(11);
		System.out.println(one.sumDigits());
		System.out.println(one.sumIntsFrom1toNum());
		System.out.println(one.sumIsDivisor());
		
	}
	
}
