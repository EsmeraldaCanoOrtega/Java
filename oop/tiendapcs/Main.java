package tiendapcs;

public class Main {


    public enum Operaciones {SUMA, RESTA, MULTIPLICACION, DIVISION}

    public class PruebaEnum {
        public static void main(String[] args) {
            int valor1 = 10;
            int valor2 = 20;

            Operaciones operacion;
            operacion = Operaciones.RESTA;

            if (operacion == Operaciones.RESTA) {
                int resta = valor1 - valor2;
                System.out.println(resta);
            }
            operacion = Operaciones.SUMA;
            if (operacion == Operaciones.SUMA) {
                int suma = valor1 + valor2;
                System.out.println(suma);
            }
        }
    }

}
