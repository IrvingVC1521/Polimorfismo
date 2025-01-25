package Extremos;

import EjerciciosMaths.Math2;

public class PruebaMath2 {
    public static void main(String[] args) {
        double []v = new double[10];
        for (int i = 0; i < v.length; i++) {
            v[i] =4 * Math.random(); // ponemos el 4 para que sean numeros menores que 4 cifras o menores que 4
            System.out.println("Posición: "+ i + ": "+v[i]);
        }
        System.out.println("Sumatoria: " + Math2.suma(v));
        System.out.println("El minimo es: " + Math2.minimo(v));
        System.out.println("El máximo es: " + Math2.maximo(v));
        System.out.println("La media aritmética es: " + Math2.mediaAritmetica(v));
        System.out.println("La media geométrica es: " + Math2.geometrica(v));
    }
}
