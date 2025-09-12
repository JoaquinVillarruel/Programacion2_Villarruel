/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial n = new NaveEspacial();
        
        n.setNombre("Prueba");
        n.setCombustible(50);
        
        n.despegar();
        n.avanzar(60);
        n.recargarCombustible(30);
        n.mostrarEstado();
        n.avanzar(60);
        n.mostrarEstado();
    }
    
}
