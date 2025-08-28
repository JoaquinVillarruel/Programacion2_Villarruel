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
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int anio;
        System.out.println("Ingrese un año: ");
        anio = scanner.nextInt();
        
        if((anio %4 == 0) && (anio %100 != 0)){
            System.out.println("Es año bisiesto");
        }else if((anio %4 == 0) && (anio %400 == 0)){
            System.out.println("Es año bisiesto");
        }else{
            System.out.println("No es año bisiesto");
        }
    }
    
}
