/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_poo;

/**
 *
 * @author Joaquin
 */
public class TP_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = new Empleado(1,"Joaquin", "Gerente",800000.0);
        Empleado e2 = new Empleado("Juan","Desarrollador");
        Empleado e3 = new Empleado("David","Soporte");
        
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);
        
        e.actualizarSalario(10.0);
        e3.actualizarSalario(200000);
        
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: "+ Empleado.mostrarTotalEmpleados());
        
        
        
    }
    
}
