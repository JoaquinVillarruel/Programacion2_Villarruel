/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehículos;

/**
 *
 * @author Joaquin
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+" Modelo: "+modelo+" Puertas: "+cantidadPuertas);
    }
    
    
    
    
}
