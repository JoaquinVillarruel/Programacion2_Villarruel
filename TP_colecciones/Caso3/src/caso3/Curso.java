/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

/**
 *
 * @author Joaquin
 */
public class Curso {
 private String codigo;
    private String nombre;
    private Profesor profesor;  

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
  
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }


        this.profesor = p;

    
        if (p != null) {
            boolean yaEsta = false;
            for (Curso c : p.getCursos()) {
                if (c.getCodigo().equals(this.codigo)) {
                    yaEsta = true;
                    break;
                }
            }
            if (!yaEsta) {
                p.agregarCurso(this);
            }
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "(sin profesor)";
        System.out.println("Curso{codigo='" + codigo + "', nombre='" + nombre +
                "', profesor=" + nombreProfesor + "}");
    }   
}
