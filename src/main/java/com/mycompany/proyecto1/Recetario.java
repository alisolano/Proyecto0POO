package com.mycompany.proyecto1;

import java.util.ArrayList;

// clase controladora
public class Recetario {
    private ArrayList<Receta> recetas;
    private ArrayList<Utensilio> utensilios;
    private ArrayList<Ingrediente> ingredientes;
    
    public Recetario() {
        this.recetas = new ArrayList<>();
        this.utensilios = new ArrayList<>();
    }
    
    private Utensilio obtenerUtensilio (int codigo){
        int indice = codigo - 1;
        if(indice >= 0 && indice < utensilios.size()){
            return utensilios.get(indice);
        }
        return null;        
    }
    private Receta obtenerReceta(int codigo){
        int indice = codigo - 1;
        if(indice >= 0 && indice < recetas.size()){
            return recetas.get(indice);
        }
        return null;
    }
    
    public ArrayList<String> verListaUtensilio(){
        ArrayList<String> listaUtensilios = new ArrayList<>();
        for (Utensilio u : utensilios){
            String uStr = u.toString();
            listaUtensilios.add(uStr);
        }
        return listaUtensilios;
    }
    
    public void agregarUtensilio(String nombre){
        Utensilio utensilioNuevo = new Utensilio(nombre);
        utensilios.add(utensilioNuevo);
    }
    
    public void eliminarUtensilio(int codigoUtensilio){
        Utensilio utensilio = obtenerUtensilio(codigoUtensilio);
        if (utensilio == null){
            System.out.println("Utensilio ingresado no existe");
        } else {
            int utensilioRemover = codigoUtensilio - 1;
            recetas.remove(utensilioRemover);
        }
    }
    
    
    public void agregarReceta(String nombre, float duracion, float porcion, String etiqueta, Dificultad dificultad){
        Receta recetaNueva = new Receta(nombre, duracion, porcion, etiqueta, dificultad);
        recetas.add(recetaNueva);
    }
    
    public ArrayList<String> verListaRecetas(){
        ArrayList<String> listaRecetas = new ArrayList<>();
        for (Receta r : recetas){

            String recetaStr = r.toString();
            listaRecetas.add(recetaStr);
        }
        return listaRecetas;
    }
    
    public String verReceta (int codigoReceta) {
        Receta receta = obtenerReceta(codigoReceta);
        if (receta == null){
            System.out.println("Receta ingresada no existe");
        }
        String recetaInfo = receta.toString();
        return recetaInfo;
    }
    
    public void borrarReceta(int codigoReceta){
        Receta receta = obtenerReceta(codigoReceta);
        if (receta == null){
            System.out.println("Receta ingresada no existe");
        } else {
            int recetaEliminar = codigoReceta - 1;
            recetas.remove(recetaEliminar);
        }
    }
    
    public void agregarIngrediente(String nombre) {
        Ingrediente miIngrediente = new Ingrediente(nombre);
        ingredientes.add(miIngrediente); 
    }
    
        
    public Ingrediente obtenerIngrediente(int codigo) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getCodigo() == codigo) {
                return ingrediente; 
            }
        }
        return null; 
    }
    
    public String verIngrediente (int codigoIngrediente) {
        Ingrediente ingrediente = obtenerIngrediente(codigoIngrediente);
        if (ingrediente == null){
            System.out.println("Receta ingresada no existe");
        }
        String ingredienteInfo = ingrediente.toString();
        return ingredienteInfo;
    }
    
    public ArrayList<String> verListaIngredientes() {
        ArrayList<String> listaIngredientes = new ArrayList<>();
        for (Ingrediente ingrediente : ingredientes) {
            listaIngredientes.add(ingrediente.toString());
        }
        return listaIngredientes;
    }
     
    public void eliminarIngrediente(int codigoIngrediente){
        Ingrediente ingrediente = obtenerIngrediente(codigoIngrediente);
        if (ingrediente == null){
            System.out.println("Ingrediente ingresada no existe");
        } else {
            ingredientes.remove(codigoIngrediente);
        }
    }
    
}
