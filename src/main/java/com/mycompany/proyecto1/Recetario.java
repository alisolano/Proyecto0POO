package com.mycompany.proyecto1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Descripción: La clase Recetario es la clase controladora posee 
//relaciones de composición múltiple con las clases Recta, Utensilio y Ingrediente. 
//Esta clase se encarga de controlar toda la lógica que se desarrolla en el modelo.

public class Recetario {
    
    private static Recetario Instancia; // Esto lo cree para poder acceder a los metodos de recetario desde las interfaces graficas
    
    private ArrayList<Receta> recetas;
    private ArrayList<Utensilio> utensilios;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<String> etiquetas = new ArrayList<>();
    
    public Recetario() {
        this.recetas = new ArrayList<>();
        this.utensilios = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.etiquetas = new ArrayList<>();
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
    
    
    public void agregarReceta(String nombre, Tiempo tiempo, float porcion, String etiqueta, Dificultad dificultad, String procedimiento, List utensilio, List ingrediente){
        Receta recetaNueva = new Receta(nombre, tiempo, porcion, etiqueta, dificultad, procedimiento, utensilio, ingrediente);
        recetas.add(recetaNueva);
        etiquetas.add(etiqueta);
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
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
    
    public String verRecetaDetalles (int codigoReceta) {
        Receta receta = obtenerReceta(codigoReceta);
        if (receta == null){
            System.out.println("Receta ingresada no existe");
        }
        String recetaInfo = receta.detalles();
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
        
    public ArrayList<Receta> filtrarRecetas(Tiempo duracion, Dificultad dificultad, String etiqueta) {
        ArrayList<Receta> recetasFiltradas = new ArrayList<>();
        for (Receta r : recetas) {
            //ver si cumple los requisitos
            if (r.getDuracion() == duracion && r.getDificultad() == dificultad && r.getEtiqueta().equals(etiqueta)) {
                recetasFiltradas.add(r);
            }
        }
        return recetasFiltradas;
    }
    
    public ArrayList<Receta> ordenarRecetas;
  
    
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

    
    public void editarReceta(int codigo, String nuevoNombre, Tiempo nuevaDuracion, float nuevaPorcion, String nuevaEtiqueta, Dificultad nuevaDificultad, String nuevoProcedimiento, List utensilio, List ingrediente) {
        Receta receta = obtenerReceta(codigo);
        if (receta != null) {
            receta.setNombre(nuevoNombre);
            receta.setDuracion(nuevaDuracion);
            receta.setPorcion(nuevaPorcion);            
            receta.setEtiqueta(nuevaEtiqueta);
            receta.setDificultad(nuevaDificultad);
            receta.setProcedimiento(nuevoProcedimiento);
            receta.setUtensilio(utensilio);
            receta.setIngrediente(ingrediente);
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
    public Recetario CargarDatos() throws IOException, ClassNotFoundException{
        
        try {
            ObjectInputStream lecturaRecetas = new ObjectInputStream(new FileInputStream("recetas.dat") );
            ObjectInputStream lecturaUtensilios = new ObjectInputStream(new FileInputStream("utensilios.dat") );
            ObjectInputStream lecturaIngredientes = new ObjectInputStream(new FileInputStream("ingredientes.dat") );
            
            this.recetas = (ArrayList <Receta>)lecturaRecetas.readObject();
            this.utensilios = (ArrayList <Utensilio>)lecturaUtensilios.readObject();
            this.ingredientes = (ArrayList <Ingrediente>)lecturaIngredientes.readObject();
            
            lecturaRecetas.close();
            lecturaUtensilios.close();
            lecturaIngredientes.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recetario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    
    public Utensilio getUtensilio(int index) {
        if (index >= 0 && index < utensilios.size()) {
            return utensilios.get(index);
        }
        return null; // Devuelve null si el índice está fuera de rango
    }
    
    public Ingrediente getIngrediente(int index) {
        if (index >= 0 && index < ingredientes.size()) {
            return ingredientes.get(index);
        }
        return null; // Devuelve null si el índice está fuera de rango
    }
    
    public boolean isDisponibleUtensilio(Utensilio utensilio) {
        if (utensilio != null) {
            return utensilio.isDisponibleUtensilio();
        }
        return false; // Devuelve false si el utensilio es nulo
    }
    
    public boolean isDisponibleIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null) {
            return ingrediente.isDisponibleIngrediente();
        }
        return false; // Devuelve false si el utensilio es nulo
    }
    
    public void GuardarDatos(){
        try {
            ObjectOutputStream escrituraRecetas = new ObjectOutputStream(new FileOutputStream("recetas.dat") );
            ObjectOutputStream escrituraUtensilios = new ObjectOutputStream(new FileOutputStream("utensilios.dat") );
            ObjectOutputStream escrituraIngredientes = new ObjectOutputStream(new FileOutputStream("ingredientes.dat") );
            
            escrituraRecetas.writeObject(recetas);
            escrituraUtensilios.writeObject(utensilios);
            escrituraIngredientes.writeObject(ingredientes);
            
            escrituraRecetas.flush();
            escrituraUtensilios.flush();
            escrituraIngredientes.flush();
            
            escrituraRecetas.close();
            escrituraUtensilios.close();
            escrituraIngredientes.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recetario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Recetario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public ArrayList<Utensilio> getUtensilios() {
        return utensilios;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
 
    
     @Override
    public String toString(){
        String res = "";
        res+="-Recetas-\n";
        for(Receta receta:this.recetas){
            res+=receta.toString()+"\n";
        }
        res+="-Utensilios-\n";
        for(Utensilio utensilio:this.utensilios){
            res+=utensilio.toString()+"\n";
        }
        res+="-Ingredientes-\n";
        for(Ingrediente ingrediente:this.ingredientes){
            res+=ingrediente.toString()+"\n";
        }
        
        
        
        return res;
        
    }
    
}
