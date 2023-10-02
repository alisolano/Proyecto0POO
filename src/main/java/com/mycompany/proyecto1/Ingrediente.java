public class Ingrediente {
    
    public static int consecutivo = 0;
    private int codigo;
    private String nombre;
    private boolean disponibilidad;
    
    public Ingrediente(String nombre) {
        consecutivo++;
        this.codigo = consecutivo;
        this.nombre = nombre;
        disponibilidad = true;
    }
      
    public void editarIngrediente(String nombre, boolean disponibilidad) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
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
    
    public String toString() {
        return 
               ", Nombre: " + nombre +
               ", Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible");
    }
}
