package loops;

public class Loops {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 0, 5, 0, 2, 0, 9};
        int contador;

        // 1. While loop with early reading
        System.out.println("While loop with early reading:");
        contador = 0;
        int i = 0;
        while (numbers[i] != 0 && i < numbers.length) {
            System.out.println(numbers[i]);
            contador++;
            i++;
        }
        System.out.println("Number of attempts: " + contador);

        // 2. While loop with boolean flag
        System.out.println("\nWhile loop with boolean flag:");
        contador = 0;
        boolean seguir = true;
        i = 0;
        while (seguir && i < numbers.length) {
            if (numbers[i] != 0) {
                System.out.println(numbers[i]);
                contador++;
                i++;
            } else {
                seguir = false;
            }
        }
        System.out.println("Number of attempts: " + contador);
        

        // 3. For loop
        System.out.println("\nFor loop:");
        contador = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println(numbers[i]);
                contador++;
            }
        }
        System.out.println("Number of attempts: " + contador);

        // 4. Infinite loop with break
        System.out.println("\nInfinite loop with break:");
        contador = 0;
        for (i = 0; ; i++) {
            if (numbers[i] == 0) {
                break;
            } else {
                System.out.println(numbers[i]);
                contador++;
            }
        }
        System.out.println("Number of attempts: " + contador);

        // 5. Do-While loop
        System.out.println("\nDo-While loop:");
        contador = 0;
        i = 0;
        do {
            if (numbers[i] != 0) {
                System.out.println(numbers[i]);
                contador++;
            }
            i++;
        } while (i < numbers.length && numbers[i - 1] != 0);
        System.out.println("Number of attempts: " + contador);
    }
}
