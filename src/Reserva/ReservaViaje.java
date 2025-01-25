package Reserva;

public abstract class ReservaViaje {
 protected String numReserva, fechaInicio, fechaFin;

    public ReservaViaje() {
        this.numReserva = "";
        this.fechaInicio = "";
        this.fechaFin = "";
    }

    public ReservaViaje(String numReserva, String fechaInicio, String fechaFin) {
        this.numReserva = numReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public abstract void hacerReserva();
    public abstract void cancelarReserva();
    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return "ReservaViaje{" +
                "numReserva='" + numReserva + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }
}
