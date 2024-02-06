package alumnosfich;

public class Alumno {
    private TipoCurso curso;
    private String nombre;
    private int id;
    private double notaFinal = 0;

    private static int id_unico = 0;

    public Alumno(TipoCurso curso, String nombre) {
        this.curso = curso;
        this.nombre = nombre;
        id = id_unico;
        id_unico++;
    }
    
    /*
    public void notaAleatoria()
    {
      
        this.notaFinal = (int)(Math.random()*10+0);
        
    }
    
    public double notaAleatoria()
    {
      
        double nota;
    
        nota = (int)(Math.random()*10+0);
        
        return nota;
    
    }
    */

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }


    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }


    @Override
    public String toString() {
        return "Alumno{ id=" + id + ", nombre=" + nombre + ", notaFinal=" + notaFinal + '}';
    }


}