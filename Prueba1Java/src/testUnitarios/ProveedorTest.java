package testUnitarios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ProveedorTest {


	@Test
	void testNombre() {
		assertEquals("10.024.517-0", new delivery.Proveedor("10.024.517-0", "Mercado Central").getRutProveedor());
	}




}
