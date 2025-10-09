/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto12;

/**
 *
 * @author Joaquin
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        // Ejemplo simple: mostrar el monto y a quién pertenece
        System.out.println(
            "Calculando impuesto de $" + impuesto.getMonto() + " para " + impuesto.getContribuyente().getNombre() + " CUIL " + impuesto.getContribuyente().getCuil());    
}}
