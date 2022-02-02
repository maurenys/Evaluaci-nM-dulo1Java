package testUnitarios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import delivery.Persona;
import delivery.Trabajador;

class TrabajadorTest {

	@Test
	void testNombre() {
		assertEquals("Maria", new delivery.Trabajador("25.262.517-8", "Maria", "maria.p@gmail.com", "Arturo Prat 413", 4, "Repartidora").getNombre());
	}

	
	
	
}
