package as.edu.unq.po2.tp6.Doubles;

import java.util.ArrayList;
import java.util.Arrays;

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
public class PokerStatus {

    public boolean esPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> cartas = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
        ArrayList<String> valores = getValores(cartas);

        for (String valor : valores) {
            int apariciones = this.contarApariciones(valores, valor);
            if (apariciones >= 4) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<String> getValores(ArrayList<Carta> cartas) {
        ArrayList<String> valores = new ArrayList<String>();
        for (Carta carta : cartas) {
            valores.add(carta.getValor());
        }
        return valores;
    }

    private int contarApariciones(ArrayList<String> cartas, String valorAVerificar) {
        int apariciones = 0;
        for (String carta : cartas) {
            apariciones += unoSiCeroSino(carta.equals(valorAVerificar));
        }
        return apariciones;
    }

    public int unoSiCeroSino(boolean condicion) {
        return condicion ? 1 : 0;
    }

    public boolean esColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> cartas = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
        ArrayList<String> palosDeCadaCarta = getPalos(cartas);
        for (String palo : palosDeCadaCarta) {
            int apariciones = this.contarApariciones(palosDeCadaCarta, palo);
            if (apariciones == 5) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<String> getPalos(ArrayList<Carta> cartas) {
        ArrayList<String> palos = new ArrayList<String>();
        for (Carta carta : cartas) {
            palos.add(carta.getPalo());
        }
        return palos;
    }

    public boolean esTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> cartas = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
        ArrayList<String> valores = getValores(cartas);

        for (String carta : valores) {
            int apariciones = this.contarApariciones(valores, carta);
            if (apariciones == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean esMayorQue(Carta carta1, Carta carta2) {
        return carta1.getValorNumerico() > carta2.getValorNumerico();
    }
}
