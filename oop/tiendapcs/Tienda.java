package tiendapcs;

public class Tienda {
    private String nombre;
    private String encargado;
    private Ordenador[] ordenadores;
    private int nOrdenadores = 0;

    public Tienda(String nombre, String encargado, int nOrdenadores) {
        this.nombre = nombre;
        this.encargado = encargado;
        ordenadores = new Ordenador[nOrdenadores];
    }

    public void imprimirStock() {
        for (int i = 0; i < ordenadores.length; i++) {
            System.out.println(ordenadores[i]);
        }
        System.out.println();
    }

    public String add(String marca, int ram, String proce, String os, double precio) {
        String result;
        if (nOrdenadores < ordenadores.length) {
            ordenadores[nOrdenadores] = new Ordenador(marca, ram, proce, os, precio);
            nOrdenadores++;
            result = "añadido";
        } else {
            result = "no añadido";
        }
        return result;

    }

    public void eliminar(String marca) {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] != null && ordenadores[i].getMarca().equalsIgnoreCase(marca)) {
                ordenadores[i] = null;
                nOrdenadores--;
            }
        }
        Ordenador swap;
        for (int i = 0; i < ordenadores.length - 1; i++) {
            if (ordenadores[i] == null) {
                swap = ordenadores[i + 1];
                ordenadores[i + 1] = null;
                ordenadores[i] = swap;
                if (ordenadores[i] == null && ordenadores[i+1] == null){
                    break;
                }
                i = 0;
            }
        }
    }

    public int getnOrdenadores() {
        return nOrdenadores;
    }
}
