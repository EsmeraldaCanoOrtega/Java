package alumnosfich;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

enum TipoCurso {DAM, DAW}

public class Principal {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnosDAM = new ArrayList();
        ArrayList<Alumno> alumnosDAW = new ArrayList();

        generarListas(alumnosDAM, alumnosDAW);

        generarFicheros(alumnosDAM, alumnosDAW);

        aleatoria(alumnosDAM, alumnosDAW);

        menu(alumnosDAM, alumnosDAW);

    }

    /*****************************************************************************************/

    public static void generarListas(ArrayList<Alumno> alumnosDAM, ArrayList<Alumno> alumnosDAW) {

        FileReader frNombres = null;

        String nombre;

        int contador = 0;

        try {

            frNombres = new FileReader("C:/Users/ECO/Desktop/PruebasJava/Listado1DAM.txt");

            BufferedReader brNombres = new BufferedReader(frNombres);

            nombre = brNombres.readLine();


            while (nombre != null) {

                if (contador < 14) {

                    Alumno nombre_alumno = new Alumno(TipoCurso.DAM, nombre);
                    alumnosDAM.add(nombre_alumno);

                } else {

                    Alumno nombre_alumno = new Alumno(TipoCurso.DAW, nombre);
                    alumnosDAW.add(nombre_alumno);

                }

                contador++;

                nombre = brNombres.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (frNombres != null)
                    frNombres.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }//finally            

    }

    /*****************************************************************************************/

    public static void generarFicheros(ArrayList<Alumno> alumnosDAM, ArrayList<Alumno> alumnosDAW) {

        FileWriter fwDAM = null;
        FileWriter fwDAW = null;

        try {

            fwDAM = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/alumnosDAM.txt");
            fwDAW = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/alumnosDAW.txt");

            PrintWriter pwDAM = new PrintWriter(fwDAM);
            PrintWriter pwDAW = new PrintWriter(fwDAW);

            alumnosDAM.remove(0);

            for (int i = 0; i < alumnosDAM.size(); i++) {

                pwDAM.println(alumnosDAM.get(i).toString());

            }

            for (int i = 0; i < alumnosDAW.size(); i++) {

                pwDAW.println(alumnosDAW.get(i).toString());

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fwDAM != null)
                    fwDAM.close();
                if (fwDAW != null)
                    fwDAW.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }//finally

    }

    /*****************************************************************************************/

    public static void aleatoria(ArrayList<Alumno> alumnosDAM, ArrayList<Alumno> alumnosDAW) {

        for (int i = 0; i < alumnosDAM.size(); i++) {

            //alumnosDAM.get(i).notaAleatoria();

            //alumnosDAM.get(i).setNotaFinal(alumnosDAM.get(i).notaAleatoria());

            alumnosDAM.get(i).setNotaFinal((int) (Math.random() * 10 + 0));
        }

        for (int i = 0; i < alumnosDAW.size(); i++) {

            //alumnosDAW.get(i).notaAleatoria();

            //alumnosDAW.get(i).setNotaFinal(alumnosDAW.get(i).notaAleatoria());

            alumnosDAW.get(i).setNotaFinal((int) (Math.random() * 10 + 0));
        }


    }

    /*****************************************************************************************/

    public static void menu(ArrayList<Alumno> alumnosDAM, ArrayList<Alumno> alumnosDAW) {

        int opcion;

        boolean salir = true;

        Scanner entrada = new Scanner(System.in);

        while (salir) {

            System.out.println("1. Visualizar los alumnos aprobados de DAM \n2. Visualizar los alumnos aprobados de DAW \n3. Salir");

            System.out.print("\nEscoja una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    alumnosAprobados(alumnosDAM);
                    break;

                case 2:

                    alumnosAprobados(alumnosDAW);
                    break;

                case 3:

                    System.out.println("Saliendo...");
                    salir = false;
                    break;

                default:

                    System.out.print("Opción incorrecta. Sigue intentando...");

            }

            aleatoria(alumnosDAM, alumnosDAW);

        }

    }

    /*****************************************************************************************/

    public static void alumnosAprobados(ArrayList<Alumno> alumnosClase) {

        System.out.println("");

        for (int i = 0; i < alumnosClase.size(); i++) {

            if (alumnosClase.get(i).getNotaFinal() >= 5.0) {

                System.out.println("Alumno: " + alumnosClase.get(i).getNombre() + ": " + alumnosClase.get(i).getNotaFinal());

            }

        }

        System.out.println("");

    }


    /*****************************************************************************************/

    public enum Clase {
        DAM, DAW
    }


}

/*Alumno pepe = new Alumno("623784698234V", "lm", "pepe");
                    Alumno pepito = new Alumno("333", "lm", "pepito");
                    alumnosDAM.add(pepe);
                    alumnosDAM.add(pepito);
                    alumnosDAM.set(alumnosDAM.indexOf(pepe), pepito);
                    alumnosDAW = alumnosDAM.clone();
                    alumnosDAM.add(0,pepe);
                    
                    for (int i = 0; i < alumnosDAM.size(); i++)
                    {
                        if( alumnosDAM.get(i).getDNI().equalsIgnoreCase("333V") ){
                            //Alumno pepe =alumnosDAM.get(i);
                            alumnosDAM.get(i).setNombre("pepo");
                        }
                    }*/