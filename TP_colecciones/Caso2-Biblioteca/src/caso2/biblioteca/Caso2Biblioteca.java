/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class Caso2Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

       
        Autor a1 = new Autor("A1", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Alejandra Pizarnik", "Argentina");

       
        biblio.agregarLibro("ISBN-001", "Rayuela", 1963, a1);              
        biblio.agregarLibro("ISBN-002", "Final del juego", 1956, a1);      

        biblio.agregarLibro("ISBN-003", "El Aleph", 1949, a2);             
        biblio.agregarLibro("ISBN-004", "Ficciones", 1944, a2);            

        biblio.agregarLibro("ISBN-005", "Árbol de Diana", 1962, a3);       

       
        System.out.println("Listado de libros:");
        biblio.listarLibros();

        
        System.out.println("Buscar libro ISBN-003:");
        Libro encontrado = biblio.buscarLibroPorIsbn("ISBN-003");
        if (encontrado != null) encontrado.mostrarInfo();
        else System.out.println("No encontrado.");

        
        System.out.println("Libros publicados en 1944:");
        ArrayList<Libro> porAnio = biblio.filtrarLibrosPorAnio(1944);
        Biblioteca.imprimirLista(porAnio, "Año 1944");

        
        System.out.println("Eliminar ISBN-002 y listar restantes:");
        boolean elimino = biblio.eliminarLibro("ISBN-002");
        System.out.println("Eliminado: " + elimino);
        biblio.listarLibros();

  
        System.out.println("Cantidad total de libros: " + biblio.obtenerCantidadLibros());

        System.out.println("Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
    
}
