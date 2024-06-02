package ar.edu.unq.po2.tp6Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import as.edu.unq.po2.tp6.Doubles.PokerStatus;

public class PokerStatusTestCase {

	PokerStatus pokerStatus;
	
	
	//SET UP
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
	}
	
	//EXCERCISE Y VERIFY
	@Test
	public void verificarSiEsPokerTrue() {
		assertTrue(pokerStatus.esPoker("4C","JP","4C","4T","4T"));
	}
	
	//EXCERCISE Y VERIFY
	@Test
	public void verificarSiEsPokerFalse() {
		assertFalse(pokerStatus.esPoker("5P","4C","4C","5T","QT"));
	}
	
	
	//TEARDOWN
    @AfterEach
    public void tearDown() {
        // Realizar acciones de limpieza, liberación de recursos, etc.
        pokerStatus = null; // por ejemplo, aquí se puede liberar la instancia de pokerStatus
    }
}
