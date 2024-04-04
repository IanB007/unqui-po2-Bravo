package ar.edu.unq.po2.tp3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class RectanguloTestCase {

	private Rectangulo rectangulo1;
	private Rectangulo rectangulo2;
	private Point esquinaSuperiorIzquierda1;
	private Point esquinaSuperiorIzquierda2;
	
	
	@BeforeEach
	private void setUp() {	
		esquinaSuperiorIzquierda1 = new Point(4, 8);
		esquinaSuperiorIzquierda2 = new Point(20, 5);
		rectangulo1 = new Rectangulo(esquinaSuperiorIzquierda1, 2, 5); //horizontal
		rectangulo2 = new Rectangulo(esquinaSuperiorIzquierda2, 8, 3); //vertical
	}
	
	@Test
	public void creacionDeRectangulo() {
		assertEquals(rectangulo1.obtenerEsquinaInicial(), esquinaSuperiorIzquierda1);
		assertEquals(rectangulo1.obtenerAlto(), 2);
		assertEquals(rectangulo1.obtenerAncho(), 5);
	}
	
	@Test
	public void creacionDeFalsoRectangulo() {
		
		//Throwable o Exception? Throwable es la superclase de todas las excepciones pero es mejor exception?
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangulo(esquinaSuperiorIzquierda1, 2, 2); //assertThrows
		});
		
		assertEquals(exception.getMessage(), "La altura y el ancho no pueden ser iguales ya que es un rectangulo");
	}
	
	@Test
	public void calcularArea() {
		assertEquals(rectangulo1.obtenerArea(), 10);
	}
	
	@Test
	public void calcularPerimetro() {
		assertEquals(rectangulo1.obtenerPerimetro(), 14);
	}
	
	@Test
	public void esRectanguloHorizontal() {
		assertEquals(rectangulo1.esHorizontal(), true);
		assertEquals(rectangulo2.esHorizontal(), false);
	}
}
