package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String[][] rounds){
        Scanner scanner = new Scanner(System.in);
        for (String[] round : rounds){
            System.out.println("Question: " + round[0]);
            String answer = scanner.next();
            if (answer.equals(round[1])) {
                System.out.println("You are right");
            } else {
                System.out.println("Absolutely not");
                break;
            }
        }
    }
}
