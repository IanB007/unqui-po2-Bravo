package ar.edu.unq.po2.tp3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class RectanguloTestCase {

	
	@BeforeEach
	private void setUp() {
		
	}
	
	@Test
	public void creacionDeRectangulo() {
		Point esquinaSuperiorIzquierda = new Point(4, 5);
		Rectangulo nuevoRectangulo = new Rectangulo(esquinaSuperiorIzquierda, 2, 5);
		assertEquals(nuevoRectangulo.obtenerEsquinaInicial(), esquinaSuperiorIzquierda);
		assertEquals(nuevoRectangulo.obtenerAlto(), 2);
		assertEquals(nuevoRectangulo.obtenerAncho(), 5);
	}
	
	@Test
	public void creacionDeFalsoRectangulo() {
		Point esquinaSuperiorIzquierda = new Point(4, 8);
		
		//Throwable o Exception? Throwable es la superclase de todas las excepciones pero es mejor exception?
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangulo(esquinaSuperiorIzquierda, 2, 2); //assertThrows
		});
		
		assertEquals(exception.getMessage(), "La altura y el ancho no pueden ser iguales ya que es un rectangulo");
	}
}
