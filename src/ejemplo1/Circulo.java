package ejemplo1;

public class Circulo extends Figuraa{
    protected double r;
    public Circulo(){
        super();
    }
    public Circulo(String nombre, double r) {
        super(nombre);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return 3.1416 * r*r;
    }

    @Override
    public double perimetro() {
        return 2 * 3.1416 *r;
    }

    @Override
    public String toString() {
        return super.toString() + "radio" +r;
    }
}
