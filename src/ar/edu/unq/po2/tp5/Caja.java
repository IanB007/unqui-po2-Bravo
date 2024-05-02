package ar.edu.unq.po2.tp5;

import java.util.LinkedList;

//NOTA: AL USAR MOCK EN LOS TEST CON AGENCIA, NO HACE FALTA IMPLEMENTARLA YA QUE NO IMPLEMENTO SUS METODOS, SOLAMENTE SE QUE ESTAN AHI Y QUE HACEN, ES DECIR, OBSERVO.
//LA IMPLEMENTACION COMO TAL LO HARA O UNA CLASE AGENCIA O ALGO, POR EJEMPLO AFIP.
public class Caja{
	/*
	 * CON MOCK EN CASO DE NO TENER LOS METODOS IMPLEMENTADOS TODAVIA:
	 * public double getMontoTotal() {
		return 0;
	};*/
	private LinkedList<Producto> productos;
	private LinkedList<Factura> facturas;
	private double montoTotal;
	private LinkedList<Factura> facturasPagadas;
	private Agencia agencia;//creo una variable de tipo Agencia.
	
	public Caja(Agencia agencia) {
		productos = new LinkedList<Producto>();
		facturas = new LinkedList<Factura>();
		facturasPagadas = new LinkedList<Factura>();
		montoTotal = 0;
		this.agencia = agencia; //Le pongo la agencia dada.
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

	//Le notificamos a la agencia sobre la factura.
	public void notificarAgencia(Factura factura) {
		//facturasPagadas.add(factura), en caso de crear la clase agencia, la misma clase AgenciaNotificada implementa la interfaz Agencia y tiene este metodo;
		agencia.registrarPago(factura);
	}
	
	/*Este metodo lo tendria al clase AgenciaNotificada en caso de crearla.
	 * public boolean estaPagada(Factura factura) {
		return facturasPagadas.contains(factura);
	}*/
}
