package interfBiblio;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int anio_publicacion) {
        super(codigo, titulo, anio_publicacion);
        this.prestado = false;
    }

    @Override
    public void devolver(Publicacion p1) {
        this.prestado= false;
        System.out.println("El libro con titulo: "+p1.getTitulo()+" ha sido devuelto");
    }

    @Override
    public void ilustrar(Publicacion p1) {
        System.out.println("[ Libro ] Código: " + p1.getCodigo());
        System.out.println("Título: " + p1.getTitulo());
        System.out.println("Año de publicación: " + p1.getAnio_publicacion());
        System.out.println(this.prestado+"\n");

    }

    @Override
    public void prestar(Publicacion p1) {
        this.prestado = true;
        System.out.println("Ha sido prestado el libro "+p1.getTitulo());
    }

    @Override
    public boolean estaPrestado(Publicacion p1) {

        return this.prestado ?true:false;
    }

}