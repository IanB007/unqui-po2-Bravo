package ar.edu.unq.po2.tp6.StreamsYEnums;

//para el tipo enum se coloca la palabra "enum" seguido del nombre del tipo enum.
public enum Color {
	ROJO("Prestar atencion esta en rojo!", "Riesgo muy alto", "gris"),
	GRIS("atencion esta en griS!", "Riesgo alto", "amarillo"),
	AMARILLO("Ey estas en amarillo!", "Riesgo medio", "miel"),
	MIEL("Estas en miel!", "Riesgo bajo", "rojo");
	
	final String descripcion;
	final String nivelDeRiesgo;
	final String siguienteColor;
	
	Color(String descripcion, String nivelDeRiesgo, String siguienteColor){
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
		this.siguienteColor = siguienteColor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getRiesgo() {
		return nivelDeRiesgo;
	}
	
	public String getSiguienteColor() {
		return siguienteColor;
	}
}
