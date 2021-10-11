import java.util.Scanner;
/**
 * QuadraticFormula.java
 * 
 * Computes and Solves Quadratic Equations in the form ax^2+bx+c=0
 * Outputs two solutions given to four decimal places.
 * 
 * @author Suhas Julapalli
 * @date 10/18/19
 * @period 5
 */
public class QuadraticFormula
{
   public static void main(String[] args)
   {
       //Use Math.random() to assign random integers in the range [-25,25]
       int a, b, c;
       Scanner s = new Scanner(System.in);
       System.out.println("Quadratic Formula");
       System.out.print("Enter an int for a: ");
       a = s.nextInt();
       s.nextLine();
       System.out.print("Enter an int for b: ");
       b = s.nextInt();
       s.nextLine();
       System.out.print("Enter an int for c: ");
       c = s.nextInt();
       s.nextLine();
       
       //Calculate the discriminant here (discriminant only!)
       double discriminant = Math.pow(b, 2) - (4 * a * c); 

       //Compute the two answers here
       double answer1 = (-b + Math.sqrt(discriminant)) / (2*a);
       double answer2 = (-b - Math.sqrt(discriminant)) / (2*a);
       
       //Output the results 
       System.out.printf("The solutions to %dx^2 + %dx + %d are %f and %f", a, b, c, answer1, answer2);
   }
   
}