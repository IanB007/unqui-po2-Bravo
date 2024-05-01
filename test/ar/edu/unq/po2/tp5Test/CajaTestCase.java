package ar.edu.unq.po2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Factura;
import ar.edu.unq.po2.tp5.FacturaImpuesto;
import ar.edu.unq.po2.tp5.FacturaServicio;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class CajaTestCase {

	private Caja caja1;
	private Producto producto1;
	private Producto producto2;
	private ProductoCooperativa producto3;
	private Factura facturaServicio;
	private Factura facturaImpuesto;
	
	@BeforeEach
	public void setUp() {
		LinkedList<Producto> productos = new LinkedList<Producto>();
		producto1 = new Producto("Dulce de leche", 2000, 28);
		producto2 = new Producto("Fideos", 1750, 45);
		producto3 = new ProductoCooperativa("Leche", 1400, 50);
		caja1 = new Caja();
		facturaServicio = new FacturaServicio("Game pass", 7000, 2);
		facturaImpuesto = new FacturaImpuesto("Luz", 5000, 18);
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
	
	@Test
	public void cajaConProductoCooperativoYReduccionDeStock() {
		caja1.addProducto(producto3);
		assertEquals(caja1.getTotal(), 1260);
		assertEquals(producto3.getStock(), 49);
	}
	
	@Test
	public void cajaConServicio(){
		caja1.addFactura(facturaServicio);
		assertEquals(caja1.getTotal(), 14000);
	}
	
	@Test
	public void cajaConServicios() {
		caja1.addFactura(facturaServicio);
		caja1.addFactura(facturaServicio);
		assertEquals(caja1.getTotal(), 28000);
	}
	
	@Test
	public void cajaConImpuesto(){
		caja1.addFactura(facturaImpuesto);
		assertEquals(caja1.getTotal(), 900);
	}
	
	@Test
	public void registrarPago(){
		caja1.addFactura(facturaImpuesto);
		caja1.registrarPago(facturaImpuesto);
		assertEquals(caja1.estaPagada(facturaImpuesto), true);
	}
	
}
