/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        if(edad >= 0){
        this.edad = edad;
        }
    }
    
    public void cumplirAnios(){
        edad++;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" - Especie: "+especie+ " - Edad: "+edad);
        
    }
    
    
}
