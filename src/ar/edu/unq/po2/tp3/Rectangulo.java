package ar.edu.unq.po2.tp3;

import java.util.function.BooleanSupplier;

public class Rectangulo {

	//variables de instancia
	private Point esquinaInicial;
	private int alto;
	private int ancho;
	
	/*
	 * 
	 * 
	 */
	public Rectangulo(Point puntoInicial, int altura, int ancho) {
		if(altura == ancho) {
			//IllegalArgumentException se lanza cuando un método recibe un argumento ilegal o inapropiado. En este caso la altura y el ancho.
			 throw new IllegalArgumentException("La altura y el ancho no pueden ser iguales ya que es un rectangulo");
		}
		this.esquinaInicial = puntoInicial;
		this.alto = altura; // no hace falta el this porque tienen distinto nombre, en caso de que sean mismo nombre como en la linea 21, entonces ahi si deberia usar this.
		this.ancho = ancho;
	}

	public Point obtenerEsquinaInicial() {
		return esquinaInicial;
	}

	public int obtenerAlto() {
		return alto;
	}

	public int obtenerAncho() {
		return ancho;
	}

	public int obtenerArea() {
		return ancho * alto;
	}

	public int obtenerPerimetro() {
		
		return 2*(alto + ancho);
	}

	public boolean esHorizontal() {
		boolean esHorizontal = true;
		if (alto > ancho) {
			esHorizontal = false;
		}
		return esHorizontal;
	}
}
 