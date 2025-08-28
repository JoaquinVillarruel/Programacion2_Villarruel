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
public class Punto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        do{
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = scanner.nextInt();
            
            if((nota < 0) || (nota > 10)){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        }while((nota < 0) || (nota > 10));
        
        System.out.println("Nota guardada correctamente.");
    }
    
}
