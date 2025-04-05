package Main;

public class UnidadEnLista {
    private Unidad unidad;
    private int cantidad;
    private int numberPercentibodies; // Nombre de campo poco claro
    private String equipcExtra; // Posiblemente "equipoExtra" con typo

    // Getters y Setters
    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumberPercentibodies() {
        return numberPercentibodies;
    }

    public void setNumberPercentibodies(int numberPercentibodies) {
        this.numberPercentibodies = numberPercentibodies;
    }

    public String getEquipcExtra() {
        return equipcExtra;
    }

    public void setEquipcExtra(String equipcExtra) {
        this.equipcExtra = equipcExtra;
    }
}