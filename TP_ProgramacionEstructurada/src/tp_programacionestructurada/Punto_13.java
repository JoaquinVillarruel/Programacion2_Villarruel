/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_programacionestructurada;

/**
 *
 * @author Joaquin
 */
public class Punto_13 {
    
    public static void Mostrar(double[] arreglo, int indice) {
        if (indice < arreglo.length) {
            System.out.println("Precio: $" + arreglo[indice]);
            Mostrar(arreglo, indice + 1); // llamada recursiva
        }
    }
    public static void main(String[] args) {
        
        double precios [] = {199.99,299.5,149.75,399.0,89.99};
        
        System.out.println("Precios originales");
        Mostrar(precios, 0);
        
        precios[2] = 129.99;
        System.out.println("Precios modificados: ");
        Mostrar(precios, 0);
    }
    
}
