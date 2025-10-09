/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto10;

/**
 *
 * @author Joaquin
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;   

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Evita bucle recursivo y mantiene consistencia
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "cbu: " + cbu + " - saldo: " + saldo + " - clave: " + clave + " - titular: " + titular;
    }
}
