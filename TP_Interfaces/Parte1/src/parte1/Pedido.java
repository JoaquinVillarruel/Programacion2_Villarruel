/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaquin
 */
public class Pedido implements Pagable {
    
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;
    
    public Pedido(){
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void quitarProducto(Producto p) {
        productos.remove(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado de su pedido cambió a: " + nuevoEstado);
        }
    }
    

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();   // suma el total de cada producto
        }
        return total;
    }
}
