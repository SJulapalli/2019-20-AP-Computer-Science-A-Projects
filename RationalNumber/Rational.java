
/**
 * Write a description of class Rational here.
 *
 * @Suhas Julapalli
 * @Version 1.0
 */
public class Rational implements Comparable
{
    int numerator;
    int denominator;
    
    /**
     * Creates a rational number with a value of 0
     */
    public Rational () {
        this(0);
    }
    
    /**
     * Copies a different rational number
     */
    public Rational (Rational other) {
        numerator = other.numerator;
        denominator = other.denominator;
    }
    
    /**
     * Creates a rational number based on an inputed integer value
     */
    public Rational (int value) {
        numerator = value;
        denominator = 1;
    }
    
    /**
     * Takes in a numerator and denominator to create a rational number
     */
    public Rational (int n, int d) {
        if (d == 0) {
            n = Integer.MAX_VALUE;
            d = 1;
        }
        
        if (d < 0) {
            d *= -1;
            n *= -1;
        }
        
        numerator = n;
        denominator = d;
    }
    
    /**
     * Adds two rational numbers
     */
    public Rational add(Rational other) {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator *= other.denominator;
        
        return new Rational (numerator, denominator);
    }
    
    /**
     * Subtracts two rational numbers
     */
    public Rational subtract(Rational other) {
        return add( new Rational ( - other.numerator, other.denominator));
    }
    
    /**
     * Multiplies two rational numbers
     */
    public Rational multiply(Rational other) {
        Rational temp = new Rational();
        
        temp.numerator = numerator * other.numerator;
        temp.denominator = denominator * other.denominator;
        
        return temp;
    }
    
    /**
     * Divides two rational numbers
     */
    public Rational divide(Rational other) {
        return multiply(reciprocal(other));
    }
    
    /**
     * Mutator method for the numerator
     */
    public void setNumerator(int newNum) {
        numerator = newNum;
    }
    
    /**
     * Mutator method for the denominator
     */
    public void setDenominator(int newDenom) {
        denominator = newDenom;
    }
    
    /**
     * Copies another rational number's numerator and denominator
     * 
     * Precondition: the other rational number is already reduced
     */
    public void setRational(Rational other) {
        setNumerator(other.numerator);
        setDenominator(other.denominator);
    }
    
    /**
     * Returns the reciprocal of the given rational number
     */
    private Rational reciprocal(Rational other) {
        Rational temp = new Rational();
        
        temp.denominator = other.numerator;
        temp.numerator = other.denominator;
        
        return temp;
    }
    
    public int compareTo (Object other) {
    	if (other instanceof Rational) {
    		if (subtract((Rational)other).numerator > 0)
    			return 1;
    		else if (subtract((Rational)other).numerator == 0)
    			return 0;
    		else return -1;
    	}
    	return (Integer) null;
    }
    
    /**
     * Reduces a rational number to its simplest state
     */
    private void reduce() {
        int gcf = gcd(Math.abs(numerator), denominator);
        
        numerator /= gcf;
        denominator /= gcf;
    }
    
    /**
     * Finds the Greatest Common Denominator of two numbers
     */
    private int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }
}