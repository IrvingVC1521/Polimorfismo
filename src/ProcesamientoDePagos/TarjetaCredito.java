package ProcesamientoDePagos;

public class TarjetaCredito extends pagos{
   protected String numTarjeta, feechaexpiracion, cvv;

    public TarjetaCredito() {
        numTarjeta = "";
        feechaexpiracion ="";
        cvv = "";
    }
    public TarjetaCredito(String numTarjeta, String feechaexpiracion, String cvv) {
        this.numTarjeta = numTarjeta;
        this.feechaexpiracion = feechaexpiracion;
        this.cvv = cvv;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getFeechaexpiracion() {
        return feechaexpiracion;
    }

    public void setFeechaexpiracion(String feechaexpiracion) {
        this.feechaexpiracion = feechaexpiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    @Override
    public void pagar(double monto) {
    if(fondos()){
        System.out.println("Se ha recibido pago con tarjeta de credito");
        expedirRecibo(monto);
    }
    else {
        System.out.println("No se ha recibido el pago. Saldo insuficiente");
    }
    }

}
