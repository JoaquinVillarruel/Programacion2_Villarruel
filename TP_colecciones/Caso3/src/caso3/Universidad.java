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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        boolean repetido = false;
        for (Profesor prof : profesores) {
            if (prof.getId().equals(p.getId())) {
                repetido = true;
                break;
            }
        }
        if (!repetido) {
            profesores.add(p);
        } else {
            System.out.println("Ya existe un profesor con id " + p.getId());
        }
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        boolean repetido = false;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(c.getCodigo())) {
                repetido = true;
                break;
            }
        }
        if (!repetido) {
            cursos.add(c);
        } else {
            System.out.println("Ya existe un curso con código " + c.getCodigo());
        }
    }



    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }



    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null || profesor == null) {
            System.out.println("Curso o profesor no encontrado.");
            return;
        }

        curso.setProfesor(profesor); 
    }


    public void listarProfesores() {
        System.out.println("\nProfesores:");
        if (profesores.isEmpty()) System.out.println("(ninguno)");
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        System.out.println("\nCursos:");
        if (cursos.isEmpty()) System.out.println("(ninguno)");
        for (Curso c : cursos) c.mostrarInfo();
    }


    public boolean eliminarCurso(String codigo) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getCodigo().equals(codigo)) {
                if (c.getProfesor() != null) {
                    c.setProfesor(null);
                }
                cursos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);
            if (p.getId().equals(id)) {
                ArrayList<Curso> copiaCursos = new ArrayList<>(p.getCursos());
                for (Curso c : copiaCursos) {
                    c.setProfesor(null);
                }
                profesores.remove(i);
                return true;
            }
        }
        return false;
    }


    public void reporteCursosPorProfesor() {
        System.out.println("\nReporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }    
}
