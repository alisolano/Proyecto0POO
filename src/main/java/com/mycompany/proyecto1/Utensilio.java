package com.mycompany.proyecto1;

import java.io.Serializable;
//Descripcion: La clase utensilio siempre necesita una receta, 
//y de esta puede editar, y ver disponibles, esto para luego
//relacionar la clase con su interfaz.

public class Utensilio implements Serializable{
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

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void cambiarDisponibilidad() {
        disponible = !disponible; // Cambia la disponibilidad (true a false o false a true)
    }
    
    public boolean isDisponibleUtensilio() {
        return disponible;
    }
    
    public String toString(){
        return "Nombre: " + nombre +
               ", Codigo: " + codigo +
               ", Disponibilidad: " + (disponible ? "Disponible" : "No disponible");
    }
}
