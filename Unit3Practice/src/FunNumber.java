/**
 * public class FunNumber holds an integer value and has methods
 * which provide mathematical information about the number.
 *
 * Complete the methods as described
 *
 * @author (your name)
 * @date (due date)
 */
public class FunNumber
{
    private int original;  //value of this FunNumber

    /**
     * constructs a FunNumber with value num
     */
    public FunNumber(int num)
    {
        // code goes here
    	original = num;
    }
    
    /**
     * constructs a FunNumber with a random value 
     *   in the range [-100, 100]
     */
    public FunNumber()
    {
        // code goes here
    	original = (int)(Math.random() * 201) - 100;
    	
    }

    /**
     * Counts the digits in this FunNumber value
     * Must consider if original is negative.
     * @return the number of the digits
     * Postcondition: original remains unchanged
     */
    public int findNumDigits()
    {
        int i = original;
        int numDigits = 0;
        
        while (Math.abs(i) > 0) {
        	i /= 10;
        	numDigits++;
        }
        
        return numDigits;
    }


    /**
     * Sums the digits in this FunNumber value
     * Ignore the sign of the original before finding the sum of the digits
     * @return the sum of the digits
     * Postcondition: original remains unchanged
     */
    public int sumDigits()
    {
        // code goes here
    	String digits = new String();
    	digits += Math.abs(original);
    	int sumDigits = 0;
    	
    	for (int i = 0; i < digits.length(); i++) {
    		sumDigits += Integer.parseInt(digits.substring(i, i + 1));
    	}
    	
    	return sumDigits;
    }

    /**
     * @return true if this FunNumber is even;
     *      false otherwise
     * Postcondition: original remains unchanged
     */
    public boolean isEven()
    {
         // code goes here
    	if (original % 2 == 0)
    		return true;
    	else
    		return false;
    }

    /**
     * @return true if the sum of the digits of this FunNumber
     *      is a divisor of the FunNumber; false otherwise
     * Postcondition: original remains unchanged
     */
    public boolean sumIsDivisor()
    {
         // code goes here
    	if (original % sumDigits() == 0)
    		return true;
    	else
    		return false;
    }

    /**
     * Sums the integers that are less than or equal to this
     * FunNumber value
     * @return the sum of the integers <= this FunNumber value;
     *       -1 if original is non-positive
     * Postcondition: original remains unchanged
     */
    public int sumIntsFrom1toNum()
    {
        // code goes here
    	int sumInts = -1;
    	
    	if (original > 0) {
    		sumInts = 0;
        	for (int i = 0; i <= original; i++)
        		sumInts += i;	
    	}
    	
    	return sumInts;
    }

    /**
     * Determines the factorial of this FunNumber value
     * @return this FunNumber value's factorial; -1 if
     *        original is negative
     * Postcondition: original remains unchanged
     */
    public int findFactorial()
    {
        // code goes here
    	int factorialResult = 1;
    	
    	if (original < 0) {
    		factorialResult = 1;
    	}
    	else if (original >= 0) {
    		for (int i = 1; i <= original; i++) {
    			factorialResult *= i;
    		}
    	}
    	
    	return factorialResult;
    }

    /**
     * Creates a String representing all positive factors of this FunNumber value
     * factors are separated by spaces
     * ie: factors of 6 are "1 2 3 6 "
     * Ignore the sign of the original before finding the factors
     * @return a String representation of the factors of this FunNumber
     * Postcondition: original remains unchanged
     */
    public String allFactors()
    {
        // code goes here
    	String factors = new String("1");
    	
    	for (int i = 2; i <= Math.abs(original); i++) {
    		if (Math.abs(original) % i == 0) {
    			factors += " " + i;
    		}
    	}
    	
    	return factors;
    }

    /**
     * Determines if this FunNumber value is prime
     * @return true if this value is prime, false otherwise
     * Postcondition: original remains unchanged
     */
    public boolean isPrime()
    {
        // code goes here
    	if (allFactors().equals("1 " + original))
    		return true;
    	else return false;
    }

    /**
     * A perfect number is a number that has a sum of proper factors
     * equal to the value of this number. 6 is a perfect number
     * because 6 = 1 + 2 + 3.
     * @return true if this FunNumber value is a perfect number, 
     *       false otherwise.
     * Postcondition: original remains unchanged
     */
    public boolean isPerfect()
    {
        // code goes here
    	int factorSum = 0;
    	
    	for (int i = 1; i < original; i++) {
    		if (original % i == 0)
    			factorSum += i;
    	}
    	
    	if (factorSum == original)
    		return true;
    	else return false;
    	
    }

    /**
     * Creates a new FunNumber that results by reversing the digits of
     * this FunNumber
     * @return a FunNumber which is the reverse of this FunNumber
     * Postcondition: original remains unchanged
     */
    public FunNumber reverse()
    {
        //code goes here
    	FunNumber reverse = new FunNumber(original);   	
    	int i = 0;
    	while (i > 0) {
    		reverse.original *= 10;
    		reverse.original += i % 10;
    		i /= 10;
    	}
    	
    	return reverse;
    }

    /**
     * @return the int value of this FunNumber
     * Postcondition: original remains unchanged
     */
    public int getValue()
    {
        //code goes here
    	return original;
    }

    /**
     * @param newInt a new integer value to replace original
     * Postcondition: The value of this FunNumber is newInt
     */
    public void setValue(int newInt)
    {
        //code goes here
    	original = newInt;
    }

    /**
     * Precondition: other is a FunNumber object
     * @param other is another FunNumber
     * @return sum of other FunNumber value and this FunNumber value
     * Postcondition: original remains unchanged
     */
    public int getSum(FunNumber other)
    {
        //code goes here
    	return original + other.original;
    }

    /**
     * @returns a String representation of the integer being held
     * Postcondition: original remains unchanged
     */
    public String toString()
    {
        //code goes here
    	return new String("" + original);
    }

    /**
     * Precondition: other is a FunNumber object
     * @returns true if other holds the same value as this FunNumber value
     * Postcondition: original remains unchanged
     */
    public boolean equals(FunNumber other)
    {
        //code goes here
    	if (other.original == original) return true;
    	else return false;
    }

    /**
     * Create your own FunNumber Method(s)
     * Remember to comment the purpose of the method
     * and utilize a proper return type
     * This should be something that the Math class does not accomplish
     * The lcm method from the loops powerpoint would be a good option
     */
}
