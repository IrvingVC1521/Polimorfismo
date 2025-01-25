package Reserva;

import java.util.Objects;
import java.util.Scanner;

public class ReservaCoche extends ReservaViaje{
    protected String tipoCoche;


    public ReservaCoche() {
        super();
        this.tipoCoche = "";
    }

    public ReservaCoche(String numReserva, String fechaInicio, String fechaFin, String tipoCoche) {
        super(numReserva, fechaInicio, fechaFin);
        this.tipoCoche = tipoCoche;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
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
            System.out.print("Ingrese el tipo de coche: ");
            tipoCoche = sc.nextLine();
        } else System.out.println("Ya tienes una reserva activa");
    }

    @Override
    public void cancelarReserva() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        if(!Objects.equals(tipoCoche, "")) {
            System.out.println("¿Estas seguro de que quieres cancelar tu reserva?");
            System.out.println("Si estas seguro escribe 'Si', en otro caso 'No'");
            respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Has cancelado tu reserva");
                numReserva = "";
                fechaInicio = "";
                fechaFin = "";
                tipoCoche = "";
            } else if (respuesta.equalsIgnoreCase("no"))
                System.out.println("Tu reserva sigue en curso");
            else System.out.println("Ingresa una respusta válida");
        } else System.out.println("No tienes ninguna reserva activa");
    }

    @Override
    public void mostrarDetalles() {
        if (!Objects.equals(numReserva, "")) {
            System.out.println("Numero de reserva: " + numReserva);
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("Fecha final: " + fechaFin);
            System.out.println("Tipo de coche: " + tipoCoche);
        } else System.out.println("No tienes ninguna reserva activa");
    }
}
