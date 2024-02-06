package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ParImpar {
    public static void main(String[] args) {
        //Creamos ficheros y hacemos objetos
        FileReader cogeNums    = null;
        FileWriter fwPares      = null;
        FileWriter fwImpares    = null;
        String dato;
        try
        {

            cogeNums   = new FileReader("C:/Users/ECO/Desktop/PruebasJava/numeros.txt");
            //Los crea el solo
            fwPares     = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/pares.txt");
            fwImpares   = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/impares.txt");

            BufferedReader brNumeros = new BufferedReader(cogeNums);
            PrintWriter    pwPares   = new PrintWriter(fwPares);
            PrintWriter    pwImpares = new PrintWriter(fwImpares);
/********************************/
            dato = brNumeros.readLine();
            while (dato !=null){
                if(parImpar(dato).equalsIgnoreCase("par")){
                    pwPares.println(dato);
                }else {
                    pwImpares.println(dato);
                }
                dato = brNumeros.readLine();
            }
/********************************/
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try
            {
                if (cogeNums != null)
                    cogeNums.close();
                if (fwPares != null)
                    fwPares.close();
                if (fwImpares != null)
                    fwImpares.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }//finally
    }
    public static String parImpar (String dato){
        String resultado ="";
        if (Integer.parseInt(dato) % 2 ==0)
            resultado= "par";
        else {
            resultado= "impar";
        }
        return resultado;
    }
}
