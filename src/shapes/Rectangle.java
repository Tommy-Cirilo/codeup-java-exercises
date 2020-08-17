package shapes;

/*Should have protected properties for both length and width. Rectangle
should define a constructor that accepts two numbers for length and width,
and sets those properties.

Create two methods on the Rectangle class, getArea and getPerimeter that
return the respective values.*/

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //This generates the area for the given length and width property
    public int getArea() {
        return length * width;
    }
    //This generates the perimeter for the given length and width property
    public int getPerimeter() {
        return 2 * length + 2 * width;
    }
}
