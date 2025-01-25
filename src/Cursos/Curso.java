package Cursos;

public abstract class Curso {
    protected String nombre, clave;

    public Curso(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }
    public Curso() {
        this.nombre = "";
        this.clave = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
     abstract void detalleCurso();
}
