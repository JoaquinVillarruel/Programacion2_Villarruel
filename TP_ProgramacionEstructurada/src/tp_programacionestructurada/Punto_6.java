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
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeros = 0,contPos = 0,contNeg = 0,contCeros = 0;
        
        for(int i = 0; i<10; i++){
            System.out.println("Ingrese el numero "+i);
            numeros = scanner.nextInt();
            if(numeros > 0){
                contPos++;
            }else if(numeros < 0){
                contNeg++;
            }else{
                contCeros++;
            }
        }
        
        System.out.println("Resultados: ");
        System.out.println("Positivos: "+ contPos);
        System.out.println("Negativos: "+ contNeg);
        System.out.println("Ceros: "+ contCeros);
    }
    
}
