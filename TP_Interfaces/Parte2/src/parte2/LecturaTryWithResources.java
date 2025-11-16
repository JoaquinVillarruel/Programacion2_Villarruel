/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */

public class LecturaTryWithResources {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la ruta del archivo de texto: ");
        String ruta = sc.nextLine();

     
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo:");
            System.out.println(e.getMessage());
        }

        sc.close();
        System.out.println("\nFin de la lectura.");
    }
}