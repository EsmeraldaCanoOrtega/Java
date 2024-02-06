package maths;

public class MathClass {
    /**The Math class doesn't allow you to instantiate it
     * because its constructor is private and its methods are static */
    public static void main(String[] args) {
        float var1 = 0, var2 = 3.0f;
        double var4 = -2.4f, var3 = 4.5f;

        System.out.println("Absolute value of var4: " + (int)Math.abs(var4));
        System.out.println("Rounding var4: " + Math.round(var4));
        System.out.println("Flooring var4: " + Math.floor(var4));
        System.out.println("Square root of var3: " + Math.sqrt(var3));
        System.out.println("var1 raised to the power of var2: " + Math.pow(var1, var2));
        System.out.println("Generating random numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random() * 5) + 1);
        }
    }
}
