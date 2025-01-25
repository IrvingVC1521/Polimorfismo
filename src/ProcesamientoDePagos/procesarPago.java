package ProcesamientoDePagos;

import java.util.Scanner;

public class procesarPago {
    public static void main(String[] args) {
        char respuestaUsu;
        Scanner entrada = new Scanner(System.in);
        int tipopago;

        do{
            tipopago = menu();
            hacerPago(tipopago);
            System.out.println("Teclea S si hay más pagos");
            respuestaUsu = entrada.next().charAt(0); //charAt(0) solo lee la primera letra que tu introduces
        }while (respuestaUsu == 'S' || respuestaUsu == 's');
    }
    public static int menu() {
        Scanner lectura = new Scanner(System.in);
        int tipoPago;
        do {
            System.out.println("*****Opciones de pago******");
            System.out.println("1.- Tarjeta de credito");
            System.out.println("2.- Paypal");
            System.out.println("3.- Transferencia");
            System.out.println("4. Digite la opcion deseada");
            tipoPago = lectura.nextInt();
            if (tipoPago < 1 || tipoPago > 3)
                System.out.println("Opcion no valida");
        }while (tipoPago < 1 || tipoPago > 3);
        return tipoPago;
    }
    public static void hacerPago(int opcionPago) {
        double monto;
        Scanner leer = new Scanner(System.in);

        System.out.println("Cantidad a pagar");
        monto = leer.nextDouble();
        switch (opcionPago) {
            case 1: //Pago con tarjeta de credito
                pagoTarjetaCredito(monto);
                break;
            case 2://Pago con paypal
                pagoPaypal(monto);
                break;
                case 3: //Pago con transferencia
                    pagoTransferencia(monto);
                    break;
        }
    }

    public static void pagoTarjetaCredito(double monto) {
        Scanner lectura = new Scanner(System.in);
        String numTarjeta, fechaExpiracion, cvv;
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        System.out.println("Numero de Tarjeta");
        numTarjeta  = lectura.nextLine();
        tarjetaCredito.setNumTarjeta(numTarjeta);
        System.out.println("Fecha Expiracion");
        fechaExpiracion = lectura.nextLine();
        tarjetaCredito.setFeechaexpiracion(fechaExpiracion);
        System.out.println("CVV");
            cvv = lectura.nextLine();
            tarjetaCredito.setCvv(cvv);
            tarjetaCredito.pagar(monto);
            tarjetaCredito.pagar(monto);
    }
    public static void pagoPaypal(double monto) {
        Scanner lectura = new Scanner(System.in);
        String correoElectronico;
        Paypal paypal = new Paypal();
        System.out.println("Correo electronico");
        correoElectronico = lectura.nextLine();
        paypal.setCorreoElectronico(correoElectronico);
        paypal.pagar(monto);
    }
    public static void pagoTransferencia(double monto) {
        Scanner lectura = new Scanner(System.in);
        String numeroCuenta, Banco;
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        System.out.println("Numero de Cuenta");
        numeroCuenta = lectura.nextLine();
        transferenciaBancaria.setNumeroCuenta(numeroCuenta);
        System.out.println("Banco");
        Banco = lectura.nextLine();
        transferenciaBancaria.setBanco(Banco);
        transferenciaBancaria.pagar(monto);
    }
}
