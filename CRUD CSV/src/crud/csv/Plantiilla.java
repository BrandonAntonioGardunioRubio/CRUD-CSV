
package crud.csv;


public class Plantiilla {
    private int idPlantilla;
    private String nombre;
    private String descripcion;
    private String agente;

    public Plantiilla() {
    }

    public Plantiilla(int idPlantilla, String nombre, String descripcion, String agente) {
        this.idPlantilla = idPlantilla;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.agente = agente;
    }

    public int getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(int idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }
    
}
