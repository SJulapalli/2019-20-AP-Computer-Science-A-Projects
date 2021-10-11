import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Circle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        this(30, 20, 60, "blue");
        makeVisible();
    }

    /**
     * Create a circle of a specified diameter
     */
    public Circle(int startDiam) {
        this(startDiam, 20, 60, "blue");
        makeVisible();
    }
    
    /**
     * Create a circle of a specified color
     */
    public Circle(String startColor) {
        this(30, 20, 60, startColor);
        makeVisible();
    }
    
    /**
     * Create a circle of a specified diameter at a specified location
     */
    public Circle(int startDiam, int xStart, int yStart) {
        this(startDiam, xStart, yStart, "blue");
        makeVisible();
    }
    
    /**
     * Create a circle of a specified diameter and color
     */
    public Circle(int startDiam, String startColor) {
        this(startDiam, 20, 60, startColor);
        makeVisible();
    }
    
    /**
     * Create a circle at a specified location
     */
    public Circle(int xStart, int yStart) {
        this(30, xStart, yStart, "blue");
        makeVisible();
    }
    
    /**
     * Create a circle of a specified diameter and color at a specified location
     * Acts as the generic constructor.ee
     */
    public Circle(int startDiam, int xStart, int yStart, String startColor) {
        this.diameter = startDiam;
        this.xPosition = xStart;
        this.yPosition = yStart;
        this.color = startColor;
        makeVisible();
    }
    
    /**
     * Repositions the Circle to (newX, newY)
     */
    public void reposition(int newX, int newY) {
        xPosition = newX;
        yPosition = newY;
        draw();
    }
    
    /**
     * Accesses and returns the position of the Circle
     */
    public String getPosition() {
        String coords = "(" + xPosition + "," + yPosition + ")";
        return coords;
    }
    
    /**
     * Returns the current value of the diameter attribute
     */
    public int getSize() {
        return diameter;
    }
    
    /**
     * Returns the current value of the color attribute
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
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
     * Slowly move the circle vertically by 'distance' pixels.
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
    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
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
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    diameter, diameter));
            canvas.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    public String toString() {
    	return String.format("%s Circle with diameter %d at (%d. %d)", color, diameter, xPosition, yPosition);
    }
}

