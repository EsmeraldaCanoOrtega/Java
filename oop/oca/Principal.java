package oca;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Casilla[] casillas = new Casilla[42];
        Casilla[][] casillasChulas = new Casilla[11][8];
        int opcion = 0;
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla(i);
        }
        //casillas[casillas.length-1].setTipo();
        rellenarOcas(casillas);
        rellenarMuertes(casillas);
        moverFicha(casillas);

    }

    public static void rellenarOcas(Casilla[] casillas) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(42);
            //System.out.println("Introduce el numero de una oca");
            casillas[random].setTipo("\uD83E\uDD86");
        }
    }

    public static void mostrarTablero(Casilla[] casillas) {
        System.out.println("               ______ ______ ______               ______ ______ ______ ______");
        System.out.println("              |  " + casillas[6].getPosicion() + "   |  " + casillas[7].getPosicion() + "   |  " + casillas[8].getPosicion() + "   |             |  " + casillas[35].getPosicion() + "  |  " + casillas[36].getPosicion() + "  |  " + casillas[37].getPosicion() + "  |  " + casillas[38].getPosicion() + "  |");
        System.out.println("              |  " + casillas[6].getTipo() + "  |  " + casillas[7].getTipo() + "  |  " + casillas[8].getTipo() + " |             |  " + casillas[35].getTipo() + "  |  " + casillas[36].getTipo() + "  |  " + casillas[37].getTipo() + " |  " + casillas[38].getTipo() + "  | ");
        System.out.println("              |  " + casillas[6].getIconoJugador() + "  |  " + casillas[7].getIconoJugador() + "  |  " + casillas[8].getIconoJugador() + " |             |  " + casillas[35].getIconoJugador() + "  |  " + casillas[36].getIconoJugador() + "  |  " + casillas[37].getIconoJugador() + " |  " + casillas[38].getIconoJugador() + "  | ");
        System.out.println("              |______|______|______|             |______|______|______|______|");
        System.out.println("              |  " + casillas[5].getPosicion() + "   |      |  " + casillas[9].getPosicion() + "  |             |  " + casillas[34].getPosicion() + "  |             |  " + casillas[39].getPosicion() + "  |");
        System.out.println("              |  " + casillas[5].getTipo() + "  |      |  " + casillas[9].getTipo() + " |             |  " + casillas[34].getTipo() + "  |             |  " + casillas[39].getTipo() + "  |");
        System.out.println("              |  " + casillas[5].getIconoJugador() + "  |      |  " + casillas[9].getIconoJugador() + " |             |  " + casillas[34].getIconoJugador() + "  |             |  " + casillas[39].getIconoJugador() + "  |");
        System.out.println("              |______|      |______|______       |______|             |______|");
        System.out.println("              |  " + casillas[4].getPosicion() + "   |      |  " + casillas[10].getPosicion() + "  |  " + casillas[11].getPosicion() + "  |      |  " + casillas[33].getPosicion() + "  |             |  " + casillas[40].getPosicion() + "  |");
        System.out.println("              |  " + casillas[4].getTipo() + "  |      |  " + casillas[10].getTipo() + "  |  " + casillas[11].getTipo() + " |      |  " + casillas[33].getTipo() + "  |             |  " + casillas[40].getTipo() + "  |");
        System.out.println("              |  " + casillas[4].getIconoJugador() + "  |      |  " + casillas[10].getIconoJugador() + "  |  " + casillas[11].getIconoJugador() + " |      |  " + casillas[33].getIconoJugador() + "  |             |  " + casillas[40].getIconoJugador() + "  |");
        System.out.println(" ______ ______|______|      |______|______|      |______|             |______|");
        System.out.println("|  " + casillas[0].getPosicion() + "   |  " + casillas[1].getPosicion() + "   |  " + casillas[2].getPosicion() + "   |             |  " + casillas[12].getPosicion() + "  |      |  " + casillas[32].getPosicion() + "  |             |  " + casillas[41].getPosicion() + "  |");
        System.out.println("|  " + casillas[0].getTipo() + "  |  " + casillas[1].getTipo() + " |  " + casillas[2].getTipo() + "  |             |  " + casillas[12].getTipo() + "  |      |  " + casillas[32].getTipo() + "  |             |  " + casillas[41].getTipo() + "  |");
        System.out.println("|  " + casillas[0].getIconoJugador() + "  |  " + casillas[1].getIconoJugador() + " |  " + casillas[2].getIconoJugador() + "  |             |  " + casillas[12].getIconoJugador() + "  |      |  " + casillas[32].getIconoJugador() + "  |             |  " + casillas[41].getIconoJugador() + "  |");
        System.out.println("|______|______|______|             |______|      |______|       ______|______|");
        System.out.println("                                   |  " + casillas[13].getPosicion() + "  |      |  " + casillas[31].getPosicion() + "  |      |     FIN     |");
        System.out.println("                                   |  " + casillas[13].getTipo() + "  |      |  " + casillas[31].getTipo() + "  |      |     \uD83C\uDFC6     |");
        System.out.println("                                   |  " + casillas[13].getIconoJugador() + "  |      |  " + casillas[31].getIconoJugador() + "  |      |            |");
        System.out.println(" ______ ______ ______ ______ ______|______|      |______|      |_____________|");
        System.out.println("|  " + casillas[19].getPosicion() + "  |  " + casillas[18].getPosicion() + "  |  " + casillas[17].getPosicion() + "  |  " + casillas[16].getPosicion() + "  |  " + casillas[15].getPosicion() + "  |  " + casillas[14].getPosicion() + "  |      |  " + casillas[30].getPosicion() + "  |");
        System.out.println("|  " + casillas[19].getTipo() + "  |  " + casillas[18].getTipo() + "  |  " + casillas[17].getTipo() + " |  " + casillas[16].getTipo() + "  |  " + casillas[15].getTipo() + "  |  " + casillas[14].getTipo() + "  |      |  " + casillas[30].getTipo() + " |");
        System.out.println("|  " + casillas[19].getIconoJugador() + "  |  " + casillas[18].getIconoJugador() + "  |  " + casillas[17].getIconoJugador() + " |  " + casillas[16].getIconoJugador() + "  |  " + casillas[15].getIconoJugador() + "  |  " + casillas[14].getIconoJugador() + "  |      |  " + casillas[30].getIconoJugador() + " |");
        System.out.println("|______|______|______|______|______|______|      |______|");
        System.out.println("|  " + casillas[20].getPosicion() + "  |                                         |  " + casillas[29].getPosicion() + "  |");
        System.out.println("|  " + casillas[20].getTipo() + "  |                                         |  " + casillas[29].getTipo() + "  |");
        System.out.println("|  " + casillas[20].getIconoJugador() + "  |                                         |  " + casillas[29].getIconoJugador() + "  |");
        System.out.println("|______|______ ______ ______ ______ ______ ______|______|");
        System.out.println("|  " + casillas[21].getPosicion() + "  |  " + casillas[22].getPosicion() + "  |  " + casillas[23].getPosicion() + "  |  " + casillas[24].getPosicion() + "  |  " + casillas[25].getPosicion() + "  |  " + casillas[26].getPosicion() + "  |  " + casillas[27].getPosicion() + "  |  " + casillas[28].getPosicion() + "  |");
        System.out.println("|  " + casillas[21].getTipo() + "  |  " + casillas[22].getTipo() + "  |  " + casillas[23].getTipo() + " |  " + casillas[24].getTipo() + "  |  " + casillas[25].getTipo() + "  |  " + casillas[26].getTipo() + " |  " + casillas[27].getTipo() + "  |  " + casillas[28].getTipo() + "  |");
        System.out.println("|  " + casillas[21].getIconoJugador() + "  |  " + casillas[22].getIconoJugador() + "  |  " + casillas[23].getIconoJugador() + " |  " + casillas[24].getIconoJugador() + "  |  " + casillas[25].getIconoJugador() + "  |  " + casillas[26].getIconoJugador() + " |  " + casillas[27].getIconoJugador() + "  |  " + casillas[28].getIconoJugador() + "  |");
        System.out.println("|______|______|______|______|______|______|______|______|");
    }

    public static void rellenarMuertes(Casilla[] casillas) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int random = r.nextInt(41);
            //System.out.println("Introduce el numero de una muerte");
            if (!casillas[random].getTipo().equals("\uD83E\uDD86"))
                casillas[random].setTipo("☠️");
            else {
                i--;
            }
        }
    }

    public static void moverFicha(Casilla[] casillas) {
        boolean salir = false;
        int acumulador = 0;
        Random r = new Random();
        System.out.println("Empieza la partida");
        casillas[acumulador].setIconoJugador("🔻");
        mostrarTablero(casillas);
        while (!salir) {
            int random = r.nextInt(8) + 1;

            if (acumulador != 41){
                if (acumulador + random > casillas.length - 1) {
                    while (acumulador != 41) {
                        random = r.nextInt(8) + 1;
                        if (acumulador + random == 41)
                            acumulador += random;
                    }
                }else{
                    acumulador = acumulador + random;
                }
                System.out.println("El jugador ha sacado un: " + random);
                casillas[acumulador].setIconoJugador("🔻");
            }
            mostrarTablero(casillas);

            switch (casillas[acumulador].getTipo()) {
                case "☠️":
                    for (int i = 0; i < casillas.length; i++) {
                        casillas[i].setIconoJugador("  ");
                    }
                    System.out.println("OHHHHH Has muerto.");
                    acumulador = 0;
                    casillas[acumulador].setIconoJugador("🔻");
                    mostrarTablero(casillas);
                    break;
                case "\uD83E\uDD86":
                    for (int i = acumulador; i < casillas.length - 1; i++) {
                        if (casillas[i + 1].getTipo().equals("\uD83E\uDD86")) {
                            casillas[i + 1].setIconoJugador("🔻");
                            System.out.println("De oca en oca tiro porque me toca");
                            mostrarTablero(casillas);
                            acumulador = i + 1;
                            break;
                        }
                    }
                    break;
                default:
                    if (acumulador == 41) {
                        System.out.println("Has ganado");
                        salir = true;
                    }
                    break;
            }
        }
    }
}
