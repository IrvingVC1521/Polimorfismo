package Reserva;

import java.util.Objects;
import java.util.Scanner;

public class ReservaHotel extends ReservaViaje{
 protected String nombreHotel, tipoHabitacion;


    public ReservaHotel() {
        super();
        this.nombreHotel = "";
        this.tipoHabitacion = "";
    }

    @Override
    public void hacerReserva() {
     Scanner sc = new Scanner(System.in);
     if(Objects.equals(numReserva, "")) {
         System.out.print("Ingrese el numero de la reserva: ");
         numReserva = sc.nextLine();
         System.out.print("Ingrese la fecha de inicio: ");
         fechaInicio = sc.nextLine();
         System.out.print("Ingrese la fecha de fin: ");
         fechaFin = sc.nextLine();
         System.out.println("Ingrese el nombre del hotel: ");
         nombreHotel = sc.nextLine();
         System.out.println("Ingrese el tipo de habitacion: ");
         tipoHabitacion = sc.nextLine();
         System.out.println("Reserva realiazada con éxito");
     } else System.out.println("Ya tienes una reserva");
    }

    @Override
    public void cancelarReserva() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        if(!Objects.equals(numReserva, "")) {
            System.out.println("¿Estas seguro de que quieres cancelar tu reserva?");
            System.out.println("Si estas seguro escribe 'Si', en otro caso 'No'");
            respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Has cancelado tu reserva");
                numReserva = "";
                fechaInicio = "";
                fechaFin = "";
                nombreHotel = "";
                tipoHabitacion = "";
            } else if (respuesta.equalsIgnoreCase("no"))
                System.out.println("Tu reserva sigue en curso");
            else System.out.println("Ingresa una respusta válida");
        } else System.out.println("No tienes una reserva activa");
    }

    @Override
    public void mostrarDetalles() {
        if(!Objects.equals(numReserva, "")) {
            System.out.println("Numero de reserva: " + numReserva);
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("Fecha final: " + fechaFin);
            System.out.println("Número de vuelo: " + nombreHotel);
            System.out.println("Lugar de salida: " + tipoHabitacion);
        }
        else System.out.println("No tienes una reserva activa");
    }

    public ReservaHotel(String numReserva, String fechaInicio, String fechaFin, String nombreHotel, String tipoHabitacion) {
        super(numReserva, fechaInicio, fechaFin);
        this.nombreHotel = nombreHotel;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
}
