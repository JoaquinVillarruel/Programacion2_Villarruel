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
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        if(edad < 12){
            System.out.println("Niño");
        }else if((edad >= 12) && (edad <= 17)){
            System.out.println("Adolescente");
        }else if((edad >= 18) && (edad <= 59)){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
        }
    }
    
}
