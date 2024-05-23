package ar.edu.unq.po2.tp7;

import java.time.Duration;
import java.time.LocalTime;

public class ActividadSemanal {
	//Representa las actividades que ofrece la "Secretaria de Deportes del Municipio".
	DiaDeLaSemana dia;
	LocalTime hora;
	Duration duracion;
	Deporte deporte;
	float costo;
	
	//Crea una duracion específica
	//Duration duracion = Duration.ofHours(2).plusMinutes(30).plusSeconds(15);
	
	// Crear una hora específica
	// LocalTime hora = LocalTime.of(10, 30, 0);
	
	
	 // Sumar la duración a la hora
    //LocalTime horaMasDuracion = hora.plus(duracion);
	
	public ActividadSemanal(DiaDeLaSemana dia, LocalTime hora, Duration duracion, Deporte deporte, float costo){
		this.dia= dia;
		this.hora = hora;
		this.duracion = duracion;
		this.deporte = deporte;
		this.costo = costo;
	}

	public boolean esDeporte(Deporte deporte) {
		return this.deporte == deporte;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}
	
	public String toString() {
		int horas = (int) duracion.toHours();
		return "Deporte: " + this.getDeporte() + ". Dia: " + this.dia + " A LAS: " + this.hora + ". Duración: " + horas + " hora(s)";
	}

	public Long ObtenerHorasDeDeporte() {
		return duracion.toHours();
	}
	

}
