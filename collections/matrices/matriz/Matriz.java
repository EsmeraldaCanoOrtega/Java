package matriz;

import java.util.Scanner;

public class Matriz {
    private int[][] cajita = {{7,1,2},{2,5,5},{0,4,3}};
    private int suma = 0;

    public Matriz() {
        Scanner sc = new Scanner(System.in);
        /*for (int i = 0; i < cajita.length; i++) {
            System.out.println("Introduce la columna nº " + (i + 1));
            for (int j = 0; j < cajita.length; j++) {
                System.out.println("Introduce la posición nº " + (j + 1));
                //cajita[i][j]= sc.nextInt();
                cajita[i][j] = j + 1;
            }
        }*/

    }
    public void ilustrarMatriz(){
        for (int i = 0; i < cajita.length; i++) {
            System.out.println();
            for (int j = 0; j < cajita.length; j++) {
                System.out.print("| " + cajita[j][i] + " |");
            }
        }
    }
    public void ilustrarSuma(){
        ilustrarMatriz();
        System.out.println("\n");
        for (int i = 0, j = 0; i < cajita.length; i++, j++) {
            suma = cajita[i][j] + suma;
            System.out.print("| " + cajita[j][i] + " |");

        }
        System.out.println("\n La suma de la diogonal ha sido: "+suma);
    }
}
