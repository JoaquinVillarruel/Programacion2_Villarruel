/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        if(idGallina > 0){
        this.idGallina = idGallina;
        }else{
            System.out.println("ID inválido.");
        }
       }

    public void setEdad(int edad) {
        if(edad > 0){
        this.edad = edad;
        }else{
            System.out.println("Edad inválida.");
        }
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("ID gallina: "+idGallina+" - Edad: "+edad+" - Huevos puestos: "+ huevosPuestos);
    }
    
    
    
    
}
