package shapes;

public class Circle {
    //declares radius as a private double
    private double radius;

    public Circle() {}


    public Circle(double radius) {
        this.radius = radius;
    }
    //retrieves the radius input value
    public double getRadius() {
        return radius;
    }
    //sets the radius value
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // gets the circumference by using this formula from the radius input
    public double getCircumference() {
        return this.radius * Math.PI * 2;
    }
    // gets the area of the circle based off of the radius input
    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
}
