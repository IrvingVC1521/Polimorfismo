package AutenticaAutenticador;

import java.util.Objects;
import java.util.Scanner;

public class AutenticadorPassword implements Autenticacion{
    Scanner entrada = new Scanner(System.in);
    protected String senha;


    public AutenticadorPassword() {
        this.senha = "";
    }


    @Override
    public boolean autenticar(String usuario, String contrasena) {
        senha = contrasena;
        System.out.println("Ingresa tu contraseña");
        contrasena = entrada.nextLine();
        if(Objects.equals(contrasena, senha))
            System.out.println("La contraseña es correcta");
        else

            System.out.println("La contraseña es incorrecta");
        return contrasena.equals(senha);
    }

}
