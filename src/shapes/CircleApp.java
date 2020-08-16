package shapes;

import util.Input;

//prompts the user for the radius of the circle using your Input class, creates a Circle object, and
// displays the circumference and area. (Note that you will need to import your Input class.)

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        Circle fred = new Circle(in.getDouble());
        System.out.println(fred.getArea());
        System.out.println(fred.getRadius());
        fred.setRadius(8.64);
        System.out.println(fred.getCircumference());
        System.out.println(fred.getRadius());
    }
}