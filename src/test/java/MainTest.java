import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSeleccionDeAuto() {
        Vehiculo mercedes = Main.seleccionDeAuto(1);
        assertEquals("Auto", mercedes.getVehiculo());
        assertEquals(80, mercedes.getVelocidad());

        Vehiculo kawasaki = Main.seleccionDeAuto(2);
        assertEquals("Motocicleta", kawasaki.getVehiculo());
        assertEquals(100, kawasaki.getVelocidad());

        Vehiculo trek = Main.seleccionDeAuto(3);
        assertEquals("Bicicleta", trek.getVehiculo());
        assertEquals(15, trek.getVelocidad());
    }
    @Test
    public void testCalculoTiempo() {
        int velocidad = 80;
        int distancia = 160;
        int tiempo = Main.calculoTiempo(velocidad, distancia);
        assertEquals(2, tiempo);
    }
    @Test
    public void testNombrePersona() {
        Persona persona1 = Main.crearPersona("Carlos");
        assertEquals("Carlos",persona1.getNombre());

        Persona persona2 = Main.crearPersona("Roberto");
        assertEquals("Roberto",persona2.getNombre());
    }
}