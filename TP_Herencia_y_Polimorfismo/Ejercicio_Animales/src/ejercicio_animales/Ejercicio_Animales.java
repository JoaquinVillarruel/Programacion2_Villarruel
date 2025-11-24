/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_animales;

/**
 *
 * @author Joaquin
 */
public class Ejercicio_Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        
        animales[0] = new Perro("Perro1");
        animales[1] = new Gato("Gato1");
        animales[2] = new Vaca("Vaca1");
        
        for(Animal a: animales){
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("/////////////////");
        }
    }
    
}
