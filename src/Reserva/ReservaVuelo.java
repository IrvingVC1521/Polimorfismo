package Reserva;

import java.util.Objects;
import java.util.Scanner;

public class ReservaVuelo extends ReservaViaje{
    protected String numVuelo, lugarSalida, lugarLlegada;

    public ReservaVuelo(String numReserva, String fechaInicio, String fechaFin, String numVuelo, String lugarSalida, String lugarLlegada) {
        super(numReserva, fechaInicio, fechaFin);
        this.numVuelo = numVuelo;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
    }
    public ReservaVuelo() {
        super();
        this.numVuelo = "";
        this.lugarSalida = "";
        this.lugarLlegada = "";
    }


    @Override
    public void hacerReserva() {
      Scanner sc = new Scanner(System.in);
      if(Objects.equals(numVuelo, "")) {
              System.out.print("Ingrese el numero de la reserva: ");
              numReserva = sc.nextLine();
              System.out.print("Ingrese la fecha de inicio: ");
              fechaInicio = sc.nextLine();
              System.out.print("Ingrese la fecha de fin: ");
              fechaFin = sc.nextLine();
              System.out.println("Ingrese el numero de vuelo");
              numVuelo = sc.nextLine();
              System.out.println("Ingrese el lugar salida");
              lugarSalida = sc.nextLine();
              System.out.println("Ingrese el lugar llegada");
              lugarLlegada = sc.nextLine();

      } else System.out.println("Ya tienes una reserva");

    }

    @Override
    public void cancelarReserva() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        if(!Objects.equals(numVuelo, "")) {
            System.out.println("¿Estas seguro de que quieres cancelar tu reserva?");
            System.out.println("Si estas seguro escribe 'Si', en otro caso 'No'");
            respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Has cancelado tu reserva");
                numReserva = "";
                fechaInicio = "";
                fechaFin = "";
                numVuelo = "";
                lugarSalida = "";
                lugarLlegada = "";
            } else if (respuesta.equalsIgnoreCase("no"))
                System.out.println("Tu reserva sigue en curso");
            else System.out.println("Ingresa una respusta válida");
        } else System.out.println("No tienes una reserva activa");
    }

    @Override
    public void mostrarDetalles() {
        if(!Objects.equals(numVuelo, "")) {
            System.out.println("Numero de reserva: " + numReserva);
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("Fecha final: " + fechaFin);
            System.out.println("Número de vuelo: " + numVuelo);
            System.out.println("Lugar de salida: " + lugarSalida);
            System.out.println("Lugar de llegada: " + lugarLlegada);
        } else System.out.println("No tienes una reserva activa");
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

}
