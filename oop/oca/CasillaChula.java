package oca;

public class CasillaChula {
    private final int[] posicion;
    private final int numero;
    private final String icono;
    private final String iconoJugador = "\uD83D\uDD3B";
    private final String tipo;
    private boolean isJugador = false;
    private final String[] contenido;

    public CasillaChula(int[] posicion, int numero, String icono, String tipo) {
        this.posicion = posicion;
        this.numero = numero;
        this.icono = icono;
        this.tipo = tipo;
        contenido = new String[5];
        prepararToString();
    }

    private void prepararToString(){
        switch (tipo){
            case Tipos.TIPO_NORMAL:
            case Tipos.TIPO_OCA:
            case Tipos.TIPO_CALAVERA:
            case Tipos.TIPO_CARCEL:
                if (!isJugador){
                    contenido[0] = " ______";
                    contenido[1] = "|  " + this.numero + "  |";
                    contenido[2] = "|  " + this.icono + "  |";
                    contenido[3] = "|      |";
                    contenido[4] = "|______|";
                }else{
                    contenido[0] = " ______";
                    contenido[1] = "|  " + this.numero + "  |";
                    contenido[2] = "|  " + this.icono + "  |";
                    contenido[3] = "|  " + this.iconoJugador + "  |";
                    contenido[4] = "|______|";
                }
                break;
            case Tipos.TIPO_VACIO:
                contenido[0] = "       ";
                contenido[1] = "       ";
                contenido[2] = "       ";
                contenido[3] = "       ";
                contenido[4] = "       ";
                break;
        }
    }


}
