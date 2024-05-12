package ar.edu.unq.po2.tp7Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Color;

public class ColorTestCase {
	
	@Test
	public void getDescripcion() {
		assertEquals(Color.ROJO.getDescripcion(), "Prestar atencion esta en rojo!");
	}
	
	@Test
	public void getRiesgo() {
		assertEquals(Color.MIEL.getRiesgo(), "Riesgo bajo");
	}
	
	@Test
	public void getSiguienteColor() {
		assertEquals(Color.AMARILLO.getSiguienteColor(), "miel");
	}
}
