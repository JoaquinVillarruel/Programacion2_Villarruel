/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_empleados;

/**
 *
 * @author Joaquin
 */
public class Ejercicio_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];
        
        empleados[0] = new EmpleadoPlanta("Juan", 300000);
        empleados[1] = new EmpleadoTemporal("Marcos", 120, 2500);
        empleados[2] = new EmpleadoPlanta("Maria", 280000);
        empleados[3] = new EmpleadoTemporal("Joaquin", 80, 3000);
        
        for(Empleado e : empleados){
            String tipo;
            
            if(e instanceof EmpleadoPlanta){
                tipo = "Empleado de planta";
            }else if (e instanceof EmpleadoTemporal){
                tipo = "Empleado temporal";
            }else{
                tipo = "Otro tipo de empleado";
            }
            
            System.out.println(tipo + " "+e.getNombre()+" Sueldo: "+e.calcularSueldo());
        }
    }
    
    
}
