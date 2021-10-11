
public class NumberGroupRunner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NumberGroup range1 = new Range(-3,2);
		System.out.println("Range1 should include -3: " + range1.contains(-3));
		System.out.println("Range1 should include 2: " + range1.contains(2));
		System.out.println("Range1 should include 0: " + range1.contains(0));
		System.out.println("Range1 should not include -4: " + range1.contains(-4));
		System.out.println("Range1 should not include 3: " + range1.contains(3));
		System.out.println("Range1 should not include 15: " + range1.contains(15));

		NumberGroup[] groups = {new Range(5,8), new Range(10,12), new Range(1,6)};
		MultipleGroups multiple1 = new MultipleGroups(groups);
		System.out.println("Multiple1 should include 2: " + multiple1.contains(2));
		System.out.println("Multiple1 should include 6: " + multiple1.contains(6));
		System.out.println("Multiple1 should not include 9: " + multiple1.contains(9));
		System.out.println("Multiple1 should include 1: " + multiple1.contains(1));
		System.out.println("Multiple1 should include 5: " + multiple1.contains(5));
		System.out.println("Multiple1 should include 10: " + multiple1.contains(10));
		System.out.println("Multiple1 should not include 13: " + multiple1.contains(13));
		System.out.println("Multiple1 should not include 0: " + multiple1.contains(0));

	}

}
