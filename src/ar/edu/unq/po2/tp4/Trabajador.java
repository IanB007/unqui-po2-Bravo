package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {

	private ArrayList<Ingreso> ingresosDelAño;
	
	public Trabajador() {
		ingresosDelAño = new ArrayList<Ingreso>();
	}
	
	public void agregareIngreso(Ingreso ingreso) {
		ingresosDelAño.add(ingreso);
	}
	
	//retornar el monto total percibido por el trabajador
	public double getTotalPercibido() {
		double total = 0;
		for(Ingreso ingreso : ingresosDelAño) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	//retornar el monto imponible al impuesto al trabajador
	public double getMontoImponible() {
		double totalImponible = 0;
		for(Ingreso ingreso : ingresosDelAño) {
			if(!ingreso.esIngresoPorHoraExtra()) {
				totalImponible += ingreso.getMonto();
			}
		}
		return totalImponible;
	}
	
	//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.2;
	}
}
