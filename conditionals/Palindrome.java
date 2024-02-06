package conditionals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, quotient, iteration;
        int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0, digit6 = 0;
        boolean palindrome;

        try {
            System.out.print("Enter the number: ");
            number = input.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                return;
            }

            quotient = number;
            iteration = 6;

            while (quotient >= 1) {
                switch (iteration) {
                    case 1:
                        digit1 = quotient % 10;
                        break;
                    case 2:
                        digit2 = quotient % 10;
                        break;
                    case 3:
                        digit3 = quotient % 10;
                        break;
                    case 4:
                        digit4 = quotient % 10;
                        break;
                    case 5:
                        digit5 = quotient % 10;
                        break;
                    case 6:
                        digit6 = quotient % 10;
                        break;
                }
                iteration--;
                quotient = Math.round(quotient / 10);
            }

            palindrome = (digit6 == digit1) && (digit5 == digit2) && (digit4 == digit3);

            System.out.println(palindrome ? "The number " + number + " is a palindrome" : "The number " + number + " is not a palindrome");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
}
