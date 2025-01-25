package AutenticaAutenticador;

import java.util.Scanner;

public class PruebaAutenticar {
    public static void main(String[] args) {
        AutenticadorPassword autenticadorpass = new AutenticadorPassword();
        AutenticadorTokenMovil autenticadortoken = new AutenticadorTokenMovil();
        AutenticadorBiometrico autenticadorbio = new AutenticadorBiometrico();
       DecidirAutenticador( autenticadorpass, autenticadortoken, autenticadorbio );
    }
    public static void DecidirAutenticador(AutenticadorPassword autenticadorpass, AutenticadorTokenMovil autenticadortoken, AutenticadorBiometrico autenticadorbio) {
        Scanner teclado = new Scanner(System.in);
        int datos;
        String cadenas = "1.- Autenticar por contraseña \n" +
                "2.- Autenticar por pin \n" +
                "3.- Autenticación biométrica \n" +
                "4.- Salir";
        do {

            System.out.println("Ingresa la opción a elegir:");
            System.out.println(cadenas);
            datos = teclado.nextInt();

            switch (datos) {
                //Llamamos al metodos autenticador por contraseña
                case 1:
                    autenticadorpass.autenticar("Ranulfo", "pepepicapiedras");
                    break;
                case 2:
                    //Llamamos al metodo autenticador por pin
                    autenticadortoken.autenticar("Ramirito", "12345");
                    break;
                case 3:
                    //Llamamos al metodo autenticador biométrico
                    autenticadorbio.autenticar("Susana", "12345");
                    break;
                    //Salimos
                case 4:
                    System.out.println("Gracias por sus preferencias");
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
            }
        } while (datos != 4);

        }
    }

