package ar.edu.unq.po2.supermercadotp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>(); //no olvidar la inicialización.
	}
	
	public void agregarProducto(Producto productoParaAgregar) {
		productos.add(productoParaAgregar);
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for(Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
}
