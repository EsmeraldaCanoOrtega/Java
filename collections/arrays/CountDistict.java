package collections.arrays;

import java.util.Scanner;

public class CountDistict {

    public static void main(String[] args) {
        int vector[] = new int[10];
        int counter;   // counts the number of occurrences found

        readVector(vector);
        counter = analyzeVector(vector);

        System.out.println("Found " + counter + " different numbers");

    }// main()

    /*************************************************************/

    private static void readVector(int v[]) {
        // method that reads numbers from the console

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= v.length - 1; i++) {
            System.out.print("Enter the " + (i + 1) + "th number: ");
            v[i] = sc.nextInt();
        }
    }//readVector()

    /*************************************************************/

    private static int analyzeVector(int v[]) {
        // method that traverses the original vector and "marks" the duplicates
        final int marked = -1;
        int counter = 0, currentValue;

        for (int i = 0; i <= v.length - 1; i++) {
            if (v[i] != marked) {
                counter++;
                currentValue = v[i];
                for (int j = i + 1; j <= v.length - 1; j++)
                    if (v[j] == v[i])
                        v[j] = marked;
            }
        }
        return counter;
    }//analyzeVector

} // class Debug
