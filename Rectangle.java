/******************************************************
 *Class for a rectangular to be drawn on the screen. 
 *Inherits from the class Figure: getOffset, setOffset,
 *and override drawHere. It is used as a base class.
 *******************************************************/
public class Rectangle extends Figure
{
    public static final int DEFAUL_HEIGHT = 4;
    public static final int DEFAUL_WIDTH = 3;
    public static final int DEFAUL_OFFSET = 0;
    private int width, height, offset;


    public Rectangle() { //constructor
       this(DEFAUL_HEIGHT, DEFAUL_WIDTH, DEFAUL_OFFSET);
    }

    //constructor
    public Rectangle(int theOffset, int theHeight, int theWidth) { 
       reset(theOffset, theHeight, theWidth);
    }

    public void reset(int newOffset, int newHeight, int newWidth) {
       width = newWidth;
       height = newHeight;
       offset = newOffset;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getOffset() {return offset;}
    public void setWidth(int newWidth) {width = newWidth;}
    public void setHeight(int newHeight) {height = newHeight;}
    public void setOffset(int newOffset) {offset = newOffset;}

    public void drawHere() {
       int i;
       int wid;
       int off;

       // draw top
       for (off=0; off<offset; off++)
           System.out.print(" ");
       for (i=0; i<width; i++)
           System.out.print("-");
       System.out.println();

       // draw sides
       for (i=0; i<height; i++) {
           for (off=0; off<offset; off++) 
               System.out.print(" ");
       System.out.print("|");
       for (wid=0; wid<width-2; wid++) {
            System.out.print(" ");
       } 
       System.out.print("|");
       System.out.println(); 
       }

       // draw bottom
       for (off=0; off<offset; off++)
            System.out.print(" ");
       for (i=0; i<width; i++)
            System.out.print("-");
       System.out.println(); 

    }


    public double getArea() {
       return height*width;
    }

    public double getCircumference() {
       return width*2 + height*2;
    }
}

    