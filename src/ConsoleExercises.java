import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("\n\n The value of pi is %.2f", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Choose your number");
        String userNumber = scanner.next();
        System.out.printf("\n\nyour chosen number is: %s" , userNumber);



        System.out.println("\n Three words, Go!");



    }
}
