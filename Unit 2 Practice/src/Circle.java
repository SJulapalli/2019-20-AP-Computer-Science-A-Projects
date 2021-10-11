
/**
 * Circle.java prints the area of a circle with two different radii
 * 
 * @author Suhas Julapalli
 * @date 10/16/19
 * @period 5
 */
public class Circle
{
    public static void main(String[] args)
    {

        int radius = (int)(Math.random() * 100) + 1;
        double area1 = Math.PI * radius * radius;
        double circumference1 = Math.PI * 2 * radius;
        
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        
        radius = 2 * radius;
        double area2 = Math.PI * radius * radius;
        double circumference2= Math.PI * 2 * radius;
        
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
        
        double areaChange = area2/area1;
        double circumferenceChange = circumference2/circumference1;
        
        System.out.println("The factor by which a circle's area increases when its radius is doubled is " + areaChange);
        System.out.println("The factor by which a circle's cicumference is increased when its radius is doubled is " + circumferenceChange);
    }
}
