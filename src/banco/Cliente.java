package banco;

import java.util.Arrays;

public class Cliente {

    int idCliente;
    private int contadorCuentas = 0;
    String nombre;
    String telefono;
    String direccion;
    Cuenta[] cuentas = new Cuenta[50];

    public Cliente() {

    }

    public Cliente(int idCliente, String nombre, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
    public void addCuenta(Cuenta nuevaCuenta) {
        if (contadorCuentas < 50)
            this.cuentas[contadorCuentas++] = nuevaCuenta;
    }
    
    public int siguienteIdCuenta() {
        return contadorCuentas;
    }
    
    public int getContadorCuentas() {
        return contadorCuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", cuentas=" + Arrays.toString(cuentas) + '}';
    }

}
