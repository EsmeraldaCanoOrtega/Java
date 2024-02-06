package oca;

public class Casilla {
    private int posicion;
    private String icono = "\uD83D\uDC13";
    private String iconoJugador = "  ";
    private boolean isJugador = false ;
    private String tipo;

    public Casilla(int indice) {
        this.posicion = indice;
    }



    public String getTipo() {
        return icono;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setTipo(String tipo) {
        this.icono = tipo;
    }

    public String getIconoJugador() {
        return iconoJugador;
    }

    public void setIconoJugador(String jugadorIcono) {
        this.iconoJugador = jugadorIcono;
    }

    @Override
    public String toString(){
        String result = "";
        switch (tipo){
            case "normal":
            case "oca":
            case "muerte":
                if (!isJugador){
                    result = " ______ \n" +
                            "|  " + this.posicion + "   |\n" +
                            "|  " + this.icono + " |\n" +
                            "|      |\n" +
                            " ______ \n";
                }else{
                    result = " ______ \n" +
                            "|  " + this.posicion + "  |\n" +
                            "|  " + this.icono + "  |\n" +
                            "|  " + this.isJugador + "   |\n" +
                            " ______ \n";
                }
                break;
            case "vacia":
                result = "          \n" +
                         "    x     \n" +
                         "          \n" +
                         "          \n";
                break;
        }
        return result;
    }


}
