import java.awt.*;

/**
 * Write a description of class Rect here.
 *
 * @author Suhas Julapalli
 * @version 9/24/19
 */
public class Rect
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Rect()
    {
        this(40, 30, 70, 90, "yellow");
        makeVisible();
    }

    /**
     * Create a rectangle of a specified height and width
     */
    public Rect(int startHeight, int startWidth) {
        this(startHeight, startWidth, 70, 90, "yellow");
        makeVisible();
    }
    
    /**
     * Create a rectangle of a specified color
     */
    public Rect(String startColor) {   
        this(40, 30, 70, 90, startColor);
        makeVisible();
    }
    
    /**
     * Create a rectangle of a specified height and width at a specified location
     */
    public Rect(int startHeight, int startWidth, int xStart, int yStart) {
        this(startHeight, startWidth, xStart, yStart, "yellow");
        makeVisible();
    }
    
    /**
     * Create a rectangle of a specified height, width, and color
     */
    public Rect(int startHeight, int startWidth, String startColor) {
        this(startHeight, startWidth, 70, 90, startColor);
        makeVisible();
    }
    
    /**
     * Create a rectangle of a specified height, weight, and color at a specified location
     * Acts as the generic constructor
     */
    public Rect(int startHeight, int startWidth, int xPos, int yPos, String col) {
        this.height = startHeight;
        this.width = startWidth;
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.color = col;
        makeVisible();
    }
    
    /**
     * Repositions the rectangle to a specified position
     */
    public void reposition(int newX, int newY) {
        xPosition = newX;
        yPosition = newY;
        draw();
    }
    
    /**
     * Sets the rectangle's height attribute to a specified amount
     */
    public void changeHeight(int newHeight) {
        height = newHeight;
        draw();
    }
    
    /**
     * Sets the rectangle's width attribute to a specified amount
     */
    public void changeWidth(int newWidth) {
        width = newWidth;
        draw();
    }
    
    /**
     * Accesses and returns the position of the rectangle
     */
    public String getPosition() {
        String coords = "(" + xPosition + "," + yPosition + ")";
        return coords;
    }
    
    /**
     * Returns the current values of the height and width attributes
     */
    public String getSize() {
        String size = "Width = " + width + "; Height = " + height;
        return size;
    }
    
    /**
     * Returns the current value of the width attribute
     */
    public String getWidth() {
        String width = "width = " + this.width;
        return width;
    }
    
    /**
     * Returns the current value of the height attribute
     */
    public String getHeight() {
        String height = "height = " + this.height;
        return height;
    }
    
    /**
     * Returns the current value of the color attribute
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the square a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the square a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the square a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the square a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the square horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the square vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the square horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the square vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /*
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
            new Rectangle(xPosition, yPosition, width, height));
            canvas.wait(10);
        }
    }

    /*
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    public String toString() {
    	return String.format("%s Rectangle of height %d and width %d at (%d, %d)", color, height, width, xPosition, yPosition);
    }
}
