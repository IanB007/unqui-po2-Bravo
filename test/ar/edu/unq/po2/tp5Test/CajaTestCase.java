package ar.edu.unq.po2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class CajaTestCase {

	private Caja caja1;
	private Producto producto1;
	private Producto producto2;
	private ProductoCooperativa producto3;
	
	@BeforeEach
	public void setUp() {
		LinkedList<Producto> productos = new LinkedList<Producto>();
		producto1 = new Producto("Dulce de leche", 2000, 28);
		producto2 = new Producto("Fideos", 1750, 45);
		producto3 = new ProductoCooperativa("Leche", 1400, 50);
		caja1 = new Caja();
	}
	
	@Test
	public void cajaSinProductos() {
		assertEquals(caja1.getTotal(), 0);
	}
	
	@Test
	public void cajaConProducto() {
		caja1.addProducto(producto1);
		assertEquals(caja1.getTotal(), 2000);
	}
	
	@Test
	public void cajaConProductos() {
		caja1.addProducto(producto1);
		caja1.addProducto(producto2);
		assertEquals(caja1.getTotal(), 3750);
	}
	
	@Test
	public void cajaConProductoCooperativo() {
		caja1.addProducto(producto3);
		assertEquals(caja1.getTotal(), 1260);
	}
}
