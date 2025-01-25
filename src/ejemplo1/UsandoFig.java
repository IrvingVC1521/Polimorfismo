package ejemplo1;

public class UsandoFig {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Circulito", 6.9);
        Cuadrado cuadrado1 = new Cuadrado("Cuadradito", 8);
        System.out.printf("Area del circulo: %.2f\n",circulo1.area());
        System.out.printf("Perimetro del circulo: %.2f\n",circulo1.perimetro());

        System.out.printf("Area del cuadrado:  %.2f\n" ,cuadrado1.area());
        System.out.printf("Perimetro del cuadrado: %.2f\n" , cuadrado1.perimetro());
    }
}
