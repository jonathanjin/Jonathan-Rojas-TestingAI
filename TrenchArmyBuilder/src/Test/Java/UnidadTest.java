package Test.Java;

import Main.Unidad;

import static junit.framework.TestCase.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;


public class UnidadTest {

    @Test
    public void testUnidadGettersAndSetters() {
        Unidad unidad = new Unidad();

        // Test básico de getters y setters
        unidad.setId("1L");
        unidad.setNombre("Usuario Ejemplo");
        unidad.setEmail("usuario@ejemplo.com");
        unidad.setPassword("hash123");
        unidad.setPremium(true);
        List<String> hashes = Arrays.asList("hash1", "hash2");
        unidad.setHash(hashes);
        List<Object> inventario = Arrays.asList("item1", "item2");
        unidad.setInventario(inventario);

        assertEquals("1L", unidad.getId());
        assertEquals("Usuario Ejemplo", unidad.getNombre());
        assertEquals("usuario@ejemplo.com", unidad.getEmail());
        assertEquals("hash123", unidad.getPassword());
        assertTrue(unidad.isPremium());
        assertEquals(hashes, unidad.getHash());
        assertEquals(inventario, unidad.getInventario());
    }


    @Test
    public void testUnidadDefaultValues() {
        Unidad unidad = new Unidad();

        assertNull(unidad.getId());
        assertNull(unidad.getNombre());
        assertNull(unidad.getEmail());
        assertNull(unidad.getPassword());
        assertNull(unidad.isPremium());
        assertNull(unidad.getHash());
        assertNull(unidad.getInventario());
    }
}