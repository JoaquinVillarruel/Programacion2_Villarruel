/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m = new Mascota();
        
        m.setNombre("Leia");
        m.setEspecie("Gato");
        m.setEdad(1);
        
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
        
    }
    
}
