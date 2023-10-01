package com.mycompany.proyecto1;

import java.util.ArrayList;

// clase controladora
public class Recetario {
    private ArrayList<Receta> recetas;

    public Recetario() {
        this.recetas = new ArrayList<>();
    }
    
    private Receta obtenerReceta(int codigo){
        int indice = codigo - 1;
        if(indice >= 0 && indice < recetas.size()){
            return recetas.get(indice);
        }
        return null;
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
            recetas.remove(codigoReceta);
        }
    }
    
}
