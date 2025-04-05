package Main;

import java.util.List;

public class Unidad {
    private String id;
    private String nombre;
    private String email;
    private String password; // Hash
    private Boolean premium;
    private List<String> hash; // Main.Lista de hashes?
    private List<Object> inventario; // Tipo de inventario no especificado

    // Métodos
    public void setualStarStats() {
        // Implementación no especificada en el diagrama
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public List<String> getHash() {
        return hash;
    }

    public void setHash(List<String> hash) {
        this.hash = hash;
    }

    public List<Object> getInventario() {
        return inventario;
    }

    public void setInventario(List<Object> inventario) {
        this.inventario = inventario;
    }
}
