import java.awt.*;
/**
 * PixMethods.java
 *
 *  PixLab graded methods
 *  For this task you will complete two Picture filters for the PixLab.
 *  1) You will fully implement the anselAdams method which increases the black/white
 *      contrast of a grayscale image.
 *  2) You will implement 2 helper methods to make the andyWarhol method work as expected.
 *      a) primaryColors converts every Pixel in the image to a "primary color"
 *      b) rotateColors converts "primary colors" of an image to a different "primary color"
 *  
 *  For this project: a primary color is defined as a color with color codes that are either 0 or 255 only.
 *
 * @Name (Your name)
 * @Date (Due Date)
 * @Period (Class Period)
 */
public class PixMethods
{
    /**
     * Ansel Adams is a famous photographer, known for his deeply 
     *    contrasted black and white images. 
     * Complete the anselAdams method so that it will take in a picture,  
     *      convert it into a black and white image using the grayscale method 
     *      from PixLab Activity A5, and enhance the contrast by making the 
     *      darkest 25% of the grayscale image 5 shades darker and the 
     *      lightest 25% of the image 5 shades lighter.
     * Therefore a shade of gray that is java.awt.Color[r=10,g=10,b=10]
     *      is set to java.awt.Color[r=5,g=5,b=5] and java.awt.Color[r=220,g=220,b=220]
     *      is set to java.awt.Color[r=225,g=225,b=225].
     * @param pix a Picture to be modified
     */
    public static void anselAdams(Picture pix)
    {
        
    }

    /**
     * Andy Warhol was an American artist well known for his pop art.  
     *      His works include the Marilyn Monroe Diptych which is a collage
     *      of images of Marilyn Monroe each with a different set of colors.
     * The andyWarhol method will take any picture, scale it down to 25% and 
     *      create a collage of 4 versions of the image in the style of 
     *      Andy Warhol’s Marilyn Monroe. 
     * For this method to work you must complete the helpers methods primaryColors 
     *      and rotateColors.
     */
    public static void andyWarhol(Picture pix)
    {
        Pixel[][] pixels = pix.getPixels2D();
        //scales to 1/4 the size to create 4 pictures in 1
        Picture scaled = pix.scale(.5,.5);

        //Wash out the colors
        primaryColors(scaled);
        //Posts the primary color version of pix in the upper left corner
        pix.copy(scaled, 0, 0);

        //Switch out the colors
        rotateColors(scaled);
        //Posts the new colored version of pix in the lower left corner
        pix.copy(scaled, pixels.length / 2, 0);

        //Creates the image for the upper right corner
        rotateColors(scaled);
        pix.copy(scaled, 0, pixels[0].length / 2);
        
        //Creates the image for the lower right corner
        rotateColors(scaled);
        pix.copy(scaled, pixels.length / 2, pixels[0].length / 2);
    }

    /**
     * Complete the primaryColors method which takes in a picture
     *      and washes out every Pixel to be the nearest primary color.
     * 
     * Therefore: java.awt.Color[r=10,g=10,b=10] is set to java.awt.Color[r=0,g=0,b=0] 
     *      and java.awt.Color[r=220,g=220,b=220] is set to java.awt.Color[r=255,g=255,b=255]
     *      and java.awt.Color[r=10,g=100,b=200] is set to java.awt.Color[r=0,g=0,b=255].
     * For this method consider a primary color to be any color such that its RGB values are either 0 or 255.
     */
    private static void primaryColors(Picture pix)
    {
        /* Your code goes here */
    }

    /**
     * Complete the rotateColors method which takes in a picture
     *      and rotates the color of every Pixel to be the next primary color in the given
     *      array of colors.
     * 
     * Therefore: Color.WHITE is set to Color.RED 
     *      and Color.RED is set to Color.YELLOW
     *      and Color.MAGENTA is set to Color.WHITE.
     * For this method consider a primary color to be any color such that its RGB values are either 0 or 255.
     */
    private static void rotateColors(Picture pix)
    {
        Color[] primary = {Color.WHITE, Color.RED, Color.YELLOW, Color.GREEN, 
                Color.BLACK, Color.CYAN, Color.BLUE, Color.MAGENTA};
        /* Your code goes here */
    }

    /**
     * Run this to see your methods in action.
     */
    public static void main(String[] args)
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        anselAdams(beach);
        beach.explore();
        Picture wall = new Picture("wall.jpg");
        wall.explore();
        andyWarhol(wall);
        wall.explore();
    }

}
