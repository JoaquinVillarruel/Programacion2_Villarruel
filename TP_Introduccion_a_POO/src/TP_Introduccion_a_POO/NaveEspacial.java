/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_Introduccion_a_POO;

/**
 *
 * @author Joaquin
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        System.out.println("La nave: "+nombre+" despego con: "+combustible+" Unidades de combustible.");
    }
    
    public void avanzar(int distancia){
        if(distancia >= 0){
            if(combustible >= distancia){
                combustible -= distancia;
                System.out.println("La nave "+nombre+" avanzo "+distancia+" Unidades");
            }else{
                System.out.println("Falta combustible");
            }
        }else{
            System.out.println("Distancia invalida");
        }
    }
    
    public void recargarCombustible(int cantidad){
        if(cantidad > 0){
            if((combustible + cantidad) <= 150){
                combustible += cantidad;
            }else{
                combustible = 150;
            }
        }else{
            System.out.println("La cantidad es invalida");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("La nave "+nombre+" tiene: "+combustible+" unidades de combustible");
    }
    
    
}
