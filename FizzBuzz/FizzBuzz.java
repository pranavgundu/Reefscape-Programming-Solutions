public class FizzBuzz {

    public static void main(String[] args) {
        for (int num = 0; num <= 100; num++) { // cycling through all the numers
            if (num % 3 == 0 && num % 5 == 0) { // divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) { // divisible by 5
                System.out.println("Buzz");
            } else if (num % 3 == 0) { // divisible by 3
                System.out.println("Fizz");
            } else {
                String numStr = String.valueOf(num);
                if (numStr.contains("3")) { // contains 3
                    numStr = numStr.replace("3", "Fizz"); // replace the 3 with fizz
                }
                System.out.println(numStr); // the new string
            }
        }
    }
}
