package pujas;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Comienza la subasta");

        Puja puja1 = new Puja("Holding Entreprise" , 250000 , '€' );

        Puja puja2 = new Puja("Marqués de Cáceres" , 314000 , '€' , "España" );

        Puja puja3 = new Puja("Roma pictures" , 125000 , '$' );

        Puja puja4 = new Puja("abc investments" , 320000 , '$' , "USA" );

        Puja puja5 = new Puja("r2d2 associates" , 202000 , '$' , "USA" );

        Puja puja6 = new Puja("nouveaux défis" , 115000 , '€' );


        Double cantidad ;

        Puja[] pujas = new Puja[600];
        for (int i = 0; i < pujas.length-6; i++) {
            cantidad = Math.random()*100000+100000;
            pujas[i] = new Puja(String.valueOf(cantidad),cantidad,'$');
        }
        Puja.visualizarTodasLasPujas();
        System.out.println("*****************");
        System.out.println("fin de la subasta\n");
        System.out.println("La mejor oferta es : " + Puja.getMejorNombre());
        System.out.println("Por importe de  : " + Puja.getMejorPuja() + '$');
    }
}
