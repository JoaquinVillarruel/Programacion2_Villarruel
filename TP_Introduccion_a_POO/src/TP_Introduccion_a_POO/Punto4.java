/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        g1.setIdGallina(1);
        g2.setIdGallina(2);
        
        g1.envejecer();
        g1.ponerHuevo();
        g1.mostrarEstado();
        
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        g2.mostrarEstado();
        
        
    }
    
}
