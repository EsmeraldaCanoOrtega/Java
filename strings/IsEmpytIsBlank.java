package strings;

import java.util.Scanner;

public class IsEmpytIsBlank {
    public static void main(String[] args) {
        // Program that reads a word entered by the user and prints its length.
        // This process repeats until an empty string is entered, which signals the end.
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        String word = "";

        while (!exit) {
            System.out.println("Enter a word:");
            word = input.nextLine();
            if (word.isEmpty() || word.isBlank()) {
                exit = true;
            }
            System.out.println(exit ? "Goodbye" : "Length of \"" + word + "\": " +
                    word.length());
        }

        input.close();
    }
}
