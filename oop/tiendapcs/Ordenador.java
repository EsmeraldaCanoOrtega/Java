package tiendapcs;

public class Ordenador {//implements Comparable<Ordenador>
    //implements Comparable<Ordenador>
    private final String marca;
    private int ram;
    private String procesador;
    private String SO;
    private double precio;

    public Ordenador(String marca, int ram, String procesador, String so, double precio) {
        this.marca = marca;
        this.ram = ram;
        this.procesador = procesador;
        SO = so;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }


    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", procesador='" + procesador + '\'' +
                ", SO='" + SO + '\'' +
                ", precio=" + precio +
                '}';
    }

/*public int compareTo(Ordenador o) {
//         if (o1 == null && o2 == null) {
//                return 0;
//            }
//            if (o1 == null) {
//                return 1;
//            }
//            if (o2 == null) {
//                return -1;
//            }
//            return o1.compareTo(o2);
    }*/
}
