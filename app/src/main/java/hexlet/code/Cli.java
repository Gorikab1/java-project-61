package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void scan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n1- Greet\n0- Exit  ");
        String GameNumber = scanner.next();
        System.out.print("Welcome to the Brain Games!\nWhat is your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
