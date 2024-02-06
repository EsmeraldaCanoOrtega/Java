package conditionals;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        try {
            System.out.print("Enter a positive integer >= 1: ");
            number = input.nextInt();

            if (number < 1) {
                System.out.println("Invalid input. Please enter a positive integer >= 1.");
                return;
            }

            boolean isPrime = isPrimeNumber(number);

            if (isPrime)
                System.out.println("The number " + number + " IS prime");
            else
                System.out.println("The number " + number + " is NOT prime");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            input.close();
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1)
            return false;

        int sqrtNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
