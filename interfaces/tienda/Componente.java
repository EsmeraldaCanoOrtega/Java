package tienda;

public class Componente {
    private int id;
    private String nombre;
    private int stock;
    private double precioBase = 0;
    private String fchfab;
    private String fabricante;
    private double iva=0.21;

    /*************************************************************************/
    /*************************************************************************/

    public Componente(int id,String nombre, int stock, double precioBase, String fchfab, String fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precioBase = precioBase;
        this.fchfab = fchfab;
        this.fabricante = fabricante;
    }
    /*************************************************************************/
    public void calcularIVA(){
        this.precioBase= precioBase*1.21;
    }
    /*************************************************************************/

    public String comprobar() {

        String coso = "";

        if (this instanceof DiscoDuro) {
            coso = "Disco Duro";

        } else if (this instanceof Memoria) {

            coso = "Memoria";

        }

        return coso;

    }

    /*************************************************************************/

    public  void ver(Componente c){
        System.out.println("[" + getClass().getSimpleName() + "]\nId: " + id + "\nNombre: " + nombre + "\nPrecio base: " + precioBase + "\nPrecio final: " + (precioBase+(precioBase*iva))
                +"\nStock: "+stock+"\nFecha: "+fchfab+"\nFabricante: "+fabricante);
        System.out.println("");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getFchfab() {
        return fchfab;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getIva() {
        return iva;
    }

    /*************************************************************************/


    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

}