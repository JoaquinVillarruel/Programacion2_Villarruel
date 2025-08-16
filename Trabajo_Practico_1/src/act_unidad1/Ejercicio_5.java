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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1,num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        num2 = scanner.nextInt();
        
        System.out.println("Suma: "+ (num1+ num2));
        System.out.println("Resta: "+ (num1 - num2));
        System.out.println("Multiplicacion: "+ (num1 * num2));
        System.out.println("Division: "+ ((double)num1 / (double)num2));
        
        
        
    }
    
}
