package ar.edu.unq.po2.tp5;

import java.util.LinkedList;

public class Caja {
	private LinkedList<Producto> productos;
	private double montoTotal;
	
	public Caja() {
		productos = new LinkedList<Producto>();
		montoTotal = 0;
	}
	
	public void addProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getTotal() {
		for(Producto producto : productos) {
			montoTotal += producto.getMonto();
		}
		
		return montoTotal;
	}
}
