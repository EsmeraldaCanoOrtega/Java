package tienda;

import java.util.Scanner;

public class Principal implements Interface {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("PC-COMPONENTES");

        Cliente cliente1 = new Cliente("Z123456789");

        Principal examen = new Principal();
        examen.menu(tienda, cliente1);


        //tienda.borrarComponente(examen, 1);


    }

    /*****************************************************************************************************/

    public void menu(Tienda tienda, Cliente cliente1) {

        int opcion;
        boolean salir = false;

        Scanner entrada = new Scanner(System.in);

        while (!salir) {

            System.out.println("********** MENÚ **********");
            System.out.println("1. Añadir componente.");
            System.out.println("2. Eliminar componente.");
            System.out.println("3. Mostrar componentes.");
            System.out.println("4. Mostrar componentes por precio (incluyendo los de precio menor).");
            System.out.println("5. Generar factura.");
            System.out.println("6. Salir");
            System.out.print("\nIntroduce un valor (1-3): ");

            opcion = entrada.nextInt();

            System.out.println("");

            switch (opcion) {

                case 1:
                    System.out.println(tienda.annadirComponente(11, new DiscoDuro(11, "Tairens", 40, 70, "12/05/2017", "Samsund", 4, Generic.SDD)) == true ? "CORRECTO. Componente añadido" : "ERROR. Ya existe el ID");
                    System.out.println(tienda.annadirComponente(12, new Memoria(12, "SAPPHIRE", 4, 45.5, "12/05/2017", "AMD", 4, 4)) == true ? "CORRECTO. Componente añadido" : "ERROR. Ya existe el ID");
                    Componente c = new Componente(1, "raton", 3, 40, "12/05/2017", "Logitech");
                    System.out.println(tienda.annadirComponente(1, c) ? "ERROR. Ya existe el ID" : "CORRECTO. Componente añadido");
                    break;

                case 2:
                    int id = 1;
                    System.out.println(tienda.borrarComponente(id) == true ? "CORRECTO. Componente eliminado" : "NO hay un componente con id: " + id);
                    break;

                case 3:
                    for (int i = 0; i < tienda.getComponentes().size(); i++) {
                        tienda.getComponentes().get(i).ver(tienda.getComponentes().get(i));
                    }
                    break;

                case 4:
                    System.out.println("Introduce un precio: ");
                    tienda.precioComponente(entrada.nextDouble());
                    break;

                case 5:
                    Componente compi = tienda.buscarComp(1);
                    if (compi==null){
                        System.out.println("Buscame un id que tenga");
                    }else {
                        cliente1.annadirPedido(compi);
                        int numalea= (int) (Math.random()*1000+1);
                        cliente1.factura(2,numalea,1);
                    }


                    break;

                case 6:
                    System.out.println("Saliendo ...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    System.out.println("");
            }
        }
    }


}