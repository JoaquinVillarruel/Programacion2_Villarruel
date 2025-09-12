/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota(double nota) {
        if(nota >= 0){
        this.nota = nota;
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" - Apellido: "+apellido+" - Curso: "+curso+" - Nota: "+nota);
        
    }
    
    public void subirCalificacion(double puntos){
        if(puntos > 0){
            nota += puntos;
        }
        
        if(nota > 10){
            nota = 10;
        }
    }
    
    public void bajarCalificacion(double puntos){
        if(puntos > 0){
            nota -= puntos;
        }
        
        if(nota < 0){
            nota = 0;
        }
    }
    
    
    
    
    
}
