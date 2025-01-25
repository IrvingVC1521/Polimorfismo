package Cursos;

public class CursoProgramacion extends Curso {
    protected String lenguaje;

    public CursoProgramacion(String nombre, String clave, String lenguaje) {
        super(nombre, clave);
        this.lenguaje = lenguaje;
    }

    public CursoProgramacion() {
        super();
        this.lenguaje = "";
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    @Override
    void detalleCurso() {
        System.out.println("Curso de programacion");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Clave: " + this.getClave());
        System.out.println("Lenguaje: " + this.getLenguaje());
    }
}
