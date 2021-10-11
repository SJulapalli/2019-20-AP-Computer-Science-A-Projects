/**
 * Suhas Julapalli
 * Date: 10/29/19
 * Period 5
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class PhonyBusinessProject {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Random numGen = new Random();
		NumberFormat recieptPrice = NumberFormat.getCurrencyInstance();
		NumberFormat recieptTax = NumberFormat.getPercentInstance();
		
		String itemOne, itemTwo, itemThree, itemOneReciept = "", itemTwoReciept = "", 
		itemThreeReciept = "", priceOneReciept = "", priceTwoReciept = "", priceThreeReciept = "", 
		taxReciept = "", subtotalReciept = "", totalReciept = "", 
		dividingLine = "---------------------------------------------------";
		double priceOne, priceTwo, priceThree;
		int customerNumber = numGen.nextInt(1000);
		final double TAX = .07;
		
		System.out.println("\t)><><>/\\<><><>^<><><>/\\<><><(\n   Welcome To \"Phonie's Phish and Phajitas\"\n\t)><><>\\/<><><>v<><><>\\/<><><(\n");
		System.out.print("Enter your first item: ");
		itemOne = sc.nextLine();
		System.out.print("Enter the price: $");
		priceOne = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter your second item: ");
		itemTwo = sc.nextLine();
		System.out.print("Enter the price: $");
		priceTwo = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter your third item: ");
		itemThree = sc.nextLine();
		System.out.print("Enter the price: $");
		priceThree = sc.nextDouble();
		sc.nextLine();
		
		double subtotal = priceOne + priceTwo + priceThree;
		double total = (TAX * subtotal) + subtotal;
		
		priceOneReciept = recieptPrice.format(priceOne);
		priceTwoReciept = recieptPrice.format(priceTwo);
		priceThreeReciept = recieptPrice.format(priceThree);
		taxReciept = recieptPrice.format(subtotal*TAX);
		subtotalReciept = recieptPrice.format(subtotal);
		totalReciept = recieptPrice.format(subtotal + (subtotal*TAX));
		
		priceOneReciept = priceOneReciept.substring(1);
		priceTwoReciept = priceTwoReciept.substring(1);
		priceThreeReciept = priceThreeReciept.substring(1);
		taxReciept = taxReciept.substring(1);
		subtotalReciept = subtotalReciept.substring(1);
		totalReciept = totalReciept.substring(1);
		
		System.out.println(dividingLine);
		System.out.println("\t)><><>/\\<><><>^<><><>/\\<><><(\n\t\"Phonie's Phish and Phajitas\"\n\t)><><>\\/<><><>v<><><>\\/<><><(");
		System.out.println("\t\tCustomer: " + customerNumber);
		System.out.println("\n");
		System.out.printf("%-42s$%8s\n", itemOne, priceOneReciept);
		System.out.printf("%-42s$%8s\n", itemTwo, priceTwoReciept);
		System.out.printf("%-42s$%8s\n", itemThree, priceThreeReciept);
		System.out.println(dividingLine);
		System.out.printf("%-42s$%8s\n", "Subtotal", subtotalReciept);
		System.out.printf("%-42s$%8s\n", "Tax " + recieptTax.format(TAX), taxReciept);
		System.out.printf("%-42s$%8s", "Total", totalReciept);
	}

}