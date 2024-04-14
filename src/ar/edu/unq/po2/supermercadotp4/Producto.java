package ar.edu.unq.po2.supermercadotp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	//constructor1
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	//constructor2
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado(){
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double d) {
		precio = precio + d;
	}
}
