/**
 *  Name:
 *  Period:
 *  Submit by the end of the class period TODAY
 *  6 pts possible
 */
public class HouseRunner2
{
    /**
     * Using overloaded constructors for the objects of the Shapes Lab,
     * create your house shape with the least amount of code possible.
     * 
     * Be creative using the colors available.
     * 
     * Only the methods discussed in the Shapes lab may be used.
     */
    public static void main(String[] args)
    {
        Circle sun = new Circle(75, 35, 60, "yellow");
        Square house = new Square(125, 150, 110, "red");
        Square window = new Square(50, 205, 140, "blue");
        Rect chimney = new Rect(50, 30, 155, 60, "yellow");
        Triangle roof = new Triangle(50, 150, 212, 65, "green");
        
    }
}
