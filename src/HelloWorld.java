public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 27;
        System.out.println(myFavoriteNumber);
        System.out.println("Hello, World");

        final String myString = "Ditto";
        System.out.println(myString);

        float myNumber = 314;
        System.out.println(myNumber);

       /* int x = 5;
        System.out.println(x++);
        System.out.println(x);*/

        int x = 5;
        System.out.println(++x);
        System.out.println(x);


        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;


        //old way
        /*int x = 4;
        x = x + 5;*/



        //old way
        /*int x = 3;
        int y = 4;
        y = y * x;*/



        /*
        * int x = 10;
int y = 2;
x = x / y;
y = y - x;*/

    }
}