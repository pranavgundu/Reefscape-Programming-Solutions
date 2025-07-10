import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HighLowGuessingGameHumanGuesses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // random number generator

        int number = random.nextInt(99) + 1; // guess number
        int guesses = 0; // number of guesses
        int guess = 0; // guess

        System.out.println(
            "I'm thinking of a number between 1 and 100. Can you guess it?"
        );

        while (guess != number) { // until the gues is correct
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            guesses++; // new guess

            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            }
        }

        System.out.println(
            "Congratulations! You guessed the number " +
            number +
            " in " +
            guesses +
            " tries."
        );
        scanner.close();
    }
}
