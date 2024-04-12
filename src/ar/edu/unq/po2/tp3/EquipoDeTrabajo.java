package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombreDeEquipo;
	private ArrayList<Persona2> integrantes;
	
	public EquipoDeTrabajo(String nombreDeEquipo, ArrayList<Persona2> integrantes) {
		this.nombreDeEquipo = nombreDeEquipo;
		this.integrantes = integrantes;
	}

	public Object obtenerNombre() {
		return nombreDeEquipo;
	}

	public double obtenerPromedioDeEdadDeIntegrantes() {
		double promedio = 0;
		for(Persona2 integrante : integrantes) {
			promedio += integrante.obtenerEdad();
		}
		return promedio / integrantes.size();
	}
}
