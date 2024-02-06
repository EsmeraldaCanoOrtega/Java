package interfBiblio;

public class Revista extends Publicacion {

    private int numero;

    /******************************************************/
    /******************************************************/

    public Revista(int numero, String codigo, String titulo, int anio_publicacion) {
        super(codigo, titulo, anio_publicacion);
        this.numero = numero;
    }

    @Override
    public void devolver(Publicacion p1) {

    }

    @Override
    public void ilustrar(Publicacion p1) {
        System.out.println("[ Revista ] Código: " + p1.getCodigo());
        System.out.println("Título: " + p1.getTitulo());
        System.out.println("Año de publicación: " + p1.getAnio_publicacion() + "\n");
    }

    @Override
    public void prestar(Publicacion p1) {

    }

    @Override
    public boolean estaPrestado(Publicacion p1) {
        return false;
    }
}