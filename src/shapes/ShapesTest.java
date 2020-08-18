package shapes;
/*create a variable of the type Rectangle named box1 and assign it a new instance of the
Rectangle class with a width of 4 and a length of 5.

verify that the getPerimeter and getArea methods return 18 and 20, respectively.

create a variable of the type Rectangle named box2 and assign it a new instance of the Square
class that has a side value of 5.

verify that the getPerimeter and getArea methods return 20 and 25, respectively.*/
public class ShapesTest {
    protected int box1;
    protected int box2;

    public static void main(String[] args) {
        //creates a variable with Rectangle as type, and assigns it a new instance with parameters
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());
        System.out.println("The area of the rectangle is: " + box1.getArea());
        //creates a variable with square as type, and assigns it a new instance with parameters
        Square box2 = new Square(4);
        System.out.println("The perimeter of the square is: " + box2.getPerimeter());
        System.out.println("The area of the square is: " + box2.getArea());
    }
}
