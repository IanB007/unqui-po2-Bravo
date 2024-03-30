package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Counter {

	private ArrayList<Integer> numeros;
	
	//constructor
	public Counter() {
        numeros = new ArrayList<Integer>(); //inicializo la lista numeros.
    }
	
	//mensajes
	//Agrega un numero a la lista de numeros enteros creada.
	public void agregarNumero(int numero) {
		numeros.add(numero);
	}
	
	//Cuenta la cantidad de numeros pares de la lista de enteros creada.
	public int contarNumerosPares() {
		int cantNumerosPares = 0;
		for (int numero:numeros){
			if((numero % 2) == 0) {
				cantNumerosPares++;
			}
		}
		return cantNumerosPares;
	}
	
	//Cuenta la cantidad de numeros impares de la lista de enteros creada.
	public int contarNumerosImpares() {
		int cantNumerosImpares = 0;
		for (int numero: numeros) {
			if((numero % 2) != 0) {
				cantNumerosImpares++;
			}
		}
		return cantNumerosImpares;
	}
	
	//Cuenta la cantidad de numeros multiplos del numero dado.
	public int contarMultiplos(int numeroDado) {
		int cantMultiplos = 0;
		for(int numero:numeros) {
			if((numero % numeroDado) == 0) {
				cantMultiplos++;
			}
		}
		return cantMultiplos;
	}

	public int numeroConMasDigitosPares() {
		//uso div y mov
		//con div uso para sacar el numero evaluado, en un numero el de menor peso, el de la derecha del todo.
		//con mod veo si es par
		int numeroConMasDigitosParesActual = 0;
		int cantParesDeNumeroActual = 0;
		for (int numero:numeros) {
			int cantDigitosPares = cantidadDigitosPares(numero);
			//int numeroAEvaluar = numero;
			/*while (numeroAEvaluar != 0) {
				if((numeroAEvaluar % 2) == 0) {
					digitosPares++;
				}
				numeroAEvaluar = numeroAEvaluar / 10;
			}*/
			if (cantDigitosPares >  cantParesDeNumeroActual) {
				cantParesDeNumeroActual = cantDigitosPares;
				numeroConMasDigitosParesActual = numero;
			}
		}
		return numeroConMasDigitosParesActual;
	}
	
	//parte de numeroConMasDigitosPares
	public int cantidadDigitosPares(int numeroAEvaluar) {
		int digitosPares = 0;
		while (numeroAEvaluar != 0) {
			if((numeroAEvaluar % 2) == 0) {
				digitosPares++;
			}
			numeroAEvaluar = numeroAEvaluar / 10;
		}
		return digitosPares;
	}

	public int multiploMasAltoEntre0Y1000(int x, int y) {
		//condicion que no sea mayor a 1000 y que sea multiplo de x e y.
		ArrayList<Integer> multiplosDeX = obtenerMultiplos(x, 1000); 
		ArrayList<Integer> multiplosDeY = obtenerMultiplos(y, 1000);
		ArrayList<Integer> multiplosDeXeY= new ArrayList<Integer>();
		for(int numero:multiplosDeX) {
			if(multiplosDeY.contains(numero) && (numero > 0 && numero < 1000)){
					multiplosDeXeY.add(numero);
				}
		}
		//si esta vacia la lista es porque no encontro multiplos en comun o estas fuera de rango.
		if(multiplosDeXeY.isEmpty()) {
			multiplosDeXeY.add(-1);
		}
		return Collections.max(multiplosDeXeY); // devuelve el maximo del array.
	}

	private ArrayList<Integer> obtenerMultiplos(int x, int cantidadDeMultiplos) {
		ArrayList<Integer> multiplos = new ArrayList<Integer>();
		for (int i = 0; i < cantidadDeMultiplos ; i++) {
			multiplos.add(x * (i+1));
		}
		return multiplos;
	}
	
	
	
}
