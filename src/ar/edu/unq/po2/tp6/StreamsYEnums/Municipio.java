package ar.edu.unq.po2.tp6.StreamsYEnums;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Municipio {

	List<ActividadSemanal> actividadesSemanales;
	
	
	//Constructor sin actividades.
	public Municipio(){
		actividadesSemanales = new ArrayList<ActividadSemanal>();
	}
	
	//Constructor con actividades
	public Municipio(ArrayList<ActividadSemanal> actividades){
		actividadesSemanales = actividades;
	}

	public List<ActividadSemanal> getActividadesDeFutbol() {
		Stream<ActividadSemanal> stream = actividadesSemanales.stream();
		return stream.filter(actividadSemanal -> actividadSemanal.esDeporte(Deporte.FUTBOL)).toList();
	}

	public List<ActividadSemanal> getActividadesDeComplejidad(int Complejidad) {
		Stream<ActividadSemanal> stream = actividadesSemanales.stream();
		return stream.filter(actividadSemanal -> actividadSemanal.getDeporte().getComplejidad() == Complejidad).toList();
	}

	 public long getCantHorasTotalesDeActividadesSemanales() {
	        return actividadesSemanales.stream()
	                                  .mapToLong(ActividadSemanal::ObtenerHorasDeDeporte)
	                                  .sum();
	 }
}
	
