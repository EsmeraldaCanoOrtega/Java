package Baloncesto;

import java.util.*;

public class Equipo {
    private static String[] equipos = {"Real Madrid", "Barcelona", "Baskonia",
            "Lenovo Tenerife", "Joventut", "Gran Canaria",
            "Unicaja", "Valencia Basket Club"};
    private static String[] pruebas= new String[7];
    private static int[] pruebasnum = new int[pruebas.length];
    private static int[] puntuaciones = new int[equipos.length];

    public void ilustrarMapa() {
        generarPartida();

        System.out.println(" ____________                                                                          ____________");
        System.out.println("|            |                                                                        |            |");
        System.out.println("| " + equiposEspaciado(0) + " |  _______                                                      _______  | " + equiposEspaciado(4) + " |");
        System.out.println("|     "+getNumber(0)+"     |         |                                                    |         |     "+getNumber(4)+"     |");
        System.out.println("|____________|         |                                                    |         |____________|");
        System.out.println(" ____________      "+pruebas[0].substring(0,3).toUpperCase()+" |  _______                                  _______  | "+pruebas[2].substring(0,3).toUpperCase()+"      ____________ ");
        System.out.println("|            |      "+pruebasnum[0]+" |         |                                |         | "+pruebasnum[2]+"      |            |");
        System.out.println("| " +equiposEspaciado(1) + " |  _______|         |               \uD83C\uDFC6               |         |_______  | " + equiposEspaciado(5) + " |");
        System.out.println("|     "+getNumber(1)+"     |                   |          ____________          |                   |     "+getNumber(5)+"     |");
        System.out.println("|____________|                   |         |            |         |                   |____________|");
        System.out.println(" ____________                "+pruebas[4]+" | _______ |   !"+pruebas[6]+"!    | _______ | "+pruebas[5]+"                ____________");
        System.out.println("|            |                "+pruebasnum[4]+" |         |____________|         | "+pruebasnum[5]+"                |            |");
        System.out.println("| " + equiposEspaciado(2) + " |  _______          |                                |          _______  | " + equiposEspaciado(6) + " |");
        System.out.println("|     "+getNumber(2)+"     |         |         |                                |         |         |     "+getNumber(6)+"     |");
        System.out.println("|____________|     "+pruebas[1].substring(0,3).toUpperCase()+" |  _______|                                |_______  | "+pruebas[3].substring(0,3).toUpperCase()+"     |____________|");
        System.out.println(" ____________       "+pruebasnum[1]+" |                                                    | "+pruebasnum[3]+"       ____________ ");
        System.out.println("|            |         |                                                    |         |            |");
        System.out.println("| " + equiposEspaciado(3) + " |  _______|                                                    |_______  | " + equiposEspaciado(7) + " |");
        System.out.println("|     "+getNumber(3)+"     |                                                                        |     "+getNumber(7)+"     |");
        System.out.println("|____________|                                                                        |____________|");
    }

    public String equiposEspaciado(int num) {
        StringBuilder equipo = new StringBuilder(equipos[num]);
        if (equipos[num].length() < 10) {
            for (int j = equipos[num].length(); j < 10; j++) {
                equipo.append(" ");
            }
        }else {
            equipo = new StringBuilder(equipos[num].substring(0,10));
        }
        return equipo.toString();
    }

    public void generarAletoriedad(){
        List<String> ejemplo=new ArrayList<>(Arrays.asList(equipos));
        Collections.shuffle(ejemplo);
        for (int i = 0; i < equipos.length; i++) {
            equipos[i]= ejemplo.get(i);
        }
    }
    public void generarNumero(){
        Random r = new Random();
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i]= r.nextInt(99)+1;
        }
    }
    public String getNumber(int num){
        String var =String.valueOf(puntuaciones[num]);
        if (var.length()<2){
            var= var+" ";
        }
        return var;
    }
    public String getGanadornombreSemi(int num1, int num2){
        String ganador;
        Random r = new Random();
        if(puntuaciones[num1]>puntuaciones[num2]){
            ganador=equiposEspaciado(num1);
            for (int i = 0; i < pruebas.length ; i++) {
                if (pruebas[i]==null){
                    pruebasnum[i] = r.nextInt(80)+20;
                    pruebas[i]=ganador;
                    break;
                }
            }

        }else {
            ganador=equiposEspaciado(num2);
            for (int i = 0; i < pruebas.length ; i++) {
                if (pruebas[i]==null){
                    pruebasnum[i] = r.nextInt(80)+20;
                    pruebas[i]=ganador;
                    break;
                }
            }
        }
        return ganador.substring(0,3).toUpperCase();
    }
    public String getGanadornombreFinal(int num1, int num2){
        String ganador;
        Random r = new Random();
        if(pruebasnum[num1]>pruebasnum[num2]){
            ganador=pruebas[num1].substring(0,3).toUpperCase();
            for (int i = 0; i < pruebas.length ; i++) {
                if (pruebas[i]==null){
                    pruebasnum[i] = r.nextInt(80)+20;
                    pruebas[i]=ganador;
                    break;
                }
            }

        }else {
            ganador=pruebas[num2].substring(0,3).toUpperCase();
            for (int i = 0; i < pruebas.length ; i++) {
                if (pruebas[i]==null){
                    pruebasnum[i] = r.nextInt(80)+20;
                    pruebas[i]=ganador;
                    break;
                }
            }
        }
        return ganador.substring(0,3).toUpperCase();
    }
    public void generarPartida(){
        generarNumero();
        generarAletoriedad();
        getGanadornombreSemi(0,1);
        getGanadornombreSemi(2,3);
        getGanadornombreSemi(4,5);
        getGanadornombreSemi(6,7);
        getGanadornombreFinal(0,1);
        getGanadornombreFinal(2,3);
        getGanadornombreFinal(4,5);
    }
}
