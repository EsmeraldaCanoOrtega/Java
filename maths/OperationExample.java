package maths;

public class OperationExample {
    public static void main(String[] args) {
        System.out.println("Declaring variables...");
        float x = 2.0F, y = 3.0F;
        int a = 1;

        System.out.println("Calculating values...");
        float b = a / 2f;
        float c = (a + b) * 3;

        System.out.println("Calling the calculation method...");
        float resultado = calculate(x, y, a, b, c);

        System.out.println("Result: " + resultado);
    }

    // Method to perform the calculation
    public static float calculate(float x, float y, int a, float b, float c) {
        return ((3 + (4 * x)) / 5) - (10 * (y - 5) * (a + b + c)) / x + 9 * ((4 / x) + (9 + x) / y);
    }
}
