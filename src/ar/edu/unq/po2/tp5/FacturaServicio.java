package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {

	private String nombre;
	private double costo;
	private int cantidad;
	
	public FacturaServicio(String nombre, double costo, int cantidad) {
		this.nombre = nombre;
		this.costo = costo;
		this.cantidad = cantidad;
	}
	
	@Override
	public double getMontoTotal() {
		return this.costo * this.cantidad;
	}
	
}
