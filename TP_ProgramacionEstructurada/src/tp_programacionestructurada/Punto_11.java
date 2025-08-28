/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Punto_11 {

     static double descuentoEspecial = 0.1;
     
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado: " +descuentoAplicado);
        System.out.println("El precio final es: " +precioFinal);
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);  
    }
    
}
