/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_programacionestructurada;

/**
 *
 * @author Joaquin
 */
public class Punto_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precios [] = {199.99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios originales");
        for(int i = 0; i<precios.length;i++){
            System.out.println("Precio: "+(i+1)+": $"+precios[i]);
        }
        
        precios[2] = 129.99;
        System.out.println("Precios modificados: ");
        
        for(int i = 0; i<precios.length;i++){
            System.out.println("Precio: "+(i+1)+": $"+precios[i]);
        }       
    }
    
}
