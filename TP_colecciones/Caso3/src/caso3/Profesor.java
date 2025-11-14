/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    // agrega el curso a su lista si no estaba
    // (NO toca el profesor del curso; eso lo maneja Curso.setProfesor)
    public void agregarCurso(Curso c) {
        if (c == null) return;
        boolean esta = false;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(c.getCodigo())) {
                esta = true;
                break;
            }
        }
        if (!esta) {
            cursos.add(c);
        }
    }

    // quita el curso de su lista
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equals(c.getCodigo())) {
                cursos.remove(i);
                break;
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Profesor " + nombre + " no dicta cursos.");
        } else {
            System.out.println("Cursos del profesor " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println(" - " + c.getCodigo() + " - " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{id='" + id + "', nombre='" + nombre +
                "', especialidad='" + especialidad +
                "', cantidadCursos=" + cursos.size() + "}");
    }
}
    

