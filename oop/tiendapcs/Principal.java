package tiendapcs;

public class Principal {
    public static void main(String[] args) {
        // creamos la tienda
        Tienda tienda1 = new Tienda("Pc-Continentes", "Pepe Ruiz", 4);
// creamos las PCs a la venta
        tienda1.add("HP", 16, "Intel iCore 7", "Windows", 1250.50);
        tienda1.add("Toshiba", 32, "Intel iCore 7", "Windows",
                1642.70);
        tienda1.add("Lenovo", 32, "Intel iCore 7", "Linux", 875.0);
        tienda1.add("IBM", 8, "AMD", "Windows", 475.50);
        imprimirEstadoActual(tienda1);
        System.out.println(tienda1.add("xxx", 8, "xxx", "xxx", 1)); //debe dar mensaje por no caber
        tienda1.eliminar("HP");
        imprimirEstadoActual(tienda1);
        tienda1.eliminar("Lenovo");
        imprimirEstadoActual(tienda1);
        tienda1.eliminar("IBM");
        imprimirEstadoActual(tienda1);
        tienda1.eliminar("Toshiba");
        imprimirEstadoActual(tienda1);
        tienda1.add("HP", 16, "Intel iCore 7", "Windows", 1250.50);
        imprimirEstadoActual(tienda1);
    }//main()

    /************************************************************/
    private static void imprimirEstadoActual(Tienda tienda) {
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");

        System.out.println("Número de PCs actualmente a la venta : " +
                tienda.getnOrdenadores());
        tienda.imprimirStock();
    }
}// class Principal
