import java.awt.*;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Triangle
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle()
    {
        this(30, 40, 50, 15, "green");
        makeVisible();
    }

    /**
     * Create a triangle of a specified height and width
     */
    public Triangle(int startHeight, int startWidth) {
        this(startHeight, startWidth, 50, 15, "green");
        makeVisible();
    }
    
    /**
     * Create a triangle of a specified color
     */
    public Triangle(String startColor) {   
        this(30, 40, 50, 15, startColor);
        makeVisible();
    }
    
    /**
     * Create a triangle of a specified height and width at a specified location
     */
    public Triangle(int startHeight, int startWidth, int xStart, int yStart) {
        this(startHeight, startWidth, xStart, yStart, "green");
        makeVisible();
    }
    
    /**
     * Create a triangle of a specified height, width, and color
     */
    public Triangle(int startHeight, int startWidth, String startColor) {
        this(startHeight, startWidth, 50, 15, startColor);
        makeVisible();
    }
    
    /**
     * Create a triangle of a specified height, weight, and color at a specified location
     * Acts as the generic constructor
     */
    public Triangle(int startHeight, int startWidth, int xPos, int yPos, String col) {
        this.height = startHeight;
        this.width = startWidth;
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.color = col;
        makeVisible();
    }
    
    /**
     * Repositions the triangle to a specified position
     */
    public void reposition(int newX, int newY) {
        xPosition = newX;
        yPosition = newY;
        draw();
    }
    
    /**
     * Sets the height of the triangle to a specified amount
     */
    public void changeHeight(int newHeight) {
        height = newHeight;
        draw();
    }
    
    /**
     * Sets the width of the triangle to a specified amount
     */
    public void changeWidth(int newWidth) {
        width = newWidth;
        draw();
    }
    
    /**
     * Accesses and returns the position of the triangle
     */
    public String getPosition() {
        String coords = "(" + xPosition + "," + yPosition + ")";
        return coords;
    }
    
    /**
     * Returns the current value of the height and width attributes
     */
    public String getSize() {
        String size = "height = " + height + "; width = " + width;
        return size;
    }
    
    /**
     * Returns the height of the triangle
     */    
    public int getHeight() {
        return height;
    }
    
    /**
     * Returns the width of the triangle
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Returns the current value of the color attribute
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Make this triangle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the triangle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the triangle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the triangle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the triangle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the triangle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the triangle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the triangle horizontally by 'distance' pixels.
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
     * Slowly move the triangle vertically by 'distance' pixels.
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
     * Draw the triangle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

    /*
     * Erase the triangle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    public String toString() {
    	return String.format("%s Triangle with a height of %d and a width of %d at (%d, %d)", color, height, width, xPosition, yPosition);
    }
    	
}