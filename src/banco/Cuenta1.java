package banco;

public class Cuenta1 {

    int idCuenta;
    int idCliente;
    String TipoCuenta;
    String fecha;
    double montoInicial;
    

    public Cuenta1() {

    }

    public Cuenta1(int idCuenta, int idCliente, String TipoCuenta, String fecha, double montoInicial) {
        this.idCuenta = idCuenta;
        this.idCliente = idCliente;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

}
