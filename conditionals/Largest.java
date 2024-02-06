package conditionals;

public class Largest {
    public static void main(String[] args) {
        int num1 = 24, num2 = 11, num3 = 6;
        int largest = max(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }

    public static int max(int num1, int num2, int num3) {
        int largest;
        if (num1 > num2 && num1 > num3)
            largest = num1;
        else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else
            largest = num3;
        return largest;
    }
}
