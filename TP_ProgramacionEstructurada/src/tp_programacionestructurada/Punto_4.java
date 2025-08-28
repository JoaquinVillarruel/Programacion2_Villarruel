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
public class Punto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double precio, descuento = 0.1;
       char categoria;
       
       
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        
        System.out.println("Ingrese la categoria del producto: ");
        categoria = scanner.next().charAt(0);
        
        switch(categoria){
            case 'A':
                descuento = 0.1 ;
                break;
                
            case 'B':
                descuento = 0.15;
                break;
                
            case 'C':
                descuento = 0.2;
                break;
                
            default:
                System.out.println("Categoria no valida.");
        }
        
        System.out.println("Precio sin descuento: " + precio);
        System.out.println("Descuento aplicado: " + ((int)(descuento * 100.0)) +"%");
        System.out.println("Precio final: "+ (precio - (precio * descuento)));
        
        
        
    }
    
}
