package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	
	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}

	
	public double getMonto() {
	// Aplica un descuento del 10% de IVA sobre el precio base
		return super.getMonto() * 0.90;
	}
}
