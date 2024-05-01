package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {

	private String nombre;
	private double costo;
	private double tasaServicio;
	
	public FacturaImpuesto(String nombre, double costo, double tasaServicio) {
		this.nombre= nombre;
		this.costo = costo;
		this.tasaServicio = tasaServicio;
	}
	
	@Override
	public double getMontoTotal() {
		return costo * (tasaServicio / 100);
	}

	
}
