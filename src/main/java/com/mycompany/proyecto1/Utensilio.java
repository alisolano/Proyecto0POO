package com.mycompany.proyecto1;


public class Utensilio {
    private String nombre;
    public static int consecutivo = 0;
    private int codigo;
    private boolean disponibilidad;

    public Utensilio(String nombre) {
        this.nombre = nombre;
        consecutivo++;
        this.codigo = consecutivo;
        this.disponibilidad = true; 
    }
    
    public void editarUtensilio(String nombre){
        this.nombre = nombre;
    }
    
    public boolean verDisponibilidad(){
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public String toString(){
        return "Nombre: " + nombre + 
                "Disponibilidad: " + disponibilidad;
    }
}
