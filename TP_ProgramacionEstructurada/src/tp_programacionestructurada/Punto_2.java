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
public class Punto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();
        
        if((num1 > num2) && (num1 > num3)){
            System.out.println("El mayor es: "+num1);
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println("El mayor es: "+num2);
        }else{
            System.out.println("El mayor es: "+num3);
        }
    }
    
}
