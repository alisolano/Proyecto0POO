package com.mycompany.proyecto1;

import java.io.Serializable;
//Descripcion: La clase ingredientes puede puede editar,
//y ver disponibles, esto para luego relacionar la clase con su interfaz. 

public class Ingrediente implements Serializable{
    
    public static int consecutivo = 0;
    private int codigo;
    private String nombre;
    private boolean disponible;
    
    public Ingrediente(String nombre) {
        consecutivo++;
        this.codigo = consecutivo;
        this.nombre = nombre;
        this.disponible = true;
    }
      
    public void editarIngrediente(String nombre, boolean disponibilidad) {
        this.nombre = nombre;
        this.disponible = disponibilidad;
    }
    
    public void verDisponibilidad(String nombre, boolean disponibilidad) {
        
        if (disponibilidad) {
            System.out.println("El ingrediente" + nombre + " esta disponible");
        }
        else {
            System.out.println("El ingrediente" + nombre + "no esta disponible");
        }
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String toString() {
        return 
               "Nombre: " + nombre +
               ", Codigo: " + codigo +
               ", Disponibilidad: " + (disponible ? "Disponible" : "No disponible");
    }
}
