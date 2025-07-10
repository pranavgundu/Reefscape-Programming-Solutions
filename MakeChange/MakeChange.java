import java.util.ArrayList;
import java.util.Scanner;
public class MakeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> prices = new ArrayList<>(); // list of prices
        double total = 0.0; // total price after all the itmes
        System.out.println("Enter the price of items or 'd' when done:");
        while (true) { // until someone enters d
            System.out.print("Price: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("d")) { // if you enter d
                break;
            } else {
                try {
                    double price = Double.parseDouble(input); // turn into double
                    prices.add(price); // ad the price to the list of all prices
                    total += price; // total price
                } catch (NumberFormatException e) { // invalid
                    System.out.println(
                        "Invalid input. Please enter a number or 'd'."
                    );
                }
            }
        }
        System.out.print("How much money was given: ");
        double moneyGiven = scanner.nextDouble(); // total money given
        double change = moneyGiven - total;
        System.out.println((int) Math.round(change * 100)/100);
        giveChange(change);
    }
    public static void giveChange(double change) {
        int[] denominations = {
            10000,
            5000,
            2000,
            1000,
            500,
            100,
            25,
            10,
            5,
            1,
        }; // list of all denominations
        String[] namesSingular = {
            "$100 bill",
            "$50 bill",
            "$20 bill",
            "$10 bill",
            "$5 bill",
            "$1 bill",
            "quarter",
            "dime",
            "nickel",
            "penny",
        };
        String[] namesPlural = {
            "$100 bills",
            "$50 bills",
            "$20 bills",
            "$10 bills",
            "$5 bills",
            "$1 bills",
            "quarters",
            "dimes",
            "nickels",
            "pennies",
        };
        int remainingChange = (int) Math.round(change * 100); // cents
        for (int i = 0; i < denominations.length; i++) { // go through all prices
            int count = remainingChange / denominations[i];
            remainingChange %= denominations[i];
            if (count > 0) {
                if (count == 1) {
                    System.out.println(count + " " + namesSingular[i]);
                } else {
                    System.out.println(count + " " + namesPlural[i]);
                }
            }
        }
    }
}
