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
public class Punto_8 {

    public static double calcularPrecioFinal(double PrecioBase,double Impuesto, double Descuento){
        return PrecioBase + (PrecioBase * Impuesto / 100) - (PrecioBase * Descuento / 100);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double precio;
         int impuesto, descuento;
         
         System.out.println("Ingrese el precio base del producto: ");
         precio = scanner.nextDouble();
         
         System.out.println("Ingrese el impuesto en porcentaje: ");
         impuesto = scanner.nextInt();
         
         System.out.println("Inrese el descuento en porcentaje: ");
         descuento = scanner.nextInt();
         
         System.out.println("El precio final del producto es: "+ calcularPrecioFinal(precio, impuesto, descuento));
    }
    
}
