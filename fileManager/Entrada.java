package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:/Users/ECO/Desktop/PruebasJava/hola.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = entrada.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
