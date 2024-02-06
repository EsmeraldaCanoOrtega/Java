package metro;

import java.util.Scanner;

public class Principal {
    private Linea[] lineas = new Linea[3];
    public Principal(){
    lineas[0]=new Linea(1,"azul",5);
    lineas[1]=new Linea(6,"gris",4);
    lineas[2]=new Linea(9,"morado",4);
    }

    public Linea[] getLineas() {
        return lineas;
    }

    public static void main(String[] args) {
    Principal practica = new Principal();
    instanciarEstaciones(practica);
    userGetLinea(practica);

    }
    public static void instanciarEstaciones(Principal p1){
        Estacion pacifico = new Estacion("Pacifico",false,true);
        p1.getLineas()[0].asignarEstacion(new Estacion("Menéndez Pelayo",false,false));
        p1.getLineas()[0].asignarEstacion(pacifico);
        p1.getLineas()[0].asignarEstacion(new Estacion("Puente de Vallecas",false,false));
        p1.getLineas()[0].asignarEstacion(new Estacion("Nueva Numancia",false,false));
        p1.getLineas()[0].asignarEstacion(new Estacion("Portazgo",false,true));

        Estacion sainzBaranda = new Estacion("Sáinz de Baranda",false,true);
        p1.getLineas()[2].asignarEstacion(sainzBaranda);
        p1.getLineas()[2].asignarEstacion(new Estacion("Estella",false,false));
        p1.getLineas()[2].asignarEstacion(new Estacion("Vinateros",false,false));
        p1.getLineas()[2].asignarEstacion(new Estacion("Artilleros",false,false));

        p1.getLineas()[1].asignarEstacion(new Estacion("Mendez Álvaro",false,false));
        p1.getLineas()[1].asignarEstacion(pacifico);
        p1.getLineas()[1].asignarEstacion(new Estacion("Conde de Casal",true,true));
        p1.getLineas()[1].asignarEstacion(sainzBaranda);
        for (int i = 0; i < p1.getLineas().length; i++) {
            for (Estacion estaciones :p1.getLineas()[i].getEstaciones()) {
                estaciones.getLineasMetro().add(p1.getLineas()[i].getNum());
            }
        }

    }
    public static void userGetLinea (Principal p1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Existen en la base de datos: ");
        for (int i = 0; i < p1.getLineas().length ; i++) {
            System.out.print(p1.lineas[i].getNum()+", ");
        }
        System.out.println("\nCual línea desea elegir: ");
        int user= sc.nextInt();
        for (int i = 0; i < p1.getLineas().length ; i++) {
            if (p1.lineas[i].getNum()==user){
                p1.getLineas()[i].ilustrarEstaciones();
            }
        }
    }
}
