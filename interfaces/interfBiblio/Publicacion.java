package interfBiblio;

public abstract class Publicacion {

    private String codigo;
    private String titulo;
    private int anio_publicacion;

    /******************************************************/

    public Publicacion(String codigo, String titulo, int anio_publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio_publicacion = anio_publicacion;
    }

    /******************************************************/
    public boolean pillarLibro(Publicacion p1){
        boolean canjeado = false;
        if (this instanceof Libro){
            canjeado = true;
            prestar(p1);
        }
       return canjeado;
    }
    public boolean devolverLibro(Publicacion p1){
        boolean canjeado = false;
        if (this instanceof Libro){
            canjeado = true;
            devolver(p1);
        }
        return canjeado;
    }
    public abstract void devolver(Publicacion p1);
    public void contarPrestados(Publicacion[] p1s){
        int contador=0;
        boolean prestado = false;
        for (int i = 0; i <p1s.length ; i++) {
           prestado= p1s[i].estaPrestado(p1s[i]);
           if(prestado){
               contador =contador+1;
               prestado=false;
           }
        }
        System.out.println("El número de libros prestados es: "+contador);
    }
    public abstract void ilustrar(Publicacion p1);
    public abstract void prestar(Publicacion p1);
    public abstract boolean estaPrestado(Publicacion p1);

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }





}