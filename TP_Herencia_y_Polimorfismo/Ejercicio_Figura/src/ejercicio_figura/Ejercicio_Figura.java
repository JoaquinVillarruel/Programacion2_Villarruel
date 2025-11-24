/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_figura;

/**
 *
 * @author Joaquin
 */
public class Ejercicio_Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo(2.0);
        figuras[1] = new Rectangulo(3.0, 4.0);
        figuras[2] = new Circulo(5.0);
        
        for(Figura f : figuras){
            System.out.println("Area de " + f.getNombre() + ": "+f.calcularArea());
        }
    }
    
}
