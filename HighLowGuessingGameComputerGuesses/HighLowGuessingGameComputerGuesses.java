import java.util.Scanner;

public class HighLowGuessingGameComputerGuesses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guesses = 0;
        int guess = 0;

        System.out.println(
            "Think of a number between 1 and 100, and I'll try to guess it."
        );

        while (low <= high) {
            guess = (low + high) / 2;
            guesses++;

            System.out.println("My guess is: " + guess);
            System.out.print("Is it correct? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (response.equals("no")) {
                System.out.print(
                    "Is your number higher or lower than " +
                    guess +
                    "? (higher/lower): "
                );
                response = scanner.next().toLowerCase();

                if (response.equals("higher")) {
                    low = guess + 1;
                } else if (response.equals("lower")) {
                    high = guess - 1;
                }
            } else if (response.equals("yes")){
                System.out.println(
                    "I guessed your number in " + guesses + " tries!"
                );
                break;
            } else {
                System.out.println("Enter yes or no");
            }
        }
        scanner.close();
    }
}
