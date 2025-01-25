package ejemplo1;
//Esta clase es abstracta porque dos de sus metodos son abstractos
//un metodo es abstracto cuando no contiene código, unicamente contiene el encabezado
//NO SE PUEDEN HACER OBJETOS DE ESTA CLASE, SOLO DE SUS HIJAS
public abstract class Figuraa {
    protected String nombre;
    public Figuraa(){
        nombre = "";
    }
    public Figuraa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Figuraa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
