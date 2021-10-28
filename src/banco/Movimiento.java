package banco;

public class Movimiento {

    int idMovimiento;
    double monto;
    String fecha;
    String tipomov;

    public Movimiento() {

    }

    public Movimiento(int idMovimiento, double monto, String fecha, String tipomov) {
        this.idMovimiento = idMovimiento;
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

    @Override
    public String toString() {
        return "Movimiento{" + "idMovimiento=" + idMovimiento + ", monto=" + monto + ", fecha=" + fecha + ", tipomov=" + tipomov + '}';
    }

}
