/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_colecciones;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class Inventario {

    private final ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p != null) {
            boolean repetido = false;

            for (Producto prod : productos) {
                if (prod.getId().equals(p.getId())) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                productos.add(p);
            } else {
                System.out.println("Ya existe un producto con ese ID.");
            }
        } else {
            System.out.println("No se puede agregar un producto nulo.");
        }
    }
    
    public void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("Inventario Vacio");
        }else{
            for(Producto p: productos){
                System.out.println(p);
            }
        }
    }
    
    public Producto buscarProductoPorId(String id){
        if(productos.isEmpty()){
            return null;
        }
        
        for(Producto p : productos){
            if(id.equals(p.getId())) return p;
        }
        
        return null;
    }
    
    public boolean eliminarProducto(String id){
        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getId().equals(id)){
                productos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if(p == null) return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto cat) {
        ArrayList<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == cat) res.add(p);
        }
        return res;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            if (productos.get(i).getCantidad() > max.getCantidad()) {
                max = productos.get(i);
            }
        }
        return max;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        }
        return res;
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " - " + c.getDescripcion());
        }
    }
}

    
