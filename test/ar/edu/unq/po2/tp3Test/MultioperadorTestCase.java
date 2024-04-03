package ar.edu.unq.po2.tp3Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTestCase {

	//Declaracion de variables
	private Multioperador multioperador;

	@BeforeEach
	public void setUp() {
		//Asignacion de valor (INSTANCIAR VARIABLES)
		//usa el constructor de la clase Multioperador.
		this.multioperador = new Multioperador(5); //Constructor, new. new crea un objeto, una instancia de la clase.
		//int[] numeros = new int[5];
		
		//numeros a agregar.
		int[] numerosAgregados = {10, 20, 30, 40, 50};
		multioperador.agregarNumeros(numerosAgregados);
	}
	
	@Test
	public void dimensionDeArrays() {
		assertEquals(multioperador.dimension(), 5);
	}
	
}
