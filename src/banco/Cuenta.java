package banco;

public class Cuenta {

    int idCuenta;
    String TipoCuenta;
    String fecha;
    double montoInicial;
  
    Movimiento[] movimientos;

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    public Cuenta() {

    }

    public Cuenta(int idCuenta, String TipoCuenta, String fecha, double montoInicial) {
        this.idCuenta = idCuenta;
        this.TipoCuenta = TipoCuenta;
        this.fecha = fecha;
        this.montoInicial = montoInicial;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", TipoCuenta=" + TipoCuenta + ", fecha=" + fecha + ", montoInicial=" + montoInicial + ", movimientos=" + movimientos + '}';
    }

}
