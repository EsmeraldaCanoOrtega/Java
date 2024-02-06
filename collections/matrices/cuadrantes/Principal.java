package cuadrantes;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int[][] m1={ {2, 1, 2, 4},
                {1, 4, 3, 2},
                {4, 3, 4, 1},
                {1, 1, 3, 2} };
        int[][] m2={ {1, 2, 4, 4},
                {2, 2, 1, 1},
                {2, 3, 2, 1},
                {2, 3, 1, 3} };
        crearCuadrantes(m1);
        crearCuadrantes(m2);

    }
    public static void crearCuadrantes (int[][] m1){

        Matriz cuadrado1=new Matriz(m1);
        ArrayList<Cuadrante> cuadrantes = new ArrayList();
        cuadrantes.add(0,new Cuadrante(m1));
        cuadrantes.add(1,new Cuadrante(m1));
        cuadrantes.add(2,new Cuadrante(m1));
        cuadrantes.add(3,new Cuadrante(m1));
        for (int i = 0; i < cuadrantes.size() ; i++) {
            cuadrantes.get(i).ilustrar(i+1);
        }
    }
}
