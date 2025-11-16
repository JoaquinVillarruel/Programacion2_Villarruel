/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int b = sc.nextInt();

            int resultado = a / b;   

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");

        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar solo números enteros.");

        } finally {
            System.out.println("Fin de la división segura.");
        }
        
        sc.nextLine();
        
        //Ejercicio2
        System.out.print("Ingrese un número en texto: ");
        String texto = sc.nextLine();   
        try {
            int numero = Integer.parseInt(texto); 
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + texto + "\" no es un número entero válido.");
        }


        System.out.println("Fin de la conversión de cadena a número.");
        
        //Ejercicio3
               
        System.out.print("Ingrese la ruta del archivo de texto: ");
        String ruta = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo \"" + ruta + "\" no existe.");

        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        System.out.println("\nFin de la lectura de archivo.");
        

        
    }
    
   
           
    
}
