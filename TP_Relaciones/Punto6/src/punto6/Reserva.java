/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto6;

/**
 *
 * @author Joaquin
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;  
    private Mesa mesa;     

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "fecha: " + fecha + " - hora: " + hora + " - cliente: " + cliente + " - mesa: " + mesa;
    }
    
    
}
