package hexlet.code;

import java.util.Random;

public class Even {
    public static void run() {
        System.out.println("Welcome to the Brain Games!");
        Cli.acquaintance();
        System.out.println("You choose game 'Even'.\n Answer 'yes' if the number is even, otherwise answer 'no'");
        var questions = new String[3][];
        for (int i = 0; i < 3; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions);
    }

    public static String[] generateRound() {
        var number = new Random().nextInt(1, 20);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
