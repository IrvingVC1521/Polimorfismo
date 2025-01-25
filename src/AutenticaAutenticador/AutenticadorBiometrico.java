package AutenticaAutenticador;

import java.util.Random;

public class AutenticadorBiometrico implements Autenticacion {
    Random rand = new Random();
    public AutenticadorBiometrico() {
          rand  = new Random();
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {
            boolean fotoGenerada;
            fotoGenerada = rand.nextBoolean();
        if (fotoGenerada)
            System.out.println("La imagen ha coincidido");
        else
            System.out.println("La imagen no coincide");
        return false;
    }
}
