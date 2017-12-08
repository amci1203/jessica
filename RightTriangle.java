/******************************************************
 *Class for a right triangle to be drawn on the screen. 
 *Inherits from the class Figure: getOffset, setOffset, 
 *and override drawHere. It is used as a base class.
 *******************************************************/
public class RightTriangle extends Figure
{
    public static final int DEFAULT_SIZE = 3;
    public static final int DEFAULT_OFFSET = 0;
    public int size;
    public int offset;

    public RightTriangle() { //constructor
       this(DEFAULT_OFFSET, DEFAULT_SIZE);      
    }

    public RightTriangle(int theOffset, int theSize) { //constructor
       offset = theOffset;
       size = theSize;
    }

    public int getSize() {return size;}
    public int getOffset() {return offset;}
    public void setSize(int newSize) {size = newSize;}
    public void setOffset(int newOffset) {offset = newOffset;}

    public void reset(int newOffset, int newSize){
       offset = newOffset;
       size = newSize;
    }

    public void drawHere() {
       int off, count, i;
       for (i=0; i<=size; i++) {
          for (off=0; off < offset; off++)
               System.out.print(" ");
          for (count=0; count<i; count++) 
               System.out.print("*");
          System.out.println(); 
       }
    }

    public double getArea(){
       double area;
       area = (size*size)/2.0;
       return area;
    }

    public double getCircumference() {
       double cir;
       cir = (size * 2) + Math.pow((2 * size * size), 0.5);
       return Math.round(cir * 100) / 100.0;
    }
}

    