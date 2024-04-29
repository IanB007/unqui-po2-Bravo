package ar.edu.unq.po2.tp5;

public class Producto {

	private String nombre;
	private double monto;
	private int stock; 
	
	public Producto(String nombre, double monto, int stock) {
		this.nombre = nombre;
		this.monto= monto;
		this.stock = stock;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public int getStock() {
		return stock;
	}

}
