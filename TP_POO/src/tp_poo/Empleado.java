/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_poo;

/**
 *
 * @author Joaquin
 */
import java.util.Random;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private static final Random random = new Random();
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        this(random.nextInt(1000) + 1,nombre, puesto, 700000.0);
    
    }
        
    public void actualizarSalario(int monto){
        this.salario += monto;
    }
        
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100.0);
    }
        
    @Override
    public String toString(){
        return "Empleado: "+ nombre+" - ID: "+id+" - Puesto: "+puesto+" - Salario: "+salario;
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null){
        this.nombre = nombre;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if(nombre != null){
        this.puesto = puesto;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
        this.salario = salario;
        }
    }
    
    
    
    
}
