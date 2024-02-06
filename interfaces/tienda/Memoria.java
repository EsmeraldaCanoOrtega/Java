package tienda;

public class Memoria extends Componente {

    private int tamaGB;
    private int velocidad;
    /*************************************************************************/
    /*************************************************************************/

    public Memoria(int id, String nombre, int stock, double precioBase, String fchfab, String fabricante, int tamaGB, int velocidad) {
        super(id, nombre, stock, precioBase, fchfab, fabricante);
        this.tamaGB = tamaGB;
        this.velocidad = velocidad;
    }

    /*************************************************************************/

    public void ver(Componente c) {

        System.out.println("[" + c.getClass().getSimpleName() + "]\nId: " + c.getId() + "\nNombre: " + c.getNombre() + "\nPrecio base: " + c.getPrecioBase() + "\nPrecio final: " + (c.getPrecioBase()+(getPrecioBase()*getIva()))
                +"\nStock: "+c.getStock()+"\nFecha: "+c.getFchfab()+"\nFabricante: "+getFabricante()+"\nTamaño(GB): "+tamaGB+"\nVelocidad(Mhz): "+velocidad);
        System.out.println("");

    }

    /*************************************************************************/

    public int getTamaGB() {
        return tamaGB;
    }

    public int getVelocidad() {
        return velocidad;
    }
}