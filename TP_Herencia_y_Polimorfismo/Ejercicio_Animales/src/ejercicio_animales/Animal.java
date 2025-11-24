/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_animales;

/**
 *
 * @author Joaquin
 */
public class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido de animal");
    }
    
    public void describirAnimal(){
        System.out.println("Mi nombre es: "+nombre);
    }
}
