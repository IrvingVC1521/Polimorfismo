package Reserva;

import java.util.Scanner;
public class AdmonReserva {
    static ReservaVuelo reservaVuelo = new ReservaVuelo();
    static ReservaHotel reservaHotel = new ReservaHotel();
    static ReservaCoche reservaCoche = new ReservaCoche();
    static int datos;
    public static void main(String[] args) {
            Menu();
    }


    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****************** Menu ******************");
        System.out.println("Para hacer una reservación presione: 1");
        System.out.println("Para cancelar una reservación presione: 2");
        System.out.println("Para mostrar los datos de su reservación presione: 3" );
        System.out.println("Para salir presione: 4");

        System.out.println("Ingresa una opcion");
        datos = sc.nextInt();
        if (datos< 1 || datos > 4)
            System.out.println("Error, numero fuera de rango");
        else {
            switch (datos) {
                case 1:
                    //Metodo que mostrará los tipos de reserva
                    Reservaa();
                    break;
                    case 2:
                        CancelarReserva();
                        //Metodo que cancelará una reserva
                        break;
                case 3:
                    //Metodo que mostrará los datos
                    MostrarReserva();
                    break;
                case 4:
                    System.out.println("Gracias por sus preferencias");
                    break;
                default:
                    System.out.println("Error, numero fuera de rango");
            }
        }
        return datos;

    }
    public static void Reservaa(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
        System.out.println("****************** Reserva ******************");
        System.out.println("Ingresa una opcion");
        System.out.println("1.- Reserva de vuelo");
        System.out.println("2.- Reserva de hotel");
        System.out.println("3.- Reserva de coche");
        System.out.println("4.- Regresar al menu principal");
        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    reservaVuelo.hacerReserva();
                    break;
                case 2:
                    reservaHotel.hacerReserva();
                    break;
                case 3:
                    reservaCoche.hacerReserva();
                   break;
                case 4:
                    Menu();
                    break;
                default:
                    System.out.println("Error, opcion invalida");
            }
        }
      }
      public static void CancelarReserva(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("****************** Cancelar Reserva ******************");
            System.out.println("Ingresa una opcion");
            System.out.println("1.- Cancelar la reserva de vuelo");
            System.out.println("2.- Cancelar la reserva de hotel");
            System.out.println("3.- Cancelar la reserva de coche");
            System.out.println("4.- Regresar al menu principal");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    reservaVuelo.cancelarReserva();
                    break;
                case 2:
                    reservaCoche.cancelarReserva();
                    break;
                case 3:
                    reservaHotel.cancelarReserva();
                    break;
                case 4:
                Menu();
                    break;
                default:
                    System.out.println("Error, opcion invalida");
            }
        }
      }
      public static void MostrarReserva(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
          while (opcion != 4) {
              System.out.println("****************** Mostrar Reserva ******************");
              System.out.println("Ingresa una opcion");
              System.out.println("1.- Mostrar la reserva de vuelo");
              System.out.println("2.- Mostrar la reserva de hotel");
              System.out.println("3.- Mostrar la reserva de coche");
              System.out.println("4.- Regresar al menu principal");
              opcion = sc.nextInt();

              switch (opcion) {
                  case 1:
                      reservaVuelo.mostrarDetalles();
                      break;
                  case 2:
                      reservaCoche.mostrarDetalles();
                      break;
                  case 3:
                      reservaHotel.mostrarDetalles();
                      break;
                  case 4:
                      Menu();
                      break;
                  default:
                      System.out.println("Error, opcion invalida");
              }
          }
      }
}
