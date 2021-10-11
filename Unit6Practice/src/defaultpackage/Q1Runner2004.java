package defaultpackage;
import java.util.*;
public class Q1Runner2004 {
	public static void main(String[] args) 
	{
		String[] words1 = {"cat", "mouse", "frog", "dog", "dog"};
		String[] words2 = {"honda", "chevy", "ford", "dodge", "subaru", "bmw", "lexus"};
		WordList animals = new WordList(words1);
		WordList cars = new WordList(words2);
		
		System.out.println("Testing numWordsOfLength method");
		System.out.printf("Animals of length 4 should be 1 and is %d\n", animals.numWordsOfLength(4));
		System.out.printf("Animals of length 3 should be 3 and is %d\n", animals.numWordsOfLength(3));
		System.out.printf("Animals of length 2 should be 0 and is %d\n", animals.numWordsOfLength(2));
		System.out.printf("Cars of length 5 should be 4 and is %d\n", cars.numWordsOfLength(5));		
		System.out.printf("Cars of length 4 should be 1 and is %d\n", cars.numWordsOfLength(4));
		System.out.printf("Cars of length 3 should be 1 and is %d\n", cars.numWordsOfLength(3));
		System.out.printf("Cars of length 2 should be 0 and is %d\n", cars.numWordsOfLength(2));
		System.out.println();
		System.out.println("Testing removeWordsOfLength");
		System.out.printf("Animals should be [cat,mouse,frog,dog,dog] is %s\n", animals);
		animals.removeWordsOfLength(4);
		System.out.printf("Animals after removeWordsOfLength(4) should be [cat,mouse,dog,dog] is %s\n", animals);
		animals.removeWordsOfLength(3);
		System.out.printf("Animals after removeWordsOfLength(3) should be [mouse] is %s\n", animals);
		animals.removeWordsOfLength(2);
		System.out.printf("Animals after removeWordsOfLength(2) should be [mouse] is %s\n", animals);
		System.out.printf("Cars should be [honda,chevy,ford,dodge,subaru,bmw,lexus] is %s\n", cars);
		cars.removeWordsOfLength(5);
		System.out.printf("Cars after removeWordsOfLength(5) should be [ford,subaru,bmw] is %s\n", cars);
		cars.removeWordsOfLength(4);
		System.out.printf("Cars after removeWordsOfLength(4) should be [subaru,bmw] is %s\n", cars);
		cars.removeWordsOfLength(3);
		System.out.printf("Cars after removeWordsOfLength(3) should be [subaru] is %s\n", cars);
		cars.removeWordsOfLength(2);
		System.out.printf("Cars after removeWordsOfLength(2) should be [subaru] is %s\n", cars);
	}

}
