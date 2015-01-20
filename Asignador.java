import java.util.ArrayList;

public class Asignador
{
    private ArrayList<String> trabajosAlmacenados; 
    private ArrayList<String> personasAlmacenadas; 
    
    /**
     * Constructor for objects of class Asignador
     */
    public Asignador()
    {
        trabajosAlmacenados = new ArrayList<>();
        personasAlmacenadas = new ArrayList<>();
    }
    
    public void guardarTrabajo(String trabajo)
    {
        trabajosAlmacenados.add(trabajo);
    }
    
    public void guardarPersona(String persona)
    {
        personasAlmacenadas.add(persona);
    }
}
