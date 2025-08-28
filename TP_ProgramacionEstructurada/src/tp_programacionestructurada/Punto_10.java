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
public class Punto_10 {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
     return stockActual - cantidadVendida + cantidadRecibida;   
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = scanner.nextInt();
        
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " +stockActual);
        
    }
   
}
