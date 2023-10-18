package com.mycompany.proyecto1;

public class Receta { // clase receta con sus atributos
    private String nombre;
    public static int consecutivo = 0;
    private int codigo;
    private Tiempo tiempo;
    private float porcion;
    private String etiqueta;
    private Dificultad dificultad;
    private String procedimiento;

    public Receta(String nombre, Tiempo tiempo, float porcion, String etiqueta, Dificultad dificultad, String procedimiento) {
        consecutivo++;
        this.nombre = nombre;
        this.codigo = consecutivo;
        this.tiempo = tiempo; 
        this.porcion = porcion;
        this.etiqueta = etiqueta;
        this.dificultad = dificultad;
        this.procedimiento = procedimiento;
    }
    
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void setProcedimiento(String nuevoProcedimiento) {
        this.procedimiento = nuevoProcedimiento;
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
    
    public int getCodigo() {
        return codigo;
    }
    
    public float getPorcion() {
        return porcion;
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
        return "Nombre: " + nombre + " \n" +
                ", Duración: " + tiempo + " \n" + 
                ", Porción: " + porcion + " \n" +
                ", Codigo: " + codigo + " \n" +
                ", Dificultad: " + dificultad ;
    }
    
    public String detalles() {
        return "- Nombre: " + nombre + " \n \n" +
                "- Duración: " + tiempo + " \n \n" + 
                "- Porción: " + porcion + " \n \n" +
                "- Codigo: " + codigo + " \n \n" +
                "- Dificultad: " + dificultad  + " \n\n" +
                "- Procedimiento: " + procedimiento ;
        
    }
}
