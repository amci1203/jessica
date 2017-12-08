import java.util.Scanner;

public class DrawFigures {
    static int offset, size, height, width, input;
    static Scanner num = new Scanner(System.in);
    static Scanner word = new Scanner(System.in);

    public static void main (String[] args) {
        char test; // We use a char instead of string so we can check for y/n easier
        Boolean repeat = true, valid = false;

        do {

            do {
                System.out.println("Which shape would you like to test?");
                System.out.println("1: right triangle\t2: rectangle\t3: square");
                input = num.nextInt();
            } while(input < 0 || input > 3);

            // it's a lot of lines, so we'll split the tests into seperate methods
            switch (input) {
                case 1:
                    RightTriangleTest();
                    break;
                case 2:
                    RectangleTest();
                    break;
                case 3:
                    SquareTest();
                    break;
                default:
                    System.out.println("Sorry, that is not an option :(");
            }

            System.out.println();
            System.out.println("=================================================");
            System.out.println();

            do {
                System.out.println("Would you like to test something else? (Y/N)");
                test = word.nextLine().charAt(0);

                // using case fallthrough to make the code easier to read at first glance
                switch (test) {
                    case 'Y':
                    case 'y':
                        valid = true;
                        repeat = true;
                        break;
                    case 'N':
                    case 'n':
                        valid = true;
                        repeat = false;
                        break;
                    default:
                        valid = false;
                        System.out.println("Answer Y or N please...");
                }
            } while (!valid);

        } while (repeat);

        System.out.println();
        System.out.println("And that's all folks !!!");
        System.out.println("Press Enter key to close...");
        String close = word.nextLine(); // so the program doesn't automatically close
    }

    public static void RightTriangleTest () {
        System.out.println("Testing RightTriangle() constructor...");
        System.out.println();
        RightTriangle right1 = new RightTriangle();
        right1.drawHere();

        System.out.println();
        System.out.println("Testing RightTriangle(offset, size) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter a nonnegative offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;
        do {
            System.out.println("Please enter the right triangle's size");
            input = num.nextInt();
        } while (input < 0);
        size = input;

        RightTriangle right2 = new RightTriangle(offset, size);
        right2.drawHere();

        System.out.println();
        System.out.println("Testing RightTriangle reset(offset, size) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter a nonnegative offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;
        do {
            System.out.println("Please enter the right triangle's size");
            input = num.nextInt();
        } while (input < 0);
        size = input;

        System.out.println();
        right2.reset(offset, size);
        right2.drawHere();

        System.out.println();
        System.out.println("Testing Right Triangle's getArea() method...");
        System.out.println("Current Area: " + right2.getArea() + " square units");
        System.out.println("Testing Right Triangle's getCircumference() method...");
        System.out.println("Current Perimeter: " + right2.getCircumference() + " units");
    }

    public static void RectangleTest () {
        System.out.println("Testing Rectangle() constructor...");
        Rectangle rect1 = new Rectangle();
        rect1.drawHere();

        System.out.println();
        System.out.println("Testing Rectangle(offset, height, width) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter an offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;

        do {
            System.out.println("Please enter the rectangle's height");
            input = num.nextInt();
        } while (input < 0);
        height = input;

        do {
            System.out.println("Please enter the rectangle's width");
            input = num.nextInt();
        } while (input < 0);
        width = input;

        System.out.println();
        Rectangle rect2 = new Rectangle(offset, height, width);
        rect2.drawHere();

        System.out.println();
        System.out.println("Testing Rectangle's reset(offset, height, width) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter an offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;

        do {
            System.out.println("Please enter the rectangle's height");
            input = num.nextInt();
        } while (input < 0);
        height = input;

        do {
            System.out.println("Please enter the rectangle's width");
            input = num.nextInt();
        } while (input < 0);
        width = input;

        System.out.println();
        rect2.reset(offset, height, width);
        rect2.drawHere();

        System.out.println();
        System.out.println("Testing Rectangle's getArea() method...");
        System.out.println("Current Area: " + rect2.getArea() + " square units");
        System.out.println("Testing Rectangle's getCircumference() method...");
        System.out.println("Current Perimeter: " + rect2.getCircumference() + " units");
    }

    public static void SquareTest () {
        System.out.println("Testing Square() constructor...");
        Square square1 = new Square();
        square1.drawHere();

        System.out.println();
        System.out.println("Testing Square(offset, size) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter an offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;

        do {
            System.out.println("Please enter the square's size");
            input = num.nextInt();
        } while (input < 0);
        size = input;

        System.out.println();
        Square square2 = new Square(offset, size);
        square2.drawHere();
        System.out.println();

        System.out.println();
        System.out.println("Testing Rectangle's reset(offset, height, width) constructor...");
        System.out.println();

        do {
            System.out.println("Please enter an offset length");
            input = num.nextInt();
        } while (input < 0);
        offset = input;

        do {
            System.out.println("Please enter the rectangle's size");
            input = num.nextInt();
        } while (input < 0);
        size = input;

        System.out.println();
        square2.reset(offset, size);
        square2.drawHere();

        System.out.println();
        System.out.println("Testing Square's getArea() method...");
        System.out.println("Current Area: " + square2.getArea() + " square units");
        System.out.println("Testing Square's getCircumference() method...");
        System.out.println("Current Perimeter: " + square2.getCircumference() + " units");
    }
}