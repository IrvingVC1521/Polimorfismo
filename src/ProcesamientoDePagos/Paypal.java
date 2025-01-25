package ProcesamientoDePagos;

public class Paypal extends pagos{
    protected String correoElectronico;

    public Paypal(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Paypal() {
        this.correoElectronico = "";
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void pagar(double monto) {
        if(fondos()) {
            System.out.println("Se ha recibido un pago mediante Paypal");
            expedirRecibo(monto);
        }
        else {
            System.out.println("No se ha podido recibir el pago desde PayPal. Saldo insuficiente");
        }
    }

}
