public class Trabajos
{
    // instance variables
    private String nombre;
    private Asignador asignado;
    /**
     * Constructor for objects of class Trabajos
     */
    public Trabajos(String nombre)
    {
        this.nombre = nombre;
        asignado.guardarTrabajo(nombre);
    }

    /**
     * 
     */
    public String getNombre()
    {
        return nombre;
    }
}
