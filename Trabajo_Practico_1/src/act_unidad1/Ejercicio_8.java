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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Division: "+ (num1 / num2));
    }
    
}
