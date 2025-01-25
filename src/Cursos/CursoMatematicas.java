package Cursos;

public class CursoMatematicas extends Curso {
    protected String tema;

    public CursoMatematicas(String nombre, String clave, String tema) {
        super(nombre, clave);
        this.tema = tema;
    }

    public CursoMatematicas() {
        super();
        this.tema = "";
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    @Override
    void detalleCurso() {
        System.out.println("Curso de matematicas");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Clave: " + this.getClave());
        System.out.println("Tema: " + this.getTema());
    }

}
