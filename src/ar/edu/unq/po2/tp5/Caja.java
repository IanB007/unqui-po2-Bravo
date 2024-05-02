package ar.edu.unq.po2.tp5;

import java.util.LinkedList;


public class Caja{
	/*
	 * CON MOCK:
	 * public double getMontoTotal() {
		return 0;
	};*/
	private LinkedList<Producto> productos;
	private LinkedList<Factura> facturas;
	private double montoTotal;
	private LinkedList<Factura> facturasPagadas;
	private Agencia agencia;
	
	public Caja(Agencia agencia) {
		productos = new LinkedList<Producto>();
		facturas = new LinkedList<Factura>();
		facturasPagadas = new LinkedList<Factura>();
		montoTotal = 0;
		this.agencia = agencia;
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
			this.notificarAgencia(factura);
		}
		return montoTotal;
	}

	public void addFactura(Factura factura) {
		facturas.add(factura);
	}

	public void notificarAgencia(Factura factura) {
		//facturasPagadas.add(factura);
		agencia.registrarPago(factura);
	}
	
	/*public boolean estaPagada(Factura factura) {
		return facturasPagadas.contains(factura);
	}*/
}
