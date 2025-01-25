package Interfaces;

public class PruebaArrayReales {
    public static void main(String[] args) {
        ArrayReales objeto = new ArrayReales();
        objeto.asignarValores();
        System.out.println("Sumatoria: " + objeto.sumatoria());
        System.out.println("Valor minimo: " + objeto.minimo());
        System.out.println("Valor maximo: " + objeto.maximo());
        System.out.println("Contenido del vector: ");
        objeto.imprimir();
    }
}
