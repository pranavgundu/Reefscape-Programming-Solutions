public class MultiplicationTable {

    public static void main(String[] args) {
        int size = 15; // size of the multiplication table (you can change this to make the multiplication table shorter or longer)
        printTable(size);
    }

    public static void printTable(int size) {
        System.out.print("    "); // empty space for alignment (this make the numbers line up)

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.println(
            "       ---------------------------------------------"
        ); // this wont be the same legnth for other sized boards, but im not gonna write more code just for this

        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i); // print the row header
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // print each cell, formatted to 4 spaces
            }
            System.out.println(); // move to the next line after each row (or else you will just print them in one line)
        }
    }
}
