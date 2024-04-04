package ar.edu.unq.po2.tp3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

public class PointTestCase {
	
	//Declaracion de variables
	private Point pointSinCordenadas;
	private Point pointConCoordenadas;
	//Es necesario?
	private Point nuevoPunto;
	
	@BeforeEach
	public void setUp() {
		this.pointSinCordenadas = new Point();
		//Point point = new Point()
		this.pointConCoordenadas = new Point(2, 5);
		this.nuevoPunto = new Point(8,7);
	}
	
	//hace falta this?
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
	
	@Test
	public void moverPuntoAOtraPosicion() {
		// Point nuevoPunto = new Point(8,7); PREGUNTAR SI SE PODRIA POENER ACA Y NO EN SET UP O DECLARACION DE VARAIBLES.
		this.pointConCoordenadas.moverAPunto(nuevoPunto);
		assertEquals(this.pointConCoordenadas.getX(), 8);
		assertEquals(this.pointConCoordenadas.getY(), 7);
	}
	
	@Test
	public void sumadoDePuntos() {
		this.pointConCoordenadas.sumarConPunto(nuevoPunto);
		assertEquals(this.pointConCoordenadas.getX(), 10);
		assertEquals(this.pointConCoordenadas.getY(), 12);
	}
}
