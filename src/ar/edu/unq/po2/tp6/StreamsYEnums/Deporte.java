package ar.edu.unq.po2.tp6.StreamsYEnums;

public enum Deporte {

	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(2), JABALINA(2);
	
	private int complejidad;
	
	Deporte(int complejidad){
		this.complejidad = complejidad;
	}
	
	public int getComplejidad() {
		return complejidad;
	}
}
