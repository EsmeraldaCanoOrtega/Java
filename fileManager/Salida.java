package ficheros;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Salida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        String cadena;
        try{
            fw = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/adios.txt");//hay que crearlo antes
            PrintWriter salida = new PrintWriter(fw);

            System.out.println("Introduzca el texto que quiera introducir en el fichero.");
            cadena = sc.nextLine();

            while (!cadena.equalsIgnoreCase("fin")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            salida.flush();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if (fw != null)
                    fw.close();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

}

