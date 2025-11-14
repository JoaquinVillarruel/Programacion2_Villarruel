/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
 public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || titulo == null || autor == null) {
            System.out.println("Datos inválidos para crear libro.");
            return;
        }

      
        boolean repetido = false;
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(nuevo);
        } else {
            System.out.println("Ya existe un libro con ISBN " + isbn);
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("(Biblioteca vacía)");
        } else {
            for (Libro l : libros) {
                l.mostrarInfo();
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> res = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                res.add(l);
            }
        }
        return res;
    }
   
     public void mostrarAutoresDisponibles() {
        ArrayList<String> nombresMostrados = new ArrayList<>();

        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            // evitamos mostrar autores repetidos
            boolean yaMostrado = false;
            for (String n : nombresMostrados) {
                if (n.equalsIgnoreCase(nombreAutor)) {
                    yaMostrado = true;
                    break;
                }
            }
            if (!yaMostrado) {
                l.getAutor().mostrarInfo();
                nombresMostrados.add(nombreAutor);
            }
        }
    }

    
    public static void imprimirLista(ArrayList<Libro> lista, String titulo) {
        System.out.println("\n== " + titulo + " ==");
        if (lista.isEmpty()) System.out.println("(sin resultados)");
        else for (Libro l : lista) System.out.println(l);
    }
}
