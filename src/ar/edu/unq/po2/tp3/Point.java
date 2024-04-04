package ar.edu.unq.po2.tp3;

public class Point {
	//variables de instancia
	private double x;
	private double y;
	
	//constructor
	public Point() {
		x = 0;
		y = 0;
	}
	//constructor
	public Point(double x, double y) {
		this.x = x;
		// x = x;
		this.y = y;
		//y=y;
	}
	
	
	public String obtenerCoordenadas() {
		return "(" + x + y + ")";
	}
	
	public double getY() {	
		return y;
	}
	
	public double getX() {
		return x;
	}
	
	public void moverAPunto(Point nuevoPunto) {
		this.x = nuevoPunto.getX();
		this.y = nuevoPunto.getY();
	}
	public void sumarConPunto(Point nuevoPunto) {
		//podria ser this.x = x + nuevoPunto.getX();????
		x = x + nuevoPunto.getX();
		//podria ser this.y = y + nuevoPunto.getY();????
		y = y + nuevoPunto.getY();
	}
	
}
