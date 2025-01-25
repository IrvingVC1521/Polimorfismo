package EjerciciosMaths;

public class Math2 {

    public static double minimo(double []vector){
        double min = vector[0];
        for(int i=1;i<vector.length;i++){
            if(vector[i]<min){
                min = vector[i];
            }
        }
         return min;
    }
    public static double maximo(double []vector){
        double max = vector[0];
        for(int i=1;i<vector.length;i++){
            if(vector[i]>max){
                max = vector[i];
            }
        }
        return max;
    }
    public static double suma(double []vector){
        double sum = 0;
        for(int i=0;i<vector.length;i++){
            sum += vector[i];
        }
        return sum;
    }
    public static double mediaAritmetica(double []vector){
        double media = 0;
            media += suma(vector);
        return media/vector.length;
    }
    public static double geometrica(double []vector){
        double geometrica = 1;
        for(int i=0;i<vector.length;i++){
            geometrica *= vector[i];
        }
        return Math.sqrt(geometrica);
    }

}
