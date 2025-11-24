/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_figura;

/**
 *
 * @author Joaquin
 */
public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14 * radio * radio;
    }
}
