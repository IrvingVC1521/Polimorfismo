package ProcesamientoDePagos;

import java.util.Random;

public abstract class pagos {
    //Metodo abstracto
    public abstract void pagar(double monto);

    //Metodo para generar la respuesta de que si hay fondos o no
    public boolean fondos(){
        boolean respuesta;
        Random rand = new Random();
        respuesta = rand.nextBoolean();
        return respuesta;
    }
    //Expedir recibo
    public void expedirRecibo(double monto){
        System.out.println("*************************");
        System.out.println("Se ha recibido un pago por: " +monto + " pesos");
        System.out.println("Gracias por su compra");
        System.out.println("*************************");
    }

}
