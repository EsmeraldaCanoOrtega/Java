package cuadrantes;

public class Cuadrante {
    private int[][] smallCuadrado = new int[2][2];
    private static int i = 0;
    private static int j = 0;

    public Cuadrante(int[][] matriz) {
        if (i == (smallCuadrado.length / 2) && (j > (smallCuadrado.length / 2))){
            j=0;
            i=0;
        }
        if (j == (matriz.length / 2)) {
            j = 0;
            i++;
        }

        int k = i * smallCuadrado.length;
        int l = j * smallCuadrado.length;
        for (int i = 0; i < smallCuadrado.length; i++) {
            for (int j = 0; j < smallCuadrado.length; j++) {
                smallCuadrado[i][j] = matriz[k + i][l + j];
            }
        }
        j++;

        /*if (i== (matriz.length/2)){
            i=0;
            j++;
        }
        int k = i* smallCuadrado.length;
        int l = j* smallCuadrado.length;
        for (int i = 0; i < smallCuadrado.length; i++) {
            for (int j = 0; j < smallCuadrado.length; j++) {
                smallCuadrado[i][j]=matriz[k+i][l+j];
            }
        }
        i++;
        ilustrar();*/
    }

    public void ilustrar(int num) {
        System.out.println("Creada cuadrante numº:" + num);
        for (int i = 0; i < smallCuadrado.length; i++) {
            System.out.println();
            for (int j = 0; j < smallCuadrado.length; j++) {
                System.out.print(smallCuadrado[i][j] + " ");
            }
        }
        System.out.println();
    }
}
