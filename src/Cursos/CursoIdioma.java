package Cursos;

public class CursoIdioma extends Curso {
    protected String idioma;

    public CursoIdioma(String nombre, String clave, String idioma) {
        super(nombre, clave);
        this.idioma = idioma;
    }

    public CursoIdioma() {
        super();
        this.idioma = "";
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    @Override
    void detalleCurso() {
        System.out.println("Curso de idiomas");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Clave: " + this.getClave());
        System.out.println("Idioma: " + this.getIdioma());
    }

}
