package com.mycompany.proyecto1;
public class Utensilio {
    private String nombre;
    public static int consecutivo = 0;
    private int codigo;
    private boolean disponible;

    public Utensilio(String nombre) {
        this.nombre = nombre;
        consecutivo++;
        this.codigo = consecutivo;
        this.disponible = true; 
    }
    
    public void editarUtensilio(String nombre){
        this.nombre = nombre;
    }
    
    public boolean verDisponibilidad(){
        return disponible;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String toString(){
        return "Nombre: " + nombre +
               ", Codigo: " + codigo +
               ", Disponibilidad: " + (disponible ? "Disponible" : "No disponible");
    }
}
