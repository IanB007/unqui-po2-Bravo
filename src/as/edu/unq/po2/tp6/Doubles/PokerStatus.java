package as.edu.unq.po2.tp6.Doubles;

import java.util.ArrayList;
import java.util.Arrays;

public class PokerStatus {
	//1
	//2
	//3
	//5
	//6
	//7
	//8
	//9
	//10
	//J
	//Q
	//K

	public boolean esPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		ArrayList<String> cartas = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		ArrayList<String> valores = getValores(cartas);
		
		for (String carta : valores) {
	        // Contar cuántas veces aparece la carta en la mano
	        int apariciones = this.contarApariciones(valores, carta); 
	        if (apariciones >= 4) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private ArrayList<String> getValores( ArrayList<String> cartas) {
		ArrayList<String> valores = new ArrayList<String>();
		for(String carta : cartas) {
			valores.add(carta.substring(0, carta.length() - 1)); //10D = 0, 2 = 10 ------- QD = 0, 1 = Q
		}
		return valores;
	}

	private int contarApariciones(ArrayList<String> cartas, String cartaAVerificar) {
		int apariciones = 0;
		for(String carta : cartas) {
			apariciones += unoSiCeroSino(carta.equals(cartaAVerificar));
		}
		return apariciones;
	}
	
	public int unoSiCeroSino(boolean condicion) {
		if(condicion == true) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
	
	/*colores:
	 *Rojo O Negro.
	 *Rojo: Corazones y diamantes ----> C y D
	 *Negro: Treboles y picas ----> T y P
	*/
	
	//Dependiendo el palo, me va a decir el color entonces.
	//Cuando las 5 cartas son del mismo color y palo, es decir, 5 de corazones, 5 de diamantes, 5 de treboles o 5 de pica.
	public boolean esColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
		ArrayList<String> cartas = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		ArrayList<String> palosDeCadaCarta = getPalos(cartas);
		for (String palo : palosDeCadaCarta) {
	        // Contar cuántas veces aparece la carta en la mano
	        int apariciones = this.contarApariciones(palosDeCadaCarta, palo); 
	        if (apariciones == 5) {
	            return true;
	        }
	    }
	    return false;
	}

	private ArrayList<String> getPalos(ArrayList<String> cartas) {
		ArrayList<String> palos = new ArrayList<String>();
		for(String carta : cartas) {
			palos.add(carta.substring(carta.length() - 1)); //ultima letra, es decir, el palo.
		}
		return palos;
	}
}
