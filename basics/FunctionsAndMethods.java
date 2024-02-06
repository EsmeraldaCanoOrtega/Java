package basics;

public class FunctionsAndMethods {
    public static void main(String[] args) {
        int sum, product;

        sum = sumNumbers(10, 5);
        product = multiplyNumbers(10, 5);

        System.out.println("The sum is " + sum + " and the product is " + product);
        System.out.println("The difference is " + subtractNumbers(10, 5));
    }

    // Method to sum two numbers
    private static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two numbers
    private static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    // Function to subtract two numbers
    private static float subtractNumbers(int num1, int num2) {
        float result;
        result = num1 - num2;
        return result;
    }
}
