/**
 *  Name: Suhas Julapalli
 *  Period: 5
 *  Submit by the end of the class period TODAY
 *  10 pts possible
 */
public class HouseRunner1
{
    /**
     * Using the 5 default objects created below (sun, house, window, door, and roof)
     * along with the methods presented during the BlueJ and Shapes Lab, to create a
     * house shape. Be create using the colors available.
     * 
     * Hint: Resize and move the house into place before the door and window.
     * 
     * Only the methods discussed in the Shapes lab may be used.
     */
    public static void main(String[] args)
    {
        Circle sun = new Circle();
        Square house = new Square();
        Square window = new Square();
        Rect chimney = new Rect();
        Triangle roof = new Triangle();
        //Your code goes below this line
        house.slowMoveHorizontal(100); //150
        house.slowMoveVertical(50);
        house.changeSize(125);
        
        window.changeColor("blue");
        window.slowMoveHorizontal(155); //x-position 225
        window.slowMoveVertical(80);
        window.changeSize(50);
        
        chimney.slowMoveHorizontal(85);
        chimney.slowMoveVertical(-30);
        chimney.changeSize(50, 30);
        
        roof.changeSize(50, 150);
        roof.slowMoveHorizontal(162); //150 - 50 + 62
        roof.slowMoveVertical(50); //110 - 15
        
        sun.changeColor("yellow");
        sun.slowMoveHorizontal(15);
        sun.changeSize(75);
       
    }
}
