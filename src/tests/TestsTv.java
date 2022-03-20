package tests;

import principal.Marca;
import principal.Tv;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestsTv {
	
	private Tv crearTvEncendido() {
		Marca marca = new Marca("LG");
		Tv tv = new Tv(marca, true);
		return tv;
	}
	
	@Test
	void alCrearTvVolmenPorDefectoEs1() {
		//Given
		Tv tv = crearTvEncendido(); 
		
		//When
				
		
		//Then
		assertEquals(1, tv.getVolumen());
	}
	
	@Test
	void alPonerVolumen6SeCambia() {
		//Given
		Tv tv = crearTvEncendido();
		
		//When
		tv.setVolumen(6);
		
		//Then
		assertEquals(6, tv.getVolumen());
	}
	
	@Test
	void cuandoPongoVolumenMenos1NoSeCambia() {
		//Given
		Tv tv = crearTvEncendido();
		tv.setVolumen(3);
		
		//When
		tv.setVolumen(-1);
		
		//Then
		assertEquals(3, tv.getVolumen());
	}
	
	@Test
	void cuandoPongoVolumen9NoSeCambia() {
		//Given
		Tv tv = crearTvEncendido();	
		tv.setVolumen(3);
		
		//When
		tv.setVolumen(9);
		
		//Then
		assertEquals(3, tv.getVolumen());
	}

}
