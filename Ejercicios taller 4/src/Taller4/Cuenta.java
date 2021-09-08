
package Taller4;


//ejercicio 9

public class Cuenta {
private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    
    public Cuenta() {
    }

    
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {                         
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    
    public Cuenta(final Cuenta c) {
        nombreCliente = c.nombreCliente;
        numeroCuenta = c.numeroCuenta;
        saldo = c.saldo;
    }

    
    
    public String getNombre() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setNombre(String nombre) {
        nombreCliente = nombre;
    }

    public void setNumeroCuenta(String cuenta) {
        numeroCuenta = cuenta;
    }

    public void setSaldo(double Saldo) {
        saldo = Saldo;
    }

    
    public boolean Consignar(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    
    public boolean retirar(double n) {
        boolean retiroCorrecto = true;                                                                         
        if (n < 0) {
            retiroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            retiroCorrecto = false;
        }
        return retiroCorrecto;
    }

    
   
    
    
    
    
    
    
    
    
}
