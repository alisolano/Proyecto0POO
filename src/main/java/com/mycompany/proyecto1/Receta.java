package com.mycompany.proyecto1;

public class Receta { // clase receta con sus atributos
    private String nombre;
    public static int consecutivo = 0;
    private int codigo;
    private float duracion;
    private float porcion;
    private String etiqueta;
    private Dificultad dificultad;

    public Receta(String nombre, float duracion, float porcion, String etiqueta, Dificultad dificultad) {
        consecutivo++;
        this.nombre = nombre;
        this.codigo = consecutivo;
        this.duracion = duracion;
        this.porcion = porcion;
        this.etiqueta = etiqueta;
        this.dificultad = dificultad;
    }
    
    public void editarReceta(String nombre, float duracion, float porcion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.porcion = porcion;
        
    
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    public String toString(){
        return "Nombre: " + nombre + " " +
                "Duración: " + duracion + " " + 
                "Porción: " + porcion + " " + 
                "Dificultad: " + dificultad ;
    }
}
