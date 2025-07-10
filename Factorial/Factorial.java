import java.math.BigInteger; // handles very large numbers

public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // loop through numbers from 1 to 100
            System.out.println(i + "! = " + factorial(i)); // print the factorial of each number
        }
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE; // initialize result as BigInteger with value 1
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // use valueOf to convert i to BigInteger
        }
        return result; // return the computed factorial
    }
}
