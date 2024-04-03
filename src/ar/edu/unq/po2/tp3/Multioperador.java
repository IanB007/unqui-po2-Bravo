package ar.edu.unq.po2.tp3;

import java.util.Iterator;

public class Multioperador {

	//variables de instancia
	private int[] arrayDeEnteros;
	
	//constructor
	public Multioperador(int dimension) {
		//crea un array de enteros de la dimension dada.
		//se reservas espacio de memoria para la cantidad de enteros dada
		
		this.arrayDeEnteros = new int [dimension];
	}
	
	//agrega numeros al array de enteros creado.
	//se pasan de la siguiente forma: {n1, n2, n3, n4 ... nx}
	public void agregarNumeros (int[] numeros) {
		for (int i = 0; i < arrayDeEnteros.length; i++) {
			arrayDeEnteros[i] = numeros[i];
		}
	}

	public int dimension() {
		return arrayDeEnteros.length;
	}
}
