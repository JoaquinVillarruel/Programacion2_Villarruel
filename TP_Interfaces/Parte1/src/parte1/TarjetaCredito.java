/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1;

/**
 *
 * @author Joaquin
 */
public class TarjetaCredito implements PagoConDescuento{
    private String titular;
    private double porcentajeDescuento;
    public TarjetaCredito(String titular, double porcetajeDescuento){
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * porcentajeDescuento / 100.0);
    }
    
    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago con tarjeta a nombre de " + titular + " por $" + montoFinal);
    }
}
