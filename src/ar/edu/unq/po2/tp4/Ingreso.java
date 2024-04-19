package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class Ingreso {

	LocalDate añoDePercepcion;
	String concepto;
	Double montoPercibido;
	//getMonth()
	
	public Ingreso(String concepto, LocalDate año, Double monto) {
		añoDePercepcion = año;
		this.concepto = concepto;
		montoPercibido = monto;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public Double getMonto(){
		return montoPercibido;
	}
	
	public boolean esIngresoPorHoraExtra() {
		return false;
	}
	
}
