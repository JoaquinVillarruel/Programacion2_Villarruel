/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte1;

/**
 *
 * @author Joaquin
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente("Cecilia", "ceci@mail.com");

        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 8000);

        Pedido pedido = new Pedido();
        pedido.setCliente(c);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total del pedido: " + pedido.calcularTotal());

        TarjetaCredito tc = new TarjetaCredito("Cecilia", 10);
        tc.procesarPago(pedido.calcularTotal());

        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}
