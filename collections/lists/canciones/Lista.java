package canciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista {
    private String canciones[];
    private String[] listaReproduccion;


    public Lista(int tamanio) {
        canciones = new String[tamanio];
        listaReproduccion = new String[tamanio];
        for (int i = 0; i < canciones.length; i++) {
            canciones[i] = "cancion "+(i+1);
        }

    }

    public void crearListaDeDistribucion() {
        List<String> ejemplo=new ArrayList<>(Arrays.asList(canciones));
        Collections.shuffle(ejemplo);
        for (int i = 0; i < canciones.length; i++) {
            listaReproduccion[i]= ejemplo.get(i);
        }
    }

    public void visualizarLista() {
        System.out.println("La lista original de canciones");
        for (int i = 0; i < canciones.length; i++) {
            System.out.println(canciones[i]);
        }
        System.out.println("La lista de distribucion generada es");
        for (int i = 0; i < listaReproduccion.length ; i++) {
            System.out.println(listaReproduccion[i]);

        }
    }
}
