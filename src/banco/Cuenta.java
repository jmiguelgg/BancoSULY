package banco;

import java.util.Arrays;
import java.util.Date;

public class Cuenta {

    int idCuenta;
    String TipoCuenta;
    String fecha;
    double montoInicial;
    double saldo;
    Movimiento[] movimientos = new Movimiento[100];

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public int getContadorMovimientos() {
        return contadorMovimientos;
    }
    private int contadorMovimientos;

    public Cuenta() {

    }

    public Cuenta(int idCuenta, String TipoCuenta, String fecha, double montoInicial) {
        this.idCuenta = idCuenta;
        this.TipoCuenta = TipoCuenta;
        this.fecha = fecha;
        this.montoInicial = montoInicial;
        this.saldo = montoInicial;
        this.contadorMovimientos = 0;
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
    
    public boolean crearMovimiento(double monto, String tipo) {
        if (tipo.equals("Retiro") && (this.saldo - monto) < 0.0)
            return false;
        Movimiento movimiento = new Movimiento(this.contadorMovimientos, monto, new Date().toString(), tipo);
        this.movimientos[contadorMovimientos++] = movimiento;
        if (tipo.equals("Retiro"))
            this.saldo -= monto;
        else
            this.saldo += monto;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", TipoCuenta=" + TipoCuenta + ", fecha=" + fecha + ", montoInicial=" + montoInicial + ", saldo=" + saldo + ", movimientos=" + Arrays.toString(movimientos) + '}';
    }

}
