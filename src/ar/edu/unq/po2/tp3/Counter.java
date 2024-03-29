package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

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
			int digitosPares = 0;
			int numeroAEvaluar = numero;
			while (numeroAEvaluar != 0) {
				if((numeroAEvaluar % 2) == 0) {
					digitosPares++;
				}
				numeroAEvaluar = numeroAEvaluar / 10;
			}
			if (digitosPares >  cantParesDeNumeroActual) {
				cantParesDeNumeroActual = digitosPares;
				numeroConMasDigitosParesActual = numero;
			}
		}
		return numeroConMasDigitosParesActual;
	}
}
