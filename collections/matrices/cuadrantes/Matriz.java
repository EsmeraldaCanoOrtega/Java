package cuadrantes;

public class Matriz {
    private int[][] granCuadrado;

    public Matriz (int[][] matriz){
        granCuadrado = matriz;
        ilustrarCuadrado();
    }
    public void ilustrarCuadrado (){
        System.out.println("Creada tabla");
        for (int i = 0; i < granCuadrado.length; i++) {
            System.out.println();
            for (int j = 0; j < granCuadrado.length; j++) {
                System.out.print(granCuadrado[i][j]+" ");
            }
        }
        System.out.println();
    }
}
