package tienda;

public class DiscoDuro extends Componente {

    private int capacidadDisco;
    private Generic tipo;

    /*************************************************************************/
    /*************************************************************************/

    public DiscoDuro(int id, String nombre, int stock, double precioBase, String fchfab, String fabricante, int capacidadDisco, Generic tipo) {
        super(id, nombre, stock, precioBase, fchfab, fabricante);
        this.capacidadDisco = capacidadDisco;
        this.tipo = tipo;
    }

    /*************************************************************************/
    public void calcularPrecioSSD(Componente c){
        c.setPrecioBase(tipo==Generic.SDD? getPrecioBase()*1.10:c.getPrecioBase()+0);
    }
    /*************************************************************************/
    public void ver(Componente c) {

        System.out.println("[" + c.getClass().getSimpleName() + "]\nId: " + c.getId() + "\nNombre: " + c.getNombre() + "\nPrecio base: " + c.getPrecioBase() + "\nPrecio final: " + (c.getPrecioBase()+(getPrecioBase()*getIva()))
                +"\nStock: "+c.getStock()+"\nFecha: "+c.getFchfab()+"\nFabricante: "+getFabricante()+"\nTamaño(GB): "+capacidadDisco+"\nTipo(GB): "+tipo);
        System.out.println("");

    }

    /*************************************************************************/
    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public Generic getTipo() {
        return tipo;
    }
}