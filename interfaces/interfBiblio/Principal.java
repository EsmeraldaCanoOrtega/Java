package interfBiblio;
// Libro libro =(Libro)publicaciones[0];
// ((Libro)p).
public class Principal {

    public static void main(String[] args) {

        Publicacion[] publicaciones = new Publicacion[3];

        publicaciones[0] = new Libro("CC1", "La fundación", 1951);
        publicaciones[1] = new Revista(29, "CR1", "El jueves", 2002);
        publicaciones[2] = new Libro("CC2", "El neuromante", 1984);

        publicaciones[0].pillarLibro(publicaciones[0]);
        publicaciones[2].pillarLibro(publicaciones[2]);
        ilustrarCosas(publicaciones);
        publicaciones[0].contarPrestados(publicaciones);
        publicaciones[0].devolver(publicaciones[0]);
        ilustrarCosas(publicaciones);
        publicaciones[0].contarPrestados(publicaciones);

    }
    public static void ilustrarCosas(Publicacion[] publicaciones){
        for (int i = 0; i < publicaciones.length; i++) {
            publicaciones[i].ilustrar(publicaciones[i]);

        }
    }

}