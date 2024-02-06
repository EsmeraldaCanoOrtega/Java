import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        int n, previous = -9999, sum = 0;
        boolean ordered = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, 0 to finish");
        n = input.nextInt();
        while (n != 0) {
            sum += n;
            if (previous < n) {
                ordered = true;
            } else {
                ordered = false;
            }
            previous = n;
            System.out.println("Enter a number, 0 to finish");
            n = input.nextInt();
        }
        if (ordered) {
            System.out.println("The series is ordered");
        } else {
            System.out.println("The series is not ordered");
        }
        System.out.println("The sum is: " + sum);

        input.close();
    }
}
