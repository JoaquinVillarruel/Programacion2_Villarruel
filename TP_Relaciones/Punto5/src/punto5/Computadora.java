/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5;

/**
 *
 * @author Joaquin
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placamadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacamadre() {
        return placamadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "marca=" + marca + " - numeroSerie: " + numeroSerie + " - placamadre: " + placamadre + " - propietario: " + propietario;
    }
    
    
    
    
}
