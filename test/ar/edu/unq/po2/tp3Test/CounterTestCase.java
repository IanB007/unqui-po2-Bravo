package ar.edu.unq.po2.tp3Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;
import junit.extensions.TestSetup;

class CounterTestCase {

	//Declaracion de variables
	private Counter counter; //es de tipo Counter
	
	//setUp
	@BeforeEach
	public void setUp(){
		//Asignacion de valor (INSTANCIAR VARIABLES)
		counter = new Counter(); // instancio un nuevo Counter.
		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);
		counter.agregarNumero(8700);
		counter.agregarNumero(7777);
	}
	
	
	@Test
	public void testImpares() {
		int cantidad = counter.contarNumerosImpares();
		assertEquals(cantidad, 10);
	}
	
	@Test
	public void testPares() {
		int cantidad = counter.contarNumerosPares();
		assertEquals(cantidad, 2);
	}
	
	@Test
	public void contarMultiplos() {
		int cantidad = counter.contarMultiplos(3);
		assertEquals(cantidad, 3);
	}

	@Test
	public void numeroConMasDigitosPares() {
		int numero = counter.numeroConMasDigitosPares();
		assertEquals(numero, 8700);
	}
	
	@Test
	public void multiploMasAltoEntre0Y1000EntreDosNumeros() {
		int multiploMasAlto = counter.multiploMasAltoEntre0Y1000(3, 9);
		assertEquals(multiploMasAlto, 999);
	}
}















