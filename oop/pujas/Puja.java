package pujas;

public class Puja {
    //********  ATRIBUTOS **********//
    private final double    cambio= 1.07;           // cambio del dolar
    private String          nombre;                 // nombre del pujante
    private double          cantidad;               // cantidad ofrecida en $
    private char            moneda;                 // € ó $
    private String          pais;                   // pais de procedencia

    private static double mejorPuja = 100000;   // variable global con la mejor
    // oferta hasta el momento

    private static String mejorNombre;          // nombre de la mejor oferta

    private static double []todasLasPujas = new double[600];        // arrays paralelos donde
    private static String []NombretodasLasPujas = new String[600];  // guardas las pujas
    private static int indiceTodasLasPujas = 0; // índice de los arrays anteriores

    //********  CONSTRUCTORES **********//
    public Puja(String nombre, double puja, char moneda)
    {
        this.nombre     = nombre;
        this.cantidad   = puja;
        this.moneda     = moneda;
        tratarPuja();
    }
    /*****************************************************************/
    /*****************************************************************/
    public Puja(String nombre, double puja, char moneda, String pais)
    {
        this.nombre     = nombre;
        this.cantidad   = puja;
        this.moneda     = moneda;
        this.pais       = pais;
        tratarPuja();
    }
    //********  MÉTODOS DE LA CLASE **********//
    /*****************************************************************/
    private void tratarPuja()
    {
        pasarAEuros();
        comprobarPuja();
        todasLasPujas[indiceTodasLasPujas] = this.cantidad;
        NombretodasLasPujas[indiceTodasLasPujas] = this.nombre;
        indiceTodasLasPujas++;
    }
    /*****************************************************************/
    private void pasarAEuros()
    {
        if (moneda == '€')
            cantidad = cantidad*cambio;
    }

    /*****************************************************************/
    private void comprobarPuja ()
    {
        if (cantidad > mejorPuja)
        {
            mejorPuja = cantidad;
            mejorNombre = nombre;
        }
    }
    /*****************************************************************/
    public static double getMejorPuja() {
        return mejorPuja;
    }
    /*****************************************************************/
    public static String getMejorNombre() {
        return mejorNombre;
    }
    /*****************************************************************/
    public static void visualizarTodasLasPujas()
    {
        System.out.println("\nEstas son todas las pujas recibidas : ");
        for (int i=0 ; i<indiceTodasLasPujas ; i++)
        {
            System.out.print(NombretodasLasPujas[i] + " = ");
            System.out.println("   \t" + todasLasPujas[i] + "  " + "$");
        }
        System.out.println("\n");
    }

}
