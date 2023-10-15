package com.mycompany.proyecto1;

import java.util.ArrayList;

// clase controladora
public class Recetario {
    
    private static Recetario Instancia; // Esto lo cree para poder acceder a los metodos de recetario desde las interfaces graficas
    
    private ArrayList<Receta> recetas;
    private ArrayList<Utensilio> utensilios;
    private ArrayList<Ingrediente> ingredientes;
    
    public Recetario() {
        this.recetas = new ArrayList<>();
        this.utensilios = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
    }
    
    // Metodo para obtener la instancia unica de recetario, funiona para llamar los metodos en las interfacez
    public static Recetario getInstancia() {
        if (Instancia == null) {
            Instancia = new Recetario();
        }
        return Instancia;
        
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
    
    public void eliminarUtensilio(int codigoUtensilio) {
        Utensilio utensilio = obtenerUtensilio(codigoUtensilio);
        if (utensilio == null) {
            System.out.println("Utensilio ingresado no existe");
        } else {
            utensilios.remove(utensilio);
            System.out.println("Utensilio eliminado con éxito");
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
     
    public void eliminarIngrediente(int codigoIngrediente) {
        Ingrediente ingrediente = obtenerIngrediente(codigoIngrediente);
        if (ingrediente == null) {
            System.out.println("Ingrediente ingresado no existe");
        } else {
            ingredientes.remove(ingrediente);
            System.out.println("Ingrediente eliminado con éxito");
        }
    }
        
    /*
    
    public ArrayList<Receta> filtrarRecetas(float duracion, Dificultad dificultad, String etiqueta) {
        ArrayList<Receta> recetasFiltradas = new ArrayList<>();
        for (Receta r : recetas) {
            //ver si cumple los requisitos
            if (r.getDuracion() <= duracion && r.getDificultad() == dificultad && r.getEtiqueta().equals(etiqueta)) {
                recetasFiltradas.add(r);
            }
        }
        return recetasFiltradas;
    }
    
    public ArrayList<Receta> ordenarRecetas 
    
    */
  
    
    public boolean existeIngrediente(int codigoIngrediente) {
        return obtenerIngrediente(codigoIngrediente) != null;
    }

    public boolean existeReceta(int codigoReceta) {
        return obtenerReceta(codigoReceta) != null;
    }
    
    public boolean existeUtensilio(int codigoUtensilio) {
        return obtenerUtensilio(codigoUtensilio) != null;
    }
    
    
    public void editarIngrediente(int codigoIngrediente, String nuevoNombre, boolean disponible) {
    Ingrediente ingrediente = obtenerIngrediente(codigoIngrediente);
        if (ingrediente != null) {
            ingrediente.setNombre(nuevoNombre);
            ingrediente.setDisponible(disponible);
            System.out.println("Ingrediente editado con éxito");
        } else {
            System.out.println("Ingrediente ingresado no existe");
        }
    }

    
    public void editarReceta(int codigo, String nuevoNombre, float nuevaDuracion, float nuevaPorcion, String nuevaEtiqueta, Dificultad nuevaDificultad) {
        Receta receta = obtenerReceta(codigo);
        if (receta != null) {
            receta.setNombre(nuevoNombre);
            receta.setDuracion(nuevaDuracion);
            receta.setPorcion(nuevaPorcion);
            receta.setEtiqueta(nuevaEtiqueta);
            receta.setDificultad(nuevaDificultad);
            System.out.println("Receta editada con éxito");
        } else {
            System.out.println("Receta ingresada no existe");
        }
    }
    
    
    public void editarUtensilio(int codigoUtensilio, String nuevoNombre, boolean disponible) {
    Utensilio utensilio = obtenerUtensilio(codigoUtensilio);
        if (utensilio != null) {
            utensilio.setNombre(nuevoNombre);
            utensilio.setDisponible(disponible);
            System.out.println("Utensilio editado con éxito");
        } else {
            System.out.println("Utensilio ingresado no existe");
        }
    }
    
}
