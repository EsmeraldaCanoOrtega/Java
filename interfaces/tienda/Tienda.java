package tienda;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Componente> componentes = new ArrayList();
    private String encargado;

    /*************************************************************************/
    /*************************************************************************/

    public Tienda(String encargado) {
        Componente c = new Componente(1,"raton",3,40,"12/05/2017","Logitech");
        componentes.add(c);
        this.encargado = encargado;
    }

    /*************************************************************************/

    public boolean borrarComponente( int idUser) {

    boolean encontrado = false;

        for (int i = 0; i < componentes.size(); i++) {

            if (componentes.get(i).getId() == idUser) {
                componentes.remove(i);
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    /*************************************************************************/
    public Componente buscarComp (int id){
        Componente c1 =null;
        for (int i = 0; i < componentes.size(); i++) {

            if (componentes.get(i).getId() == id) {
                c1=componentes.get(i);
            }
        }
        return c1;
    }
    /*************************************************************************/

    public boolean annadirComponente(int idUser,Componente c){
        boolean encontrado = false;

        for (int i = 0; i < componentes.size(); i++) {

            if (componentes.get(i).getId() == idUser) {
                encontrado = true;
                break;
            } else if (componentes.size()-1==i) {
                if (c.comprobar().equalsIgnoreCase("DiscoDuro")){
                    ((DiscoDuro)c).calcularPrecioSSD(c);
                    componentes.add(c);
                }else {
                    componentes.add(c);
                }

            }
        }
        return encontrado;
    }

    /*************************************************************************/
    public void precioComponente(double precio){
        for (int i = 0; i < componentes.size(); i++) {

            if (componentes.get(i).getPrecioBase() <= precio) {
                componentes.get(i).ver(componentes.get(i));
            }
        }
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

}