package Interfaces;

public class ArrayReales implements Estadisticas{
    public double[] vector;

    public ArrayReales(){
        vector = new double[10];
    }

    public ArrayReales(double[] vector){
        this.vector = vector;
    }
    public void asignarValores(){
        for(int i = 0; i < vector.length; i++){
            vector[i] = Math.random() * 100;
        }
    }
    public double minimo(){
        double min = vector[0];
        for(double numero : vector){
            if(numero < min){
                min = numero;
            }
        }
        return min;
    }
    public double maximo(){
        double max = vector[0];
        for(double numero : vector){
            if(numero > max){
                max = numero;
            }
        }
        return max;
    }
    public double sumatoria(){
        double sum = 0;
        for(double numero : vector){
            sum += numero;
        }
        return sum;
    }
    public void imprimir(){
        int c = 0;
        for(double numero : vector){
            System.out.println("Posicion: " + c + ": " +numero);
            c++;
        }
    }
}
