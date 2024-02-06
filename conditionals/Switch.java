package conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, height;

        try {
            System.out.print("Enter the base: ");
            base = input.nextInt();

            System.out.print("Enter the height: ");
            height = input.nextInt();

            if (base <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive values for base and height.");
                return;
            }

            calculateArea(base, height);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            input.close();
        }
    }

    private static void calculateArea(int base, int height) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        boolean exit = true;

        while (exit) {
            System.out.println("**************");
            System.out.println("MAIN MENU");
            System.out.println("**************");
            System.out.println("1. Calculate the area of a square");
            System.out.println("2. Calculate the area of a triangle");
            System.out.println("3. Exit");
            System.out.print("Enter an option: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    result = base * base;
                    System.out.println("The area of the square is: " + result);
                    break;

                case 2:
                    result = base * height / 2;
                    System.out.println("The area of the triangle is: " + result);
                    break;

                case 3:
                    result = 0;
                    System.out.println("Goodbye");
                    exit = false;
                    break;

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }
        }
        input.close();
    }
}
