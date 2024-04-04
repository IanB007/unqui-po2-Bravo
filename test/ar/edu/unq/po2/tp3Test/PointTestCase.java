package ar.edu.unq.po2.tp3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

public class PointTestCase {
	
	//Declaracion de variables
	private Point pointSinCordenadas;
	private Point pointConCoordenadas;
	
	@BeforeEach
	public void setUp() {
		this.pointSinCordenadas = new Point();
		//Point point = new Point()
		this.pointConCoordenadas = new Point(2, 5);
	}
	
	@Test
	public void creacionDePuntoSinCoordenadas() {
		assertEquals(this.pointSinCordenadas.getX(), 0);
		assertEquals(this.pointSinCordenadas.getY(), 0);
	}
	
	@Test
	public void creacionDePuntoConCoordenadas() {
		assertEquals(this.pointConCoordenadas.getX(), 2);
		assertEquals(this.pointConCoordenadas.getY(), 5);
	}
}
