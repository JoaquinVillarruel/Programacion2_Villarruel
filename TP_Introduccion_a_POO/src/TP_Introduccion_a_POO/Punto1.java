/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Estudiante e = new Estudiante();
      
      e.setNombre("Joaquin");
      e.setApellido("Villarruel");
      e.setCurso("1er Año");
      e.setNota(10);
      
      e.mostrarInfo();
      e.bajarCalificacion(5);
      e.mostrarInfo();
      e.subirCalificacion(3.5);
      e.mostrarInfo();
      
    }
    
}
