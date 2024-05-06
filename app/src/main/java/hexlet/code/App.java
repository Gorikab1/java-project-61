package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please choose the game and press Enter\n 1 - Even;\n 0 - Exit");
        int gameNumber = game.nextInt();
        switch (gameNumber) {
            case 1:
                Even.run();
                System.out.println("Congratulations!");
            case 0:
                System.out.println("Goodbye!");
                break;
        }

    }

}
