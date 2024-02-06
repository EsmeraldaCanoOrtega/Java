package conditionals;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, num = 3, largest = Integer.MIN_VALUE;

        System.out.println("(Enter a number \"0\" to exit:)");
        System.out.println("Enter a number:");

        for (int i = 0; i < 5; i++) {

            num = input.nextInt();
            count++;

            if (num > largest) {
                largest = num;
            }

            else if (num == 0) {
                count--; // Decrement count if the number entered is 0
                break;   // Exit loop if the number entered is 0
            }
            System.out.println("Enter a number:");
        }

        System.out.println("The largest number entered is: " + (num == 0 ? largest : largest));
        System.out.println("Number of inputs received: " + count);

        input.close(); // Close scanner to prevent resource leak
    }
}
