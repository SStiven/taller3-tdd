package tests;
import principal.Marca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsMarca {

	@Test
	void compruebaElSet() {
		//Given - Arrange
		Marca nueva = new Marca("Samsung");
		
		//When - Act
		nueva.setNombre("LG");
		
		//Then - Assert
		assertEquals("LG", nueva.getNombre());
	}

}
