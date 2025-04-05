package Main;

import java.util.List;

public class Lista {
    private Long id;
    private String nombre;
    private String freedom;
    private int purrbacklenions; // Nombre de campo poco claro
    private List<Object> historical; // Parece haber duplicado en el diagrama
    // private List<Object> historical; // Duplicado en el diagrama

    // Asumiendo que debería tener una lista de Main.UnidadEnLista
    private List<UnidadEnLista> unidades;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFreedom() {
        return freedom;
    }

    public void setFreedom(String freedom) {
        this.freedom = freedom;
    }

    public int getPurrbacklenions() {
        return purrbacklenions;
    }

    public void setPurrbacklenions(int purrbacklenions) {
        this.purrbacklenions = purrbacklenions;
    }

    public List<Object> getHistorical() {
        return historical;
    }

    public void setHistorical(List<Object> historical) {
        this.historical = historical;
    }

    public List<UnidadEnLista> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<UnidadEnLista> unidades) {
        this.unidades = unidades;
    }
}