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
	
	
	public int restarNumeros() {
		int resta = arrayDeEnteros[0];
		/*
			{10, 20, 30, 40, 50}
			 0   1   2   3   4
		*/
		//	{20, 30, 40, 50}
		for(int i=1; i < arrayDeEnteros.length; i++) {
			resta = resta - arrayDeEnteros[i];
			//1 	10 - 20
			//2		-10 - 30
			//3		-40 - 40
			//4		-80 - 50
			//5		No entra porque i no es menor a 5, ya vale 5 y que da como resultado -130
		}
		return resta;
	}

	public int sumarNumeros() {
		int suma = arrayDeEnteros[0];
		for(int i = 1; i < arrayDeEnteros.length; i++) {
			suma = suma + arrayDeEnteros[i];
		}
		
		return suma;
	}
	
	public int multiplicarNumeros() {
		int multiplicacion = arrayDeEnteros[0];
		for(int i = 1; i < arrayDeEnteros.length; i++) {
			multiplicacion = multiplicacion * arrayDeEnteros[i];
		}
		
		return multiplicacion;
	}
}


