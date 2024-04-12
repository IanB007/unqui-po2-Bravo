package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {

	//variables de clase.	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	//Asignacion de valor (fecha)
	//String fechaString = "2016-08-16";
	//fecha = LocalDate.parse(fechaString);
	
	public Persona (String nombreDePersona, LocalDate fechaEnLaQueNacio) {
		nombre = nombreDePersona;
		fechaDeNacimiento = fechaEnLaQueNacio;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public LocalDate obtenerFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int obtenerEdad() {
		return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
	}
	
	public boolean menorQue(Persona personaAEvaluar) {
		boolean esMenor = true;
		if (this.obtenerEdad() > personaAEvaluar.obtenerEdad()){
			esMenor = false;
		}
		return esMenor;
	}
}