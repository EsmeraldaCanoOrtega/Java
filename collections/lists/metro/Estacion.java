package metro;

import java.util.ArrayList;

public class Estacion {
    private String nombre;
    private boolean busInter=false;
    private boolean minusvalidos=false;
    ArrayList<Integer> lineasMetro = new ArrayList<>();

    public Estacion(String nombre, boolean busInter, boolean minusvalidos) {
        this.nombre = nombre;
        this.busInter = busInter;
        this.minusvalidos = minusvalidos;
    }

    public ArrayList<Integer> getLineasMetro() {
        return lineasMetro;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isBusInter() {
        return busInter;
    }

    public boolean isMinusvalidos() {
        return minusvalidos;
    }
}
