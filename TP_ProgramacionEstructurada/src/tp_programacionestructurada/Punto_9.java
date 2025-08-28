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
public class Punto_9 {

    public static double calcularCostoEnvio(double peso, String zona){
        double costo;
        if(zona.equalsIgnoreCase("Nacional")){
            costo = peso * 5;
        }else{
            costo = peso * 10;
        }
        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        return precioProducto +  costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double precio, peso, envio;
        String zona;
        
        System.out.println("Ingrese el peso del paquete: ");
        peso = scanner.nextDouble();
        
        System.out.println("Ingrese el precio del producto");
        precio = scanner.nextDouble();
        
        System.out.println("Ingrese la zona de envio: ");
        zona = scanner.next();
        
        envio = calcularCostoEnvio(peso, zona);
        
        System.out.println("El costo de envio es: " +envio);
        System.out.println("El total a pagar es: " +calcularTotalCompra(precio, envio));
        
    }
    }
   
