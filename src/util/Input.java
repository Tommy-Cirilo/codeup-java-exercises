package util;

import java.util.Scanner;

/*Create an input validation class

Create a package inside of src named util. Inside of util, create a class named Input that has a private
property named scanner. When an instance of this object is created, the scanner property should be set to a new
instance of the Scanner class. The class should have the following methods, all of which return command line
input from the user:

String getString()
boolean yesNo()
int getInt(int min, int max)
int getInt()
double getDouble(double min, double max)
double getDouble()
The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

The getInt(int min, int max) method should keep prompting the user for input until they give an integer within
the min and max. The getDouble method should do the same thing, but with decimal numbers.

Create another class named InputTest that has a static main method that uses all the methods from the Input class.

*/

public class Input {

    //making a final private scanner
    final private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void clear() {
        this.scanner.nextLine();
    }

    //this method gets the input string
    public String getString() {
        System.out.println("Input string...");
        return this.scanner.nextLine();
    }

    //this switch statement helps the boolean yes or no continue or not based off of user input
    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = getString();
        input = input.toLowerCase();
        switch (input) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("nope"):
                return false;
            case ("denied"):
                return false;
            case ("uh uh"):
                return false;
            case ("yes"):
                return true;
            case ("y"):
                return true;
            case ("yep"):
                return true;
            case ("sure"):
                return true;
            case ("si"):
                return true;
            case ("uh huh"):
                return true;
            case ("approved"):
                return true;
            case ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                return yesNo();
        }
    }

    //this method gets an int range for the user input
    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    //this method gets the user input int
    public int getInt() {
        System.out.println("Input number...");
        return this.scanner.nextInt();
    }

    //this method gets the input double
    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }
    //this method retrieves the input double int
    public double getDouble() {
        System.out.println("Input number...");
        return this.scanner.nextDouble();
    }
}