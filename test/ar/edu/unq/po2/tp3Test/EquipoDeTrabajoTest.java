package ar.edu.unq.po2.tp3Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona2;

public class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo1;
	private Persona2 persona1;
	private Persona2 persona2;
	ArrayList<Persona2> listaDeIntegrantes;
	
	@BeforeEach
	private void setUp() {
		persona1 = new Persona2("Juan", "Perez", 25);
		persona2 = new Persona2("Roberto", "Sanchez", 32);
		listaDeIntegrantes = new ArrayList<Persona2>();
		listaDeIntegrantes.add(persona1);
		listaDeIntegrantes.add(persona2);
		equipo1 = new EquipoDeTrabajo("abc",listaDeIntegrantes);
	}
	
	@Test
	public void nombreDeEquipo() {
		assertEquals(equipo1.obtenerNombre(), "abc");
	}
	
	@Test
	public void promedioDeEdadDeIntegrantes() {
		assertEquals(equipo1.obtenerPromedioDeEdadDeIntegrantes(), 28.5);
	}
	
}
