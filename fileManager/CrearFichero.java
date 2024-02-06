package arrNumsFich;

import java.io.*;
import java.util.ArrayList;

// convertir num positivo *(-1) o Math.abs
public class CrearFichero {
    public static void main(String[] args) {

            String numeritos[] = rellenarArray();
            ArrayList<Integer> numList = rellenarLista(numeritos);
            int empate = 0;


            for (int i = 0; i < numList.size(); i += 3) {
                System.out.println(numList.get(i) + "\t" + numList.get(i + 1) + "\t" + numList.get(i + 2) + "\t");
                if (Math.abs(numList.get(i + 1) - numList.get(i)) == Math.abs(numList.get(i + 2) - numList.get(i + 1))) {
                    System.out.println("Empate");
                    empate++;
                } else if (Math.abs(numList.get(i + 1) - numList.get(i)) < Math.abs(numList.get(i + 2) - numList.get(i + 1))) {
                    System.out.println("El número " + numList.get(i) + " esta mas cerca");
                } else if (Math.abs(numList.get(i + 1) - numList.get(i)) > Math.abs(numList.get(i + 2) - numList.get(i + 1))) {
                    System.out.println("El número " + numList.get(i + 2) + " esta mas cerca");
                }
            }
            System.out.println("");
            imprimirFichero(numList, empate, numeritos.length);
        }
        public static void imprimirFichero (ArrayList < Integer > numeros,int empates, int length){
            FileWriter fwNums = null;
            int menor = 10001;
            int mayor = -10001;
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) < menor) {
                    menor = numeros.get(i);
                }
                if (numeros.get(i) > mayor) {
                    mayor = numeros.get(i);
                }
            }

            try {
                fwNums = new FileWriter("C:/Users/ECO/Desktop/PruebasJava/totalNums.txt");
                PrintWriter pwNums = new PrintWriter(fwNums);

                pwNums.println("Resultado de la práctica\n_______________________________");

                pwNums.println("Número de casos de prueba: " + (length - 1));
                pwNums.println("Se ha anulado: " + empates);
                pwNums.println("El número mayor es: " + mayor);
                pwNums.println("El número menor es: " + menor);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (fwNums != null)
                        fwNums.close();

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        public static ArrayList<Integer> rellenarLista (String[]numeritos){
            String separador = " ";
            ArrayList<Integer> numsList = new ArrayList<>();
            for (int j = 0; j < numeritos.length; j++) {
                if (numeritos[j] == null) {
                    break;
                }
                String[] lenguajesComoArreglo = numeritos[j].split(separador);

                for (int i = 0; i < lenguajesComoArreglo.length; i++) {
                    numsList.add(Integer.parseInt(lenguajesComoArreglo[i]));
                }
            }

            return numsList;
        }
        public static String[] rellenarArray () {
            FileReader frNums = null;
            String[] numeritos = new String[0];
            String numeros;
            int contador = 0;

            try {

                frNums = new FileReader("C:/Users/ECO/Desktop/PruebasJava/entradaNums.txt");
                BufferedReader brNums = new BufferedReader(frNums);

                numeros = brNums.readLine();
                numeritos = new String[Integer.parseInt(numeros) + 1];

                while (numeros != null) {
                    numeros = brNums.readLine();
                    numeritos[contador] = numeros;
                    contador++;

                }

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (frNums != null)
                        frNums.close();

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            return numeritos;
        }
    }
