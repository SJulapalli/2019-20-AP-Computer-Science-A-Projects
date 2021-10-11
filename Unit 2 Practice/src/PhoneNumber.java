/**
 * @(#)PhoneNumber.java
 *
 * Phone Number randomly a phone number using Math.random method and outputs
 * in the form (XXX) XXX-XXXX where the area code and exchange code must not begin with a 0 or 1
 *
 * @author Suhas Julapalli
 * @date 10/18/19
 * @period 5
 */



public class PhoneNumber
{
    public static void main(String[] args)
    {
        //Utilize Math.random() to create a random area code, exchange code, 
        //  and subscriber line number (the last four digits)
        int areaCode, exchangeCode, lastFourDigits; 
        areaCode = (int)(Math.random() * 800) + 200;
        exchangeCode = (int)(Math.random() * 800) + 200;
        lastFourDigits = (int)(Math.random() * 10000);
        
        //Output using print and/or println method in the form (XXX) XXX - XXXX
        System.out.printf("The phone number is: (%d) %d - %04d", areaCode, exchangeCode, lastFourDigits);
    }
}
