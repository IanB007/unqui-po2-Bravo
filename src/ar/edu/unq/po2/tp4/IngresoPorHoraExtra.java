package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoPorHoraExtra extends Ingreso{

	private int cantHorasExtras;
	
	public IngresoPorHoraExtra(LocalDate año, String concepto, Double monto, int cantHorasExtras) {
		super(concepto, año, monto);
		this.cantHorasExtras = cantHorasExtras;
	}

	public boolean esIngresoPorHoraExtra() {
		return true;
	}
}
