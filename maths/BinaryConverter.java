import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        decimalToBinary();
        binaryToDecimal();
    }

    private static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert it to binary: ");
        String input = scanner.nextLine();

        int dividend = Integer.parseInt(input);
        String result = "";
        boolean notDivisible = false;

        while (!notDivisible) {
            result = result.concat(String.valueOf(dividend % 2));
            dividend = dividend / 2;
            if (dividend == 0) {
                notDivisible = true;
            }
        }
        for (int i = result.length() - 1; i > -1; i--) {
            System.out.print(result.charAt(i));
        }
        System.out.println();
    }

    private static void binaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number to convert it to decimal: ");
        String input = scanner.nextLine();
        int result = 0;

        for (int i = input.length() - 1, exponent = 0; i >= 0; i--, exponent++) {
            result += (Integer.parseInt(input.substring(i, i + 1)) * (int) Math.pow(2, exponent));
        }
        System.out.println(result);
    }
}
