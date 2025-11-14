/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso3;

/**
 *
 * @author Joaquin
 */
public class Caso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Profesor p1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P3", "María Gómez", "Bases de Datos");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Programación II");
        Curso c4 = new Curso("C4", "Bases de Datos");
        Curso c5 = new Curso("C5", "Redes");

  
        Universidad utn = new Universidad("UTN");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);


        utn.asignarProfesorACurso("C1", "P1");
        utn.asignarProfesorACurso("C2", "P2");
        utn.asignarProfesorACurso("C3", "P2");
        utn.asignarProfesorACurso("C4", "P3");
        utn.asignarProfesorACurso("C5", "P3");

   
        utn.listarCursos();
        utn.listarProfesores();
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();


        System.out.println("\nCambio de profesor: curso C3 pasa a P3");
        utn.asignarProfesorACurso("C3", "P3");
        utn.listarCursos();
        p2.listarCursos();
        p3.listarCursos();


        System.out.println("\nEliminar curso C1");
        utn.eliminarCurso("C1");
        utn.listarCursos();
        p1.listarCursos();


        System.out.println("\nEliminar profesor P3");
        utn.eliminarProfesor("P3");
        utn.listarProfesores();
        utn.listarCursos(); 


        utn.reporteCursosPorProfesor();
    }
    
}
