package ar.edu.unq.po2.supermercadotp4;

//uso extend porque es un producto pero de primera necesidad, entiendo que es un derivado de la clase producto.
public class ProductoPrimeraNecesidad extends Producto{
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	
	//Se crea el constructor con los parametros a pasar a la super y aparte se agrega el descuento al mismo.
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.precio = this.precio * descuento;
	}
}
