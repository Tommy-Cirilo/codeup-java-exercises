import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again = true;
        do {
            System.out.println("Type @ Bob:");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty() ) {
                System.out.println("whatever");
            } else {
                char lastchar = userInput.charAt(userInput.length()-1);
                switch (lastchar) {
                    case '?':
                        System.out.println("sure");
                        break;
                    case '!':
                        System.out.println("whoa chill out");
                        break;
                    default:
                        System.out.println("whatever");
                        break;


                    System.out.print("Dm Bob again? [y/N: ");
                    String response = sc.nextLine();
                    if (!response.trim().equalsIgnoreCase('y')) {
                        again = false;
                    }
                }
            }

        } while(again);


    }
}
