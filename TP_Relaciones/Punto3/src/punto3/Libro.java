/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author Joaquin
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setAutor(Autor autor) {
        if (autor == null) throw new IllegalArgumentException("autor no puede ser null");
        this.autor = autor;
    }
    public void setEditorial(Editorial editorial) {
        if (editorial == null) throw new IllegalArgumentException("editorial no puede ser null");
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        return "titulo: " + titulo + " - isbn: " + isbn + " - autor: " + autor + " - editorial: " + editorial;
    }
    
    
    
    
    
}
