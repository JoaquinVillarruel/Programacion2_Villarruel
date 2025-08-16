/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_unidad1;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        System.out.println("Tu nombre es: "+nombre+" Y tu edad es: "+edad);
        
       
    }
    
}
