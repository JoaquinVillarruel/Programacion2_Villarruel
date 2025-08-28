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
public class Punto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numero,suma = 0;
       
        System.out.println("Ingrese un numero (0 para terminar): ");
        numero = scanner.nextInt();
        
        while(numero != 0){
            if(numero %2 == 0){
                suma += numero;
            }
            System.out.println("Ingrese otro numero (0 para terminar): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("La suma de todos los numeros pares es: "+ suma);
        
    }
    
}
