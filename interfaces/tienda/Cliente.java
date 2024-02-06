package tienda;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Cliente {

    private String nif;
    private int uds;
    private Componente comp[] = new Componente[1];

    /*********************************************************************/
    /*********************************************************************/

    public Cliente(String nombre) {
        this.nif = nombre;
    }

    /*********************************************************************/

    public void annadirPedido(Componente c) {

        boolean salir = false;

        for (int i = 0; i < comp.length && salir == false; i++) {

            if (comp[i] == null) {

                comp[i] = c;
                salir = true;

            }

        }

    }

    /*********************************************************************/

    public void factura(int numstock,int numAlea,int id) {

        double suma = 0;

        FileWriter fwFactura = null;

        try {

            fwFactura = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/"+id+numAlea+".txt");

            PrintWriter pwFactura = new PrintWriter(fwFactura);


            for (int i = 0; i < comp.length; i++) {
                pwFactura.println("-----------------------------------------------");
                pwFactura.println("----------------FACTURA------------------------");
                pwFactura.println("CIF: \t\t"+nif);
                pwFactura.println("[" + (comp[i]).getClass().getSimpleName() + "]\t\tNombre: " + (comp[i]).getNombre());
                pwFactura.println("Precio base:  " + (comp[i]).getPrecioBase());
                pwFactura.println("Cantidad: "+numstock);
                pwFactura.println("Precio total: " + ((comp[i]).getPrecioBase() +((comp[i]).getPrecioBase()*comp[i].getIva()))*2);
                pwFactura.println("-----------------------------------------------");

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fwFactura != null)
                    fwFactura.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }//finally

    }

    /*********************************************************************/

    public String getNombre() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nif = nombre;
    }

    public Componente[] getComp() {
        return comp;
    }

    public void setComp(Componente[] comp) {
        this.comp = comp;
    }

}