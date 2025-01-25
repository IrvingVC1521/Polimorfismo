package AutenticaAutenticador;
import java.util.Random;
import java.util.Scanner;

public class AutenticadorTokenMovil implements Autenticacion {
    Scanner entrada = new Scanner(System.in);
    private Random rand;
    protected int numeroGeneradoPin;
    protected int numeroUsuarioPin;

    public AutenticadorTokenMovil() {
        rand = new Random();
      numeroGeneradoPin = rand.nextInt(9000) + 1000;
        numeroUsuarioPin = 0;
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        contrasena = String.valueOf(numeroGeneradoPin);
        System.out.println("ingresa tu numero");
        numeroUsuarioPin = entrada.nextInt();
        String pinIngresado = Integer.toString(numeroUsuarioPin);
        if(contrasena.equals(pinIngresado))
            System.out.println("El pin es correcto");
        else
            System.out.println("El pin es incorrecto");
        return numeroGeneradoPin == numeroUsuarioPin;
    }

}
