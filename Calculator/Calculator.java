import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        if (!scanner.hasNextDouble()) { // check that the answer is a double
            System.out.println("Error: Please enter a valid number."); // error
            scanner.next();
            return; // Exit the program
        }
        double num1 = scanner.nextDouble(); // set first num1 to the double enter

        System.out.print("Enter your second number: ");
        if (!scanner.hasNextDouble()) { // check that answer is a double
            System.out.println("Error: Please enter a valid number.");
            scanner.next();
            return; // Exit the program
        }
        double num2 = scanner.nextDouble(); // set second num2 to the double entered

        System.out.print("Enter an operation (+, -, *, /, ^): ");
        String operation = scanner.next(); // operation

        double result = 0;

        switch (operation) { // basically elifs but is a more efficient version
            case "+": // if addition
                result = num1 + num2;
                break;
            case "-": // if subtraction
                result = num1 - num2;
                break;
            case "*": // if multiplication
                result = num1 * num2;
                break;
            case "/": // if division
                if (num2 == 0) { // check for dividing by 0
                    System.out.println(
                        "Error: Division by zero is not allowed."
                    );
                
                } else {
                    result = num1 / num2;
                }
                break;
            case "^":
                result = Math.pow(num1, num2); // exponent
                break;
            default: // if it doesn't fit into any of the cases
                System.out.println(
                    "Error: Invalid operation. Please enter one of +, -, *, /, ^."
                );
                break;

        }
        System.out.println(result);
        scanner.close(); // close the scanner
    }
}
