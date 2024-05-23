package ar.edu.unq.po2.tp7Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.nio.file.DirectoryStream.Filter;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//import java.util.stream.Stream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.ActividadSemanal;
import ar.edu.unq.po2.tp7.Deporte;
import ar.edu.unq.po2.tp7.DiaDeLaSemana;
import ar.edu.unq.po2.tp7.Municipio;

public class MunicipioTestCase {

	private ActividadSemanal actividad1;
	private ActividadSemanal actividad2;
	private ActividadSemanal actividad3;
	private Municipio municipioDeBerazategui;

	
	@BeforeEach
	public void setUp() {
		actividad1 = new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(9, 0), Duration.ofHours(2), Deporte.FUTBOL, 2500);
		actividad2 = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(9, 0), Duration.ofHours(2), Deporte.BASKET, 2500);
		actividad3 = new ActividadSemanal(DiaDeLaSemana.MARTES, LocalTime.of(18, 0), Duration.ofHours(2), Deporte.FUTBOL, 2500);
		
		//new ArrayList<> para modificar a futuro, si no lo pongo no puedo cambiar o borrar ni activ 1 ni nunguna de estas.
		ArrayList<ActividadSemanal> actividades = new ArrayList<>(Arrays.asList(actividad1, actividad2, actividad3));
		municipioDeBerazategui = new Municipio(actividades);
	}
	
	@Test
	public void todasLasActividadesDeFutbol() {	
		for (ActividadSemanal actividad : municipioDeBerazategui.getActividadesDeFutbol()){
			assertEquals(actividad.getDeporte(), Deporte.FUTBOL);;
		}
		System.out.println(municipioDeBerazategui.getActividadesDeFutbol().toString());
		
		// Crear lista de actividades
		//List<ActividadSemanal> actividades = Arrays.asList(actividad1, actividad2, actividad3);
		// Filtrar actividades de FUTBOL
		//Stream<ActividadSemanal> streamActividades = actividades.stream().filter(actividad -> actividad.esDeporte(Deporte.FUTBOL));
		//assertTrue(streamActividades.allMatch(actividad -> actividad.getDeporte() == Deporte.FUTBOL));
	}
	
	@Test
	public void actividadesPorComplejidad() {
		/*for (ActividadSemanal actividad : municipioDeBerazategui.getActividadesDeFutbol()){
			assertEquals(actividad.getDeporte().getComplejidad(), 2);
		}*/
		Stream <ActividadSemanal> stream = municipioDeBerazategui.getActividadesDeComplejidad(2).stream();
		assertTrue(stream.allMatch(actividad -> (actividad.getDeporte()).getComplejidad() == 2));
	}
	
	@Test
	public void cantHorasSemanalesDelMunicipio() {
		assertEquals(municipioDeBerazategui.getCantHorasTotalesDeActividadesSemanales(), 6);
		System.out.println(municipioDeBerazategui.getCantHorasTotalesDeActividadesSemanales());
	}
	
}
