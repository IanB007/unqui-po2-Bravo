package ar.edu.unq.po2.tp5;

import java.util.LinkedList;


public class Caja implements Agencia{
	private LinkedList<Producto> productos;
	private LinkedList<Factura> facturas;
	private double montoTotal;
	private LinkedList<Factura> facturasPagadas;
	
	public Caja() {
		productos = new LinkedList<Producto>();
		facturas = new LinkedList<Factura>();
		facturasPagadas = new LinkedList<Factura>();
		montoTotal = 0;
	}
	
	public void addProducto(Producto producto) {
		productos.add(producto);
		producto.reducirStock();
	}
	
	public double getTotal() {
		for(Producto producto : productos) {
			montoTotal += producto.getMonto();
		}
		for(Factura factura : facturas) {
			montoTotal += factura.getMontoTotal();
			this.registrarPago(factura);
		}
		return montoTotal;
	}

	public void addFactura(Factura factura) {
		facturas.add(factura);
	}

	public void registrarPago(Factura factura) {
		facturasPagadas.add(factura);
	}
	
	public boolean estaPagada(Factura factura) {
		return facturasPagadas.contains(factura);
	}
}
