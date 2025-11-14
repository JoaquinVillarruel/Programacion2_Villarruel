/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_colecciones;

/**
 *
 * @author Joaquin
 */
public class TP_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("A1", "Yerba 1kg", 2500, 30, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("E1", "Auriculares BT", 12000, 15, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("R1", "Buzo", 8000, 10, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("H1", "Almohada", 3000, 25, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("E2", "Mouse", 4500, 40, CategoriaProducto.ELECTRONICA));

        System.out.println("Listado inicial");
        inv.listarProductos();

        System.out.println("Busco por ID E1");
        System.out.println(inv.buscarProductoPorId("E1"));

        System.out.println("Filtro por electronica");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            System.out.println(p);
        }
        
        System.out.println("Elimino R1");
        inv.eliminarProducto("R1");
        inv.listarProductos();
        
        System.out.println("Actualizo el stock de E2");
        inv.actualizarStock("E2", 60);
        System.out.println(inv.buscarProductoPorId("E2"));
        
        System.out.println("Obtengo el total de unidades en stock");
        System.out.println(inv.obtenerTotalStock());
        
        System.out.println("Filtro por precio");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) {
            System.out.println(p);
        }

        System.out.println("Categorias disponibles");
        inv.mostrarCategoriasDisponibles();
        
    }
    

}
