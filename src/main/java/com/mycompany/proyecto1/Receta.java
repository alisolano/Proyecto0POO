package com.mycompany.proyecto1;

public class Receta { // clase receta con sus atributos
    private String nombre;
    public static int consecutivo = 0;
    private int codigo;
    private Tiempo tiempo;
    private float porcion;
    private String etiqueta;
    private Dificultad dificultad;

    public Receta(String nombre, Tiempo tiempo, float porcion, String etiqueta, Dificultad dificultad) {
        consecutivo++;
        this.nombre = nombre;
        this.codigo = consecutivo;
        this.tiempo = tiempo; 
        this.porcion = porcion;
        this.etiqueta = etiqueta;
        this.dificultad = dificultad;
    }
    
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setDuracion(Tiempo nuevaDuracion) {
        this.tiempo = nuevaDuracion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Tiempo getDuracion() {
        return tiempo;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }
    
    public void setPorcion(float nuevaPorcion) {
        this.porcion = nuevaPorcion;
    }

    public void setEtiqueta(String nuevaEtiqueta) {
        this.etiqueta = nuevaEtiqueta;
    }

    public void setDificultad(Dificultad nuevaDificultad) {
        this.dificultad = nuevaDificultad;
    }
    
    public String toString(){
        return "Nombre: " + nombre + " " +
                ", Duración: " + tiempo + " " + 
                ", Porción: " + porcion + " " +
                ", Codigo: " + codigo +
                ", Dificultad: " + dificultad ;
    }
}
