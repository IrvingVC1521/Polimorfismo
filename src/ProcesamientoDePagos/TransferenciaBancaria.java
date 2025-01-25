package ProcesamientoDePagos;

public class TransferenciaBancaria extends pagos{
    String numeroCuenta, Banco;

    public TransferenciaBancaria() {
        this.numeroCuenta = "";
        Banco = "";
    }
    public TransferenciaBancaria(String numeroCuenta, String banco) {
        this.numeroCuenta = numeroCuenta;
        Banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    @Override
    public void pagar(double monto) {
        if(fondos()){
            System.out.println("Se ha recibido una transferencia bancaria");
            expedirRecibo(monto);
        }
        else {
            System.out.println("No se ha recibido la transferencia bancaria");
        }
    }

}
