package ejemplo1;

public class Cuadrado extends  Figuraa{
    protected double lado;
    public Cuadrado(){
        super();
    }


    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
