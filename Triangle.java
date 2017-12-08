/*****************************************************************
 *Class for triangles to be drawn on screen. For this class,
 *a triangle points up and is completely determined by the size of
 *its base. (Screen character spacing determines the length of the
 *sides, given the base line.)
 *Inherits from Figure: getOffset, setOffset, and override drawHere.
 *It is used as a base clase.
 *****************************************************************/
import java.io.*;

public class Triangle extends Figure
{
    private int base;

    public Triangle()  //constructor
    {
        super();
        base = 0;
    }

    public Triangle(int theOffset, int theBase)  //constructor
    {
        super(theOffset);
        base = theBase;
    }

    public void reset(int newOffset, int newBase)
    {
        setOffset(newOffset);
        base = newBase;
    }

    /*******************************
     *Draws the figure at current line.
     *******************************/
    public void drawHere()
    {
        drawTop();
        drawBase();
    }

    private void drawBase()
    {
        spaces(getOffset());
        int count;
        for (count = 0; count < base; count++)
            System.out.print('*');
        System.out.println();
    }

    private void drawTop()
    {
        //startOfLine will be the number of spaces to the first '*' on a
        //line. Initially set to the number of spaces before the top '*'.
        int startOfLine = getOffset() + (base/2);
        spaces(startOfLine);
        System.out.println('*');//top '*'
        int count;
        int lineCount = (base/2) - 1;//height above base
        //insideWidth == number of spaces between the two '*'s on a line.
        int insideWidth = 1;
        for (count = 0; count < lineCount; count++)
        {
           //Down one line so the first '*' is one more space to the left.
            startOfLine--;
            spaces(startOfLine);
            System.out.print('*');
            spaces(insideWidth);
            System.out.println('*');
           //Down one line so the inside is 2 spaces wider.
            insideWidth = insideWidth + 2;
        }
    }

    private static void spaces(int number)
    {
        int count;
        for (count = 0; count < number; count++)
            System.out.print(' ');
    }
}

