package basics;

import java.util.Scanner;

public class BasicExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("1.  Los valores comprendidos entre 531 y 540. ");
            System.out.println("2.  El primer número natural para el cual la suma de él más sus antecesores es mayor a 125.");
            System.out.println("3.  los veinte primeros múltiplos de cinco. ");
            System.out.println("4.  la media de 15 valores suministrados por el teclado. ");
            System.out.println("5.  la media de n valores suministrados por teclado suministrando a su vez el valor n por teclado. ");
            System.out.println("6.  Cantidad horaria en horas, minutos y segundos y lo convierte todo a minutos. ");
            System.out.println("7.  Cantidad horaria en segundos y la convierte en horas, minutos y segundos. ");
            System.out.println("8.  10 números por teclado y al concluir escribe el mayor y menor de ellos. ");
            System.out.println("9.  El factorial de un número pedido por teclado ");
            System.out.println("10. Todos los números primos entre 1 y n ");
            System.out.println("11. Diseñar un programa para jugar a adivinar un número entre 0 y 100. El juego tiene que dar pistas de si el número introducido por el jugador está por encima o por debajo. El juego termina cuando se adivina el número o se decide terminar de jugar (por ejemplo al teclear un número negativo).");
            System.out.println("12. Programa que escriba los valores comprendidos entre dos numeros dados.");
            System.out.println("13. Ordenar de mayor a menor 3 numeros dados");
            System.out.println("14. Nota numérica y la saque por pantalla en letra");
            System.out.println("15. Nota numérica y ponga el equivalente de notas (suspenso, etc)");
            System.out.println("16. Pida el numero de alumnos, pide la nota de todos los alumnos y saca la media de la clase y el numero de aprobados y suspensos.");
            System.out.println("17. Salir");
            //System.out.println("Elige uno de ellos: ...");
            int opcionMenu = sc.nextInt();
            switch ((opcionMenu)) {
                case 1:
                    valoresDeXHastaY(sc);
                    break;
                case 2:

                    break;
                case 3:
                    multiplosValores(sc);
                    break;
                case 4:
                    media(sc);
                    break;
                case 5:
                    media_a_eleccion(sc);
                    break;
                case 6:
                    la_hora_en_minutos(sc);
                    break;
                case 7:
                    segundos_en_la_hora(sc);
                    break;
                case 8:
                    mayor_a_menor_10num(sc);
                    break;
                case 9:
                    mayor_a_menor_10num(sc);
                    break;
                case 10:
                    factorial_n(sc);
                    break;
                case 11:
                    primos(sc);
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    n_nota_en_letra(sc);
                    break;
                case 15:
                    //media_nota_alumnos(sc);
                    media_nota_alumnos_2(sc);
                    break;
                case 16:
                    System.out.println("Hasta pronto");
                    salir= true;
                    break;
                default:
                    System.out.println("No es valido: " + opcionMenu + ", introduzca el número de la opción deseada");
                    break;


            }
        }
    }

    public static void valoresDeXHastaY(Scanner sc) {
        System.out.println("Introduzca dos valores");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Los valores comprendidos de " + n1 + " hasta " + n2 + " son:");
        for (int i = n1; i < n2 + 1; i++) {
            System.out.println(i);
        }

    }

    public static void multiplosValores(Scanner sc) {
        System.out.println("Introduzca un número para saber sus 20 primeros múltiplos");
        int n1 = sc.nextInt();
        for (int i = 0; i <= 20; i++) {
            System.out.println(n1 * i);
        }
    }

    public static void media(Scanner sc) {
        System.out.println("Introduce los números");

        int total = 0;
        for (int i = 0; i < 15; i++) {
            int n1 = sc.nextInt();
            total += n1;
        }
        System.out.println("La media es: " + (total / 15));
    }

    public static void media_a_eleccion(Scanner sc) {
        System.out.println("Introduce el total de numeros que va a tener en su operación");
        int divisor_media = sc.nextInt();
        int total = 0;
        System.out.println("Proceda a introducir valores");
        for (int i = 0; i < divisor_media; i++) {
            int n1 = sc.nextInt();
            total += n1;
        }
        System.out.println("La media es: " + (total / divisor_media));

    }

    public static void la_hora_en_minutos(Scanner sc) {
        System.out.println("Introduzca el número de horas ");
        int horas = sc.nextInt();
        System.out.println("Introduzca el número de minutos ");
        float minutos = sc.nextInt();
        System.out.println("Introduzca el número de segundos ");
        float segundos = sc.nextInt();
        float total = (horas * 60) + minutos + (segundos / 60);
        System.out.println("La hora introducida en minutes es: " + total);


    }

    public static void segundos_en_la_hora(Scanner sc) {
        System.out.println("Introduzca el número de segundos: ");
        int segundos_inicial = sc.nextInt();
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        if (segundos_inicial >= 3600) {
            horas = segundos_inicial / 3600;
        }
        if (segundos_inicial >= 60) {
            minutos = (segundos_inicial / 60) - (horas * 60);
        }
        segundos = segundos_inicial - ((horas * 3600) + (minutos * 60));

        System.out.println("La hora es: h." + horas + " min." + minutos + " s." + segundos);
    }

    public static void primos(Scanner sc) {
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        boolean salir;
       /* for (int i = 0; i < numero; i++) {
            salir = false;
            for (int j = 0; j < i+1 || !salir; j++) {
                if ((i + 2) % (j + 2) == 0 && (i + 2) != (j + 2)) {
                    salir = true;
                }
            }
            if (salir) {
                System.out.println((i + 1) + ", ");
            }
        }*/
        System.out.println("\n");
    }

    public static void mayor_a_menor_10num(Scanner sc) {
        System.out.println("Introduce 10 números: ");
        int menor = 0;
        int mayor = 0;
        int n = sc.nextInt();
        menor = n;
        mayor = n;
        for (int i = 0; i < 9; i++) {
            n = sc.nextInt();
            if (n > mayor) {
                mayor = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("El número mayor es: " + mayor + "\nEl número menor es: " + menor);

    }

    public static void factorial_n(Scanner sc) {
        int n = sc.nextInt();
        int resultado = n * (n - 1);
        System.out.println(n + " x " + (n - 1));
        for (int i = n - 1; i > 1; i--) {
            resultado *= i - 1;
            System.out.println(resultado + " x " + (i - 1));
        }
    }

    public static void n_nota_en_letra(Scanner sc) {
        System.out.println("Introduzca la nota del alumno: ");
        float nota = sc.nextFloat();

        if (nota > 10 || nota < 0) {
            System.out.println("Solo numeros comprendidos desde 0 hasta 10");
        } else if (nota > 8.0) {
            System.out.println("sobresaliente");
        } else if (nota > 7.0) {
            System.out.println("notable");
        } else if (nota > 6.0) {
            System.out.println("bien");
        } else if (nota >= 4.5) {
            System.out.println("suficiente");
        } else if (nota >= 0) {
            System.out.println("insuficiente");
        }
    }

    public static void media_nota_alumnos(Scanner sc) {
        System.out.println("Cuantos alumnos tiene: ");
        int alumnos = sc.nextInt();
        float aprobados = 0;
        int media_aprobados = 0;
        float suspendidos = 0;
        int media_suspensos = 0;
        float nota = 0;
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduzca la nota del alumno con nº " + (i + 1) + " de la lista");
            nota = sc.nextFloat();
            if (nota > 10 || nota < 0) {
                System.out.println("Solo numeros comprendidos desde 0 hasta 10");
            } else {
                if (nota > 4.5) {
                    media_aprobados += nota;
                    aprobados += 1;
                } else {
                    media_suspensos += nota;
                    suspendidos += 1;
                }
            }
        }
        System.out.println("La media de aprobados ha sido: " + (media_aprobados / aprobados));
        System.out.println("El número de aprobados ha sido: " + (int) aprobados);

        System.out.println("La media de suspensos ha sido: " + (media_suspensos / suspendidos));
        System.out.println("El número de suspensos ha sido: " + (int) suspendidos);

    }

    public static void media_nota_alumnos_2(Scanner sc) {
        System.out.println("Cuantos alumnos tiene: ");
        float[] arrayNotas = new float[sc.nextInt()];
        float aprobados = 0;
        int media_aprobados = 0;
        float suspendidos = 0;
        int media_suspensos = 0;


        for (int i = 0; i < arrayNotas.length; i++) {
            System.out.println("Introduzca la nota del alumno con nº " + (i + 1) + " de la lista");
            arrayNotas[i] = sc.nextFloat();
            if (arrayNotas[i] > 10 || arrayNotas[i] < 0) {
                System.out.println("Solo numeros comprendidos desde 0 hasta 10");
            } else {
                if (arrayNotas[i] > 4.5) {
                    media_aprobados += arrayNotas[i];
                    aprobados += 1;
                } else {
                    media_suspensos += arrayNotas[i];
                    suspendidos += 1;
                }
            }
        }

        System.out.println("La media de aprobados ha sido: " + (media_aprobados / aprobados));
        for (int i = 0; i < arrayNotas.length; i++) {
            if (arrayNotas[i] > 4.5) {
                System.out.println("Notas de los aprobados: " + arrayNotas[i]);
            }
        }

        System.out.println("La media de suspensos ha sido: " + (media_suspensos / suspendidos));
        for (int i = 0; i < arrayNotas.length; i++) {
            if (arrayNotas[i] < 4.5) {
                System.out.println("Notas de los suspensos: " + arrayNotas[i]);
            }
        }
    }

}


