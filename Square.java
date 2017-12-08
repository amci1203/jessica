/******************************************************
 *Class for a square to be drawn on the screen. 
 *Inherits from the class Retangle. 
 *******************************************************/
public class Square extends Rectangle
{
    public static final int DEFAULT_OFFSET = 0;
    public static final int DEFAULT_SIZE = 7;
    private int offset, size;

    public Square() { //constructor
       //inherits from Retangle
       super(DEFAULT_OFFSET, DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public Square(int theOffset, int theSize) {//constructor
       //inherits from Retangle
       super(theOffset, theSize, theSize);
    }

    public int getSize() {return size;}
    public void setSize(int newSize) {size = newSize;}

    public void reset(int newOffset, int newSize) {
        //inherits from Retangle
        super.reset(newOffset, newSize, newSize);
    }
}

    