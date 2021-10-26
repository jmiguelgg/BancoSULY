package banco;

public class Movimiento {

    int idMovimiento;
    int idCuenta;
    double monto;
    String fecha;
    String tipomov;

    public Movimiento() {

    }

    public Movimiento(int idMovimiento, int idCuenta, double monto, String fecha, String tipomov) {
        this.idMovimiento = idMovimiento;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fecha = fecha;
        this.tipomov = tipomov;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipomov() {
        return tipomov;
    }

    public void setTipomov(String tipomov) {
        this.tipomov = tipomov;
    }

}