package metro;

import java.util.ArrayList;

public class Linea {
    private int num;
    private String color;
    ArrayList<Estacion> estaciones= new ArrayList<>();
    private int numEstaciones;

    public Linea(int num, String color, int numEstaciones) {
        this.num = num;
        this.color = color;
        this.numEstaciones = numEstaciones;
    }
    public void asignarEstacion (Estacion userEstation){
        estaciones.add(userEstation);
    }
    public void ilustrarEstaciones(){
        for (Estacion estacions: estaciones) {
            System.out.println(estacions.getNombre());
            System.out.println(!estacions.isBusInter() ?"\t"+"No tiene bus \uD83D\uDEAB \uD83D\uDE8A":"\t"+"Si tiene bus ✅ \uD83D\uDE8A");
            System.out.println(!estacions.isMinusvalidos() ?"\t"+"No tiene para minusvalidos \uD83D\uDEAB ♿":"\t"+"Si tiene para minusvalidos ✅ ♿");
            System.out.println("\tConectadas con las lineas: ");
            for (int i = 0; i < estacions.lineasMetro.size(); i++) {
                System.out.println("\tConectada con la línea: "+estacions.lineasMetro.get(i));
            }
        }
    }


    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public int getNum() {
        return num;
    }
}
