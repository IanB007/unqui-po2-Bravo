package ar.edu.unq.po2.tp6Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import as.edu.unq.po2.tp6.Doubles.Carta;
import as.edu.unq.po2.tp6.Doubles.PokerStatus;
import static org.mockito.Mockito.*;


public class PokerStatusTestCase {

	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	
	//SET UP
	@BeforeEach
	public void setUp() {
		pokerStatus = mock(PokerStatus.class);
	}
	
	//EXCERCISE Y VERIFY
	@Test
	public void verificarSiEsPokerTrue() {
		carta1 = new Carta("4C");
		carta2 = new Carta("JP");
		carta3 = new Carta("4C");
		carta4 = new Carta("4T");
		carta5 = new Carta("4T");
		when(pokerStatus.esPoker(carta1, carta2, carta3, carta4, carta5)).thenReturn(true);
		assertTrue(pokerStatus.esPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	//EXCERCISE Y VERIFY
	@Test
	public void verificarSiEsPokerFalse() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4C");
		carta3 = new Carta("4C");
		carta4 = new Carta("5T");
		carta5 = new Carta("QT");
		when(pokerStatus.esPoker(carta1, carta2, carta3, carta4, carta5)).thenReturn(false);
		assertFalse(pokerStatus.esPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void verificarSiEsColorTrue() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		carta3 = new Carta("4P");
		carta4 = new Carta("QP");
		carta5 = new Carta("10P");
		when(pokerStatus.esColor(carta1, carta2, carta3, carta4, carta5)).thenReturn(true);
		assertTrue(pokerStatus.esColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void verificarSiEsColorFalse() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		carta3 = new Carta("4C");
		carta4 = new Carta("QP");
		carta5 = new Carta("10D");
		when(pokerStatus.esColor(carta1, carta2, carta3, carta4, carta5)).thenReturn(false);
		assertFalse(pokerStatus.esColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void verificarSiEsTrioTrue() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		carta3 = new Carta("4C");
		carta4 = new Carta("QP");
		carta5 = new Carta("4D");
		assertTrue(pokerStatus.esTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void verificarSiEsTrioFalse() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		carta3 = new Carta("4C");
		carta4 = new Carta("4P");
		carta5 = new Carta("4D");
		assertFalse(pokerStatus.esTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void verificarSiElValorEsMasGrandeQueTrue() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		assertTrue(pokerStatus.esMayorQue(carta1,carta2));
	}
	
	@Test
	public void verificarSiElValorEsMasGrandeQueFalse() {
		carta1 = new Carta("5P");
		carta2 = new Carta("4P");
		assertFalse(pokerStatus.esMayorQue(carta2,carta1));
	}
	
	//TEARDOWN
    @AfterEach
    public void tearDown() {
        // Realizar acciones de limpieza, liberación de recursos, etc.
        pokerStatus = null; // por ejemplo, aquí se puede liberar la instancia de pokerStatus
    }
}
